package com.pacemaker.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacemaker.domain.AventorUser;
import com.pacemaker.repository.AventorUserRepository;
import com.pacemaker.service.AventorUserService;

@Service
@Transactional
public class AventorUserServiceImplementation implements AventorUserService {

	@Autowired
	AventorUserRepository aventorUserRepository;
	
	@Override
	public AventorUser findAventorUserByUsername(String username) {
		
		return aventorUserRepository.findAventorUserByUsername(username);
	}

	@Override
	public void createNewAventorUser(AventorUser aventorUser) {
		
		aventorUserRepository.saveAndFlush(aventorUser);
	}

	@Override
	public List<AventorUser> getAventorUsers() {
		
		return aventorUserRepository.findAll();
	}

	@Override
	public AventorUser getAventorUser(Long id) {
		
		return aventorUserRepository.findOne(id);
	}

	@Override
	public void updateAventorUser(AventorUser aventorUser) {
		
		aventorUserRepository.saveAndFlush(aventorUser);
	}

	@Override
	public void deleteAventorUser(Long id) {		
		aventorUserRepository.delete(id);
	}

}
