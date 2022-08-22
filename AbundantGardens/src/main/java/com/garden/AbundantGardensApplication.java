package com.garden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
// @EntityScan(basePackages = {"com.garden.model", "com.garden.repository", "com.garden.controller", "com.garden.service"})
// @EnableJpaRepositories("com.garden.repository")
public class AbundantGardensApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AbundantGardensApplication.class, args);
	}

	// Here's where the rest part goes, I don't know if we need it yet
	// but I'll keep it here as a place holder
//	@Bean
//	public RestTemplate restTemplate() {
//		return null;
//	}
	
} // AbundantGardensApplication()
