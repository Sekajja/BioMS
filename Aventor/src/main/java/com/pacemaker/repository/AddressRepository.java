package com.pacemaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pacemaker.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
