package com.test.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(value = "/login")
	public String x() {
		System.out.println("HelloController/login===");
		return "login";
	}
}
