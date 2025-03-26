package com.dto;

public class Student {
	private String name = "이순신";
	private int age;
	
	public Student() {
		System.out.println("Deafault Constructor");
	}

	public Student(String name, int age, Cat cat) {
		super();
		this.name = name;
		this.age = age;
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
}
