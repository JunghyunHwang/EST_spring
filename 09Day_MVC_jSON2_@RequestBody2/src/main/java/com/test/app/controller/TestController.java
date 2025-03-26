package com.test.app.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/ddd", method = RequestMethod.POST)
	@ResponseBody
	public String ddd(String userid, String passwd) {
		System.out.printf("userid: %s\n", userid);
		System.out.printf("passwd: %s\n", passwd);
		
		return "ok";
	}
}
