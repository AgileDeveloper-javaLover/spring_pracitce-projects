package com.AopTest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
        
        MyBlogService b=con.getBean("blog",MyBlogService.class);
        
        b.showBlog();
        b.showBlog(3);
        
        
        Test t=con.getBean("test",Test.class);
    }
}
