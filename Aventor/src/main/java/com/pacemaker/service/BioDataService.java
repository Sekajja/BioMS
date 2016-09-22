package com.pacemaker.service;

import java.util.List;

import com.pacemaker.domain.BioData;

public interface BioDataService {
	
	public BioData findBioDataByFirstnameAndLastname(String firstname, String lastname);
	
	public void createNewBioData(BioData bioData);
	
	public List<BioData> getAllBioData();
	
	public BioData getBioData(Long Id);
	
	public void updateBioData(BioData bioData);
	
	public void deleteBioData(Long Id);
}