package com.test.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("/main get");
		return "main";
	}

	@RequestMapping(value = "/memberAdd", method = RequestMethod.GET)
	public String memberAdd() {
		return "memberAddForm";
	}

	@RequestMapping(value = "/memberAdd1", method = RequestMethod.POST)
	public String memberAdd(String name, int age, String address) {
		System.out.printf("name: %s, age: %d, address: %s\n", name, age, address);
		return "memberAddForm";
	}

	/*
	 * @RequestMapping(value = "/memberAdd2", method = RequestMethod.POST) public
	 * String memberAdd1(@RequestParam("name") String name, @RequestParam int
	 * age, @RequestParam String address) {
	 * System.out.printf("name: %s, age: %d, address: %s\n", name, age, address);
	 * return "memberAddForm"; }
	 */

	@RequestMapping(value = "/memberAdd3", method = RequestMethod.POST)
	public String memberAdd(@RequestParam Map<String, String> userInfo) {
		System.out.printf("name: %s, age: %d, address: %s\n", userInfo.get("name"), userInfo.get("age"), userInfo.get("address"));
		return "memberAddForm";
	}
}
