package com.spring;

public class Person {
	private String name;
	private int age;
	private Cat cat;
	private Dog dog;
	
	public Person() {}
	
	public Person(String name, int age, Cat cat, Dog dog) {
		this.name = name;
		this.age = age;
		this.cat = cat;
		this.dog = dog;
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
	
	public Dog getDog() {
		return dog;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cat=" + cat + ", dog=" + dog + "]";
	}
}
