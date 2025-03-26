package com.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private String name;
	private int age;
	
	public Student() {
		System.out.println("Student default constructor");
	}

	// <context:annotationConfig 해야함
	@PostConstruct
	public void aaa() {
		System.out.println("init-method.aaa");
	}
	
	@PreDestroy
	public void bbb() {
		System.out.println("destory-method.bbb");
	}
	
	public void getInfo() {
		System.out.println("getInfo()=====");
	}
}
