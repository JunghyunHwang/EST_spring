package com.test.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@RequestMapping(value = "/login", params = "aaa=ccc")
	public String loginForm() {
		return "login";
	}
	
	@RequestMapping(value = "/login", params = "xxx")
	public String loginForm2() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET, params = "kkk=b")
	public String loginForm3() {
		return "login";
	}
}
