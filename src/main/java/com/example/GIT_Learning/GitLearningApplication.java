package com.example.GIT_Learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitLearningApplication {

	public static void main(String[] args) {
		System.out.println("My application");
		System.out.println("Branch1 - I always wonder");
		System.out.println("Its over");
		SpringApplication.run(GitLearningApplication.class, args);
	}
	
}
