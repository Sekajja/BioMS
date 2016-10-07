package com.pacemaker.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pacemaker.domain.BioData;
import com.pacemaker.service.BioDataService;

@Controller
public class BiodataController {
	
	private static final Logger logger = LoggerFactory.getLogger(BiodataController.class);
	
	@Autowired
	BioDataService bioDataService;
	
	@RequestMapping(value="/biodata/new", method=RequestMethod.GET)
	public String getNewEntryPage(BioData biodata, Model model){
		
		biodata.setGender("Male");
		model.addAttribute("biodata", biodata);
		
		return "BioData/NewBiodata";
	}
	

	@RequestMapping(value="/biodata/entry/new", method=RequestMethod.POST)
	public String createNewEntry(@ModelAttribute BioData biodata, BindingResult result, Model model){
		
		if (result.hasErrors()) {
			return "BioData/NewBiodata";
	    }
				
		bioDataService.createNewBioData(biodata);
		model.addAttribute("biodata", biodata);
		logger.info("BioMSlog: A new Bio-data entry belonging to "+biodata.getFirstname()+", "+biodata.getLastname()+" has been made.");
		
		return "BioData/ShowBiodata";
	}
	
	@RequestMapping(value="/biodata/entry/{id}/edit", method=RequestMethod.GET)
	public String editEntryPage(BioData biodata, Model model, @PathVariable long id){
		
		biodata = bioDataService.getBioData(id);
		model.addAttribute("biodata", biodata);
		
		return "BioData/EditBiodata";
	}
	
	@RequestMapping(value="/biodata/entry/{id}/edit", method=RequestMethod.POST)
	public String editEntry(@ModelAttribute BioData biodata, BindingResult result, Model model, @PathVariable long id){
		
		if (result.hasErrors()) {
			return "BioData/NewBiodata";
	    }
		
		bioDataService.updateBioData(biodata);
		model.addAttribute("biodata", biodata);
		
		return "BioData/ShowBiodata";
	}
	
	@RequestMapping(value="/biodata/entry/{id}/delete", method=RequestMethod.GET)
	public String deleteEntry(@PathVariable long id, Model model){
		
		
		bioDataService.deleteBioData(id);
		
		List<BioData> entries  = bioDataService.getAllBioData();
		model.addAttribute("entries", entries);
		
		return "BioData/ViewBiodata";
	}
	
	@RequestMapping(value="/biodata/view", method=RequestMethod.GET)
	public String viewEntries(Model model){
		
		
		List<BioData> entries  = bioDataService.getAllBioData();
		model.addAttribute("entries", entries);
		
		return "BioData/ViewBiodata";
	}
	
	@RequestMapping(value="/biodata/entry/{id}/show", method=RequestMethod.GET)
	public String showEntry(BioData biodata, Model model, @PathVariable long id){
		
		
		biodata = bioDataService.getBioData(id);
		model.addAttribute("biodata", biodata);
		
		return "BioData/ShowBiodata";
	}
	
	
	
}
