package com.eventverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class EventverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventverseApplication.class, args);
	}
}
