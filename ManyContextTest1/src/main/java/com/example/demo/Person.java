package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Person {
	
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setting name");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("setting age");
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "] "
				+ " hashcode" +hashCode();
	}
	public Person() {
		System.out.println("in person default constructor");
		this.name="nishant";
		this.age=20;
	}
	public Person(String name, int age) {

		System.out.println("in person parameterized constructor");
		this.name = name;
		this.age = age;
	}
	
	
	
}
