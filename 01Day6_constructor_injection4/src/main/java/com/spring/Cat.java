package com.spring;

public class Cat {
	private String name;
	private int age;
	
	public Cat() {
		
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}
