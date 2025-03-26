package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {
	@RequestMapping("/kkk")
	public String kkk() {
		System.out.println("first kkk");
		return "hello";
	}
}
