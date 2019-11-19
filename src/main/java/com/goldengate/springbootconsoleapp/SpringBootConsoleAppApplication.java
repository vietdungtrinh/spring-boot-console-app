package com.goldengate.springbootconsoleapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringBootConsoleAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConsoleAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Hello World!!!");
	}
}
