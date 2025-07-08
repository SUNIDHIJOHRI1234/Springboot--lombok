package com.example.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLombokApplication {

	public static void main(String[] args) {
		// Correct way to run the Spring Boot application
		SpringApplication.run(SpringBootLombokApplication.class, args);

		// Testing a simple Student class
		Student student = new Student(1, "sheena");
		System.out.println(student.getId());
		System.out.println(student.getName());
	}
}
