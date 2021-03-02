package com.AnnotationPrototypeTest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	
	@Value("#{1}")
	int roll;
	
	@Autowired
	private Boy boy;

	public Student() {
		System.out.println("in student constructor");
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + boy.name +" agr="+ boy.age+"]";
	}
	
	@Lookup
	public Boy getBoy() {
		return boy;
	}

	public void setBoy(Boy boy) {
		this.boy = boy;
	}

	

	
	
}
