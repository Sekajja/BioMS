package com.pacemaker;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AventorMVC extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		super.addViewControllers(registry);		
		registry.addViewController("/login").setViewName("Login");
		registry.addViewController("/about").setViewName("About");
		//registry.addViewController("/biodata/new").setViewName("BioData/NewBiodata");
		
	}

	
}
