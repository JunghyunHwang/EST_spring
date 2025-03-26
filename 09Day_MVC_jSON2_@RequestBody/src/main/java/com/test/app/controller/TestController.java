package com.test.app.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/aaa", method = RequestMethod.POST)
	public String aaa(@RequestBody LoginDTO dto) { // json데이터 파싱
		System.out.println(dto);
		
		return "hello";
	}
	
	@RequestMapping(value = "/bbb", method = RequestMethod.POST)
	public String bbb(@RequestBody ArrayList<LoginDTO> list) {
		System.out.println(list);
		return "hello";
	}
	
	@RequestMapping(value = "/ccc", method = RequestMethod.GET)
	public String ccc(LoginDTO dto) {
		System.out.printf("userid: %s\n", dto.getUserid());
		
		return "hello";
	}
	
	@RequestMapping(value = "/eee", method = RequestMethod.POST)
	public String eee(String userid, String passwd) {
		System.out.printf("userid: %s\n", userid);
		System.out.printf("passwd: %s\n", passwd);
		
		return "hello";
	}
	
	@RequestMapping(value = "/ddd", method = RequestMethod.POST)
	public String ddd(String userid, String passwd) {
		System.out.printf("userid: %s\n", userid);
		
		return "hello";
	}
}
