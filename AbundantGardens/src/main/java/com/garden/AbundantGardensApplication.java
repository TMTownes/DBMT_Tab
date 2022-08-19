package com.garden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AbundantGardensApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbundantGardensApplication.class, args);
	}

	// Here's where the rest part goes, I don't know if we need it yet
	// but I'll keep it here as a place holder
	@Bean
	public RestTemplate restTemplate() {
		return null;
	}
} // AbundantGardensApplication()
