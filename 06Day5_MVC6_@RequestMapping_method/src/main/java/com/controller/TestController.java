package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("/login get 방식 요청");
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login() {
		System.out.println("/login post 방식 요청");
		return "login";
	}
	
	@RequestMapping(value = "/")
	public String main() {
		System.out.println("/main 요청");
		return "main";
	}
}
