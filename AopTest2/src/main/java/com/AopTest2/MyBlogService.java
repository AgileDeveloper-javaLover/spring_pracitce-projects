package com.AopTest2;

import org.springframework.stereotype.Component;

@Component("blog")
public class MyBlogService implements MyBlog{
	public void showBlog() {
		System.out.println("in blog first");
	}

	public void showBlog(int a) {
		System.out.println("in blog second");
	}

}
