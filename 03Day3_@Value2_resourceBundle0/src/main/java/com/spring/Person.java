package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	// @Value("홍길동")
	private String name;
	
	// @Value("10")
	private int age;
	
	public Person() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
