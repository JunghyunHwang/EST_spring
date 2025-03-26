package com.spring;

public class Person {
	private String name;
	private int age;
	private Cat cat;
	
	public Person(String name, int age, Cat cat) {
		this.name = name;
		this.age = age;
		this.cat = cat;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Cat getCat() {
		return cat;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}
}
