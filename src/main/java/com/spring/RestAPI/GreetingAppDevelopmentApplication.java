package com.spring.RestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Ensures all sub-packages are scanned
public class GreetingAppDevelopmentApplication {
	public static void main(String[] args) {
		SpringApplication.run(GreetingAppDevelopmentApplication.class, args);
	}
}
