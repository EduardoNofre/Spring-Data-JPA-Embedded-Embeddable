package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = " MICRO SERVICE PROJECTION ", version = "1.0",description = " ESTUDO RAPIDO "))
public class SpringDataJpaEmbeddedEmbeddableApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaEmbeddedEmbeddableApplication.class, args);
	}
}
