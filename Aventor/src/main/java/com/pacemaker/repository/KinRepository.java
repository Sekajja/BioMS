package com.pacemaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pacemaker.domain.Kin;

@Repository
public interface KinRepository extends JpaRepository<Kin, Long>{
	
}
