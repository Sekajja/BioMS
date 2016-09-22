package com.pacemaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.pacemaker.service.AventorRoleService;
import com.pacemaker.service.AventorUserService;
import com.pacemaker.service.implementation.AventorUserDetailsServiceImplementation;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class AventorSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	HikariDataSource dataSource;
	
	@Autowired
	AventorUserService aventorUserService;
	
	@Autowired
	AventorRoleService aventorRoleService;
	
	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		super.configure(auth);	
		
		auth
			.userDetailsService(new AventorUserDetailsServiceImplementation(aventorUserService, aventorRoleService));
		
		
		
			/*auth
				.jdbcAuthentication()
					.dataSource(dataSource)
					.usersByUsernameQuery("SELECT username, password, enabled FROM aventor_user WHERE username=?")
					.authoritiesByUsernameQuery("SELECT u.username, r.rolename FROM aventor_user u, aventor_role r, aventor_user_role ur WHERE u.id = ur.users_id AND ur.role_id = r.id AND u.username = ?");
			*/		
		
	}

	@Override	
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);//Remove this if antMatchers aren't working
		http 
			.authorizeRequests()		
				.antMatchers("/register", "/css/**", "/js/**", "/about", "webjars/**").permitAll()		
				.anyRequest().authenticated()				
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.and();
			
	}
	
	
	
	
	
	
}
