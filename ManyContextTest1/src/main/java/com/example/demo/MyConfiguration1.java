package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


public class MyConfiguration1 {
	@Bean
	public Person person() {
		return new Person("rishabh",40);
	}
}
