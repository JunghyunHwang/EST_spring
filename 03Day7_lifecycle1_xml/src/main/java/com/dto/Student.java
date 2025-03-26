package com.dto;

public class Student {
	private String name;
	private int age;
	
	public Student() {
		System.out.println("Student default constructor");
	}
	
	public void aaa() {
		System.out.println("init-method.aaa");
	}
	
	public void bbb() {
		System.out.println("destory-method.bbb");
	}
	
	public void getInfo() {
		System.out.println("getInfo()=====");
	}
}
