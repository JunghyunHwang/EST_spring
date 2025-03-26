package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	@Value("${value.name}")
	private String name;
	
	 @Value("${value.age}")
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
