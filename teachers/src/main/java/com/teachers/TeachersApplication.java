package com.teachers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.teachers")
@EnableJpaRepositories(
		basePackages = "com.teachers.repository")
@EntityScan(basePackages = "com.teachers.entity")
@SpringBootApplication
public class TeachersApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachersApplication.class, args);
	}

}
