package com.gardens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AbundantGardensApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbundantGardensApplication.class, args);
	}

}
