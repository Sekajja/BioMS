package com.pacemaker.web;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pacemaker.domain.AventorUser;
import com.pacemaker.service.AventorUserService;

@Controller
public class AccessController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccessController.class);
	
	@Autowired
	AventorUserService aventorUserService;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String userRegistrationPage(@ModelAttribute AventorUser aventorUser, Model model){
		aventorUser.setGender("Male");
		model.addAttribute("AventorUser", aventorUser);
		return "Register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String userRegistrationSave(@ModelAttribute @Valid AventorUser aventorUser, BindingResult result ,Model model){
		
		if (result.hasErrors()) {
			logger.info("Errors found Processing Project User Form");
			model.addAttribute("aventorUser", aventorUser);
			return "Register";
		}
		
		model.addAttribute("aventorUser", aventorUser);
		aventorUserService.createNewAventorUser(aventorUser);
		
		return "Index";
	}
}
