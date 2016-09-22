package com.pacemaker.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacemaker.domain.BioData;
import com.pacemaker.repository.BioDataRepository;
import com.pacemaker.service.BioDataService;

@Service("bioDataService")
@Transactional
public class BioDataServiceImplementation implements BioDataService {

	@Autowired
	BioDataRepository bioDataRepository;
	
	
	@Override
	public BioData findBioDataByFirstnameAndLastname(String firstname, String lastname) {
		
		return bioDataRepository.findBioDataByFirstnameAndLastname(firstname, lastname);
	}

	@Override
	public void createNewBioData(BioData bioData) {
		
		bioDataRepository.saveAndFlush(bioData);
	}

	@Override
	public List<BioData> getAllBioData() {
		
		return bioDataRepository.findAll();
	}

	@Override
	public BioData getBioData(Long Id) {
		
		return bioDataRepository.getOne(Id);
	}

	@Override
	public void updateBioData(BioData bioData) {
		
		bioDataRepository.saveAndFlush(bioData);
	}

	@Override
	public void deleteBioData(Long Id) {
		
		bioDataRepository.delete(Id);
	}

}
