package com.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	private String name;
	private int age;
	
	public Student() {
		System.out.println("Student default constructor");
	}
	
//	public void aaa() {
//		System.out.println("init-method.aaa");
//	}
//	
//	public void bbb() {
//		System.out.println("destory-method.bbb");
//	}
	
	public void getInfo() {
		System.out.println("getInfo()=====");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is init()");
	}
}
