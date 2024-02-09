package com.spring.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DzoneBatchProcessApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DzoneBatchProcessApplication.class, args);
	}

}
