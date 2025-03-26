package com.spring;

public class EchoBean {
	private String echo;
	
	public EchoBean() {
		System.out.println("기본 생성자 호출");
	}
	
	public String sayHello() {
		return "hello";
	}
	
	public String getEcho() {
		return echo;
	}
	
	public void setEcho(String echo) {
		this.echo = echo;
	}
}
