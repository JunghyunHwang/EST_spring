package com.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestConstroller {
	@Autowired
	SqlSessionTemplate session;
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public String test() {
		System.out.println(session);
		return "ok";
	}
}
