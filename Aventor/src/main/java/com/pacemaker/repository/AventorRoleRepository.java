package com.pacemaker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pacemaker.domain.AventorRole;

@Repository
public interface AventorRoleRepository extends JpaRepository<AventorRole, Long>{

	public List<AventorRole> findAventorRoleByUsers_Username(String username);
}
