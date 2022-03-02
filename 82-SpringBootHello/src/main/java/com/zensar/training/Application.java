package com.zensar.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.zensar.training" }) // map to rest package//scan all package
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
