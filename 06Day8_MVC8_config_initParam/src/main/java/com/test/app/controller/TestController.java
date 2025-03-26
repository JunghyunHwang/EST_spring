package com.test.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	private TestService service;
	private Person person;
	
	public TestController() {
		System.out.println("TestController");
		service = new TestService();
		person = new Person("홍길동", 30);
	}
	
	@RequestMapping(value = "/xxx")
	public String sayEcho() {
		System.out.println("/xxx 주소 요청");
		System.out.println(person);
		System.out.println(service.xx());
		
		return "login";
	}
	
	@RequestMapping(value = "/xxx2")
	public String sayEcho2() {
		System.out.println("/xxx2 주소 요청");
		Person p = new Person("사토루", 30);
		System.out.println(p);
		
		TestService ts = new TestService();
		System.out.println(ts.xx());
		
		return "login";
	}
}
