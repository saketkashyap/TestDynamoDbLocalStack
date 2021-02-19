package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class TestDynamoDbLocalStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDynamoDbLocalStackApplication.class, args);
		log.info("app started");
	}

}
