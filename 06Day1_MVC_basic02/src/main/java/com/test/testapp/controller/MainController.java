package com.test.testapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	public MainController() {
		System.out.println("기본 생성자 호출됨");
	}
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("Request test");
		
		return "hello";
	}
	
	@RequestMapping("/test2")
	public String test2() {
		System.out.println("Request test2");
		
		return "hello2";
	}
}
