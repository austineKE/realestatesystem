package com.project.v1.realestatesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RealestatesystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealestatesystemApplication.class, args);
	}

}
