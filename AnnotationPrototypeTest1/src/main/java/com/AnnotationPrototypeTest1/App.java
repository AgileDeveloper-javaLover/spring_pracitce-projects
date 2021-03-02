package com.AnnotationPrototypeTest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext con=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Student s1 = (Student)con.getBean("stu");

		System.out.println(s1.roll);
		
		Student s2=(Student)con.getBean("stu");
		System.out.println(s2==s1);
		
		Boy b1=(Boy)con.getBean("boy");
		
		
		Boy b2=(Boy)con.getBean("boy");
		
		System.out.println(b1==b2);
		
		
		System.out.println(s1.getBoy().hashCode());
		System.out.println(s1.getBoy().hashCode());
		System.out.println(s1.getBoy().hashCode());
		
		System.out.println(s1);

	}
}
