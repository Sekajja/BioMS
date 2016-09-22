package com.pacemaker.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacemaker.domain.LearningInstitution;
import com.pacemaker.repository.LearningInstitutionRepository;
import com.pacemaker.service.LearningInstitutionService;

@Service("learningInstitutionService")
@Transactional
public class LearningInstitutionServiceImplementation implements LearningInstitutionService {

	@Autowired
	LearningInstitutionRepository learningInstitutionRepository;
	
	@Override
	public void createNewLearningInstitution(LearningInstitution LearningInstitution) {
		
		learningInstitutionRepository.saveAndFlush(LearningInstitution);
	}

	@Override
	public List<LearningInstitution> getAllLearningInstitutions() {
		
		return learningInstitutionRepository.findAll();
	}

	@Override
	public LearningInstitution getLearningInstitution(Long Id) {
		
		return learningInstitutionRepository.getOne(Id);
	}

	@Override
	public void updateLearningInstitution(LearningInstitution LearningInstitution) {
		
		learningInstitutionRepository.saveAndFlush(LearningInstitution);
		
	}

	@Override
	public void deleteLearningInstitution(Long Id) {
		
		learningInstitutionRepository.delete(Id);
		
	}

}
