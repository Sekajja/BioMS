package com.pacemaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pacemaker.domain.AventorUser;

@Repository
public interface AventorUserRepository extends JpaRepository<AventorUser, Long>{

	public AventorUser findAventorUserByUsername(String username);	
	
}
