package com.test.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping(value = "/login")
	public String x() {
		System.out.println("TestController/login===");
		return "login";
	}
	
	@RequestMapping("/main")
	public String main() {
		System.out.println("TestController/main===");
		return "main";
	}
}
