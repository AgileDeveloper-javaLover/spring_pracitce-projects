package com.AnnotationPrototypeTest1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Boy {
	
	@Value("nishant")
	String name;
	@Value("#{20}")
	int age;

	public Boy() {
		System.out.println("in boy constructor");
	}
	
	
}
