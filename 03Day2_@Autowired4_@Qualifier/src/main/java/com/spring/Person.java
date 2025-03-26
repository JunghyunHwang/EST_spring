package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String name;
	private int age;
	
	@Autowired
	private Cat cat;
	
	private Dog dog;
	
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
	
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	public Dog getDog() {
		return dog;
	}
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cat=" + cat + "]";
	}
}
