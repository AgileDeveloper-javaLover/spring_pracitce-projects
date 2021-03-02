package com.AnnotationPrototypeTest1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {
	
	
	@Bean("boy")
	@Scope("prototype")
	public Boy createBoy() {
		return new Boy();
	}
	
	@Bean("stu")
	public Student createStudent() {
		return new Student();
	}
	
	
	
}
