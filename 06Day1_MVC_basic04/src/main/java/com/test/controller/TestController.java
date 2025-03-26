package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/main")
	public String main() {
		System.out.println("/main 주소 요청됨");
		return "main";
	}
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("/test 주소 요청됨");
		return "hello";
	}
}
