package com.spring;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
		System.out.printf("name: %s\n", name);
	}
	
	public Person(String name, String age) {
		System.out.printf("x: %s, y: %s\n", name, age);
	}
	
	public Person(String xx, int yy) {
		System.out.printf("xx: %s, yy: %s\n", xx, yy);
	}
	
	public String getName() {
		return name;
	}
}
