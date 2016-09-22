package com.pacemaker.service;

import java.util.List;

import com.pacemaker.domain.LearningInstitution;

public interface LearningInstitutionService {
	
	public void createNewLearningInstitution(LearningInstitution LearningInstitution);
	
	public List<LearningInstitution> getAllLearningInstitutions();
	
	public LearningInstitution getLearningInstitution(Long Id);
	
	public void updateLearningInstitution(LearningInstitution LearningInstitution);
	
	public void deleteLearningInstitution(Long Id);
}
