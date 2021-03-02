package com.Test1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Employee extends Person{
	double salary;
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
		
	
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}

	
	
}
