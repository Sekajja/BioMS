package com.pacemaker.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacemaker.domain.Kin;
import com.pacemaker.repository.KinRepository;
import com.pacemaker.service.KinService;

@Service("kinService")
@Transactional
public class KinServiceImplementation implements KinService {

	@Autowired
	KinRepository kinRepository;
	
	@Override
	public void createNewKin(Kin kin) {
		
		kinRepository.saveAndFlush(kin);
	}

	@Override
	public List<Kin> getAllKins() {
		
		return kinRepository.findAll();
	}

	@Override
	public Kin getKin(Long Id) {
		
		return kinRepository.getOne(Id);
	}

	@Override
	public void updateKin(Kin kin) {
		
		kinRepository.saveAndFlush(kin);
	}

	@Override
	public void deleteKin(Long Id) {
		
		kinRepository.delete(Id);
	}

}
