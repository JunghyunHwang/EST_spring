package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondController {
	@RequestMapping("/kkk")
	public String kkk() {
		System.out.println("Second kkk");
		return "hello";
	}
	
	@RequestMapping("/kkk2")
	public String xxx() {
		System.out.println("Called SecondController.xxx");
		return "hello2";
	}
}
