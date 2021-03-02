package com.AopTest1;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;


public class Test implements MyBlog {
	public void showBlog() {
		System.out.println("in blog first test");
	}

	public void showBlog(int a) {
		System.out.println("in blog second test");
	}

}
