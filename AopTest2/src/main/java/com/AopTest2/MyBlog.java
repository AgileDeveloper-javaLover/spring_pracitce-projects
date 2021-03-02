package com.AopTest2;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;


public interface MyBlog {
	
	public void showBlog();
	
	public void showBlog(int a);
}
