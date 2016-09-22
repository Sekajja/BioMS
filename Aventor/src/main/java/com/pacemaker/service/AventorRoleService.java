package com.pacemaker.service;

import java.util.List;

import com.pacemaker.domain.AventorRole;


public interface AventorRoleService {

	public List<AventorRole> findAventorRoleByUsers_Username(String username);
}
