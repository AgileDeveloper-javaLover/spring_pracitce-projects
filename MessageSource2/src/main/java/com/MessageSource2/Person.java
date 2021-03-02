package com.MessageSource2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("${name}")
//	@Value("#{'${name}'}")
	String name;
	
	@Value("#{1}")
	int roll;
	
	public Person() {
		System.out.println("in constructor");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", roll=" + roll + "]";
	}
	
	
}
