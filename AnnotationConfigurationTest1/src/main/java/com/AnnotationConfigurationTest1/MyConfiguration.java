package com.AnnotationConfigurationTest1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean
	public Person person() {
		return new Person();
	}
	
	@Bean
	public Person person1() {
		return new Person();
	}
}
