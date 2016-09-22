package com.pacemaker.service;

import java.util.List;

import com.pacemaker.domain.AventorUser;


public interface AventorUserService {

	public AventorUser findAventorUserByUsername(String username);
	
	public void createNewAventorUser(AventorUser aventorUser);

	public List<AventorUser> getAventorUsers();

	public AventorUser getAventorUser(Long id);

	public void updateAventorUser(AventorUser aventorUser);

	public void deleteAventorUser(Long id);
	
}
