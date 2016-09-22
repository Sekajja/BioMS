package com.pacemaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pacemaker.domain.LearningInstitution;

@Repository
public interface LearningInstitutionRepository extends JpaRepository<LearningInstitution, Long>{

	
}
