package com.pacemaker.service;

import java.util.List;

import com.pacemaker.domain.Kin;

public interface KinService {
	
	public void createNewKin(Kin Kin);
	
	public List<Kin> getAllKins();
	
	public Kin getKin(Long Id);
	
	public void updateKin(Kin kin);
	
	public void deleteKin(Long Id);
}
