package com.pacemaker.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface AventorUserDetailsService extends UserDetailsService {

		
	@Override
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
