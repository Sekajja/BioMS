package com.pacemaker.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacemaker.domain.Address;
import com.pacemaker.repository.AddressRepository;
import com.pacemaker.service.AddressService;

@Service("addressService")
@Transactional
public class AddressServiceImplementation implements AddressService{

	@Autowired
	AddressRepository addressRepository;
	
	@Override
	public void createNewAddress(Address address) {
		
		addressRepository.saveAndFlush(address);
	}

	@Override
	public List<Address> getAllAddresses() {
		
		return addressRepository.findAll();
	}

	@Override
	public Address getAddress(Long Id) {
		
		return addressRepository.getOne(Id);
	}

	@Override
	public void updateAddress(Address address) {
		
		addressRepository.saveAndFlush(address);
	}

	@Override
	public void deleteAddress(Long Id) {
		
		addressRepository.delete(Id);
		
	}

	
}
