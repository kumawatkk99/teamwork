package com.team3.trainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController

@SpringBootApplication
public class TrainerServiceApplication {
	
	
	@GetMapping("/message")
	public String getMessage() {
		return "Working...!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(TrainerServiceApplication.class, args);

	}

}
