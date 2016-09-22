package com.pacemaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.pacemaker.repository")
@EntityScan(basePackages = "com.pacemaker.domain")
public class AventorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AventorApplication.class, args);
	}
}
