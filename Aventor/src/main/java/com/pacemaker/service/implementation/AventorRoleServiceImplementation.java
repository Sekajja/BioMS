package com.pacemaker.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacemaker.domain.AventorRole;
import com.pacemaker.repository.AventorRoleRepository;
import com.pacemaker.service.AventorRoleService;

@Service
@Transactional
public class AventorRoleServiceImplementation implements AventorRoleService {

	@Autowired
	AventorRoleRepository aventorRoleRepository;
	
	@Override
	public List<AventorRole> findAventorRoleByUsers_Username(String username) {
		
		return aventorRoleRepository.findAventorRoleByUsers_Username(username);
	}

}
