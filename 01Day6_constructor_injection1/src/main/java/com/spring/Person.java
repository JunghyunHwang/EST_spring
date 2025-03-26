package com.spring;

public class Person {
	private String name;
	
	public Person() {
		System.out.println("Generate Person");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
