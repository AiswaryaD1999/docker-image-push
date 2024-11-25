package com.example.spring_boot_docker_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerMavenApplication {

	@GetMapping("/message")
	public String message(){
		return "Hello World from SpringBootDockerMavenApplication";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerMavenApplication.class, args);
	}

}
