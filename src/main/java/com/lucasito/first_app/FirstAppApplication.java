package com.lucasito.first_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
	}

}
