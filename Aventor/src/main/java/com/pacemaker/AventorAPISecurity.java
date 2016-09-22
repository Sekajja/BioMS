package com.pacemaker;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.pacemaker.domain.AventorRole;

@Configuration
@Order(1)
public class AventorAPISecurity extends WebSecurityConfigurerAdapter {

				
	@Override	
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);//Remove this if antMatchers aren't working
		http 
			.antMatcher("/api/**")	
				.authorizeRequests()
				.anyRequest().hasAnyAuthority(AventorRole.AdministratorRole,AventorRole.SystemAdministratorRole)			
				.and()
				.httpBasic();			
	}
	
	
	
	
	
	
}
