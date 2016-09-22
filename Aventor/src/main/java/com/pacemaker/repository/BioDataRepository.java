package com.pacemaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacemaker.domain.BioData;

public interface BioDataRepository extends JpaRepository<BioData, Long>{

	public BioData findBioDataByFirstnameAndLastname(String firstname, String lastname);
}
