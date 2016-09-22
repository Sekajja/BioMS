package com.pacemaker.service;

import java.util.List;

import com.pacemaker.domain.Address;

public interface AddressService {

	public void createNewAddress(Address address);
	
	public List<Address> getAllAddresses();
	
	public Address getAddress(Long Id);
	
	public void updateAddress(Address address);
	
	public void deleteAddress(Long Id);
}
