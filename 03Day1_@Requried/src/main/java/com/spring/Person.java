package com.spring;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	private String name;
	private int age;
	private Cat cat;
	
	public Person() {}
	
	public Person(String name, int age, Cat cat) {
		this.name = name;
		this.age = age;
		this.cat = cat;
	}
	
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
	
	public Cat getCat() {
		return cat;
	}
	
	@Required
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}
}
