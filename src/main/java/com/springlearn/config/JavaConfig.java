package com.springlearn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	
	@Bean
	
	public Student getStudent() {
		
		
		return new Student();
	}
}
