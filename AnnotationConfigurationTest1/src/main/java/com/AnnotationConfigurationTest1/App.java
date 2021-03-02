package com.AnnotationConfigurationTest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new AnnotationConfigApplicationContext(MyConfiguration.class);
        
        Person p1=con.getBean("person",Person.class);
        System.out.println(p1.hashCode());
        Person p2=con.getBean("person1",Person.class);
        System.out.println(p2.hashCode());
        
    }
}
