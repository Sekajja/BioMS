package com.pacemaker.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.pacemaker.domain.AventorRole;
import com.pacemaker.domain.AventorUser;
import com.pacemaker.service.AventorRoleService;
import com.pacemaker.service.AventorUserDetailsService;
import com.pacemaker.service.AventorUserService;

public class AventorUserDetailsServiceImplementation implements AventorUserDetailsService {

	@Autowired
	AventorUserService aventorUserService;
	
	@Autowired
	AventorRoleService aventorRoleService;
	
	
	
	public AventorUserDetailsServiceImplementation() {
		super();
		
	}



	public AventorUserDetailsServiceImplementation(AventorUserService aventorUserService,
			AventorRoleService aventorRoleService) {
		super();
		this.aventorUserService = aventorUserService;
		this.aventorRoleService = aventorRoleService;
	}



	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		AventorUser user = aventorUserService.findAventorUserByUsername(username);
		List<AventorRole> roles = aventorRoleService.findAventorRoleByUsers_Username(username);
		
		
		return new User(user.getUsername(), user.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList(roles.toString()));
		
	}

}
