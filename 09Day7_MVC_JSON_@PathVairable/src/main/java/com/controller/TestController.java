package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;

@Controller
public class TestController {
	@RequestMapping(value = "/test", method =  RequestMethod.GET)
	public String boardGet() {
		System.out.println("test GET");
		return "main";
	}
	
	@RequestMapping(value = "/board/name/{xxx}", method = RequestMethod.GET)
	public String aaa(@PathVariable("xxx") String name) {
		System.out.printf("aaa @PathVariable(\"xxx\")\n", name);
		return "main";
	}
	
	@RequestMapping(value = "/board2/name/{xxx}/age/{yyy}", method = RequestMethod.GET)
	public String bbb(@PathVariable("xxx") String name, @PathVariable("yyy") int age) {
		System.out.printf("aaa @PathVariable(\"xxx\")\n", name);
		System.out.printf("aaa @PathVariable(\"yyy\")\n", age);
		return "main";
	}
}
