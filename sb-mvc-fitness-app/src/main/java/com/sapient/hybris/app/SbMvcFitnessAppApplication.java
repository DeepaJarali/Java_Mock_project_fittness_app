package com.sapient.hybris.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sapient")
public class SbMvcFitnessAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMvcFitnessAppApplication.class, args);
	}

}