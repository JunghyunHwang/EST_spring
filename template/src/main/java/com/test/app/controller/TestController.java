package com.test.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login1(LoginDTO dto) {
		System.out.println("/login post, " + dto);
		
		return "login";
	}
	
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public String login2(@RequestParam("userid") String id, @RequestParam("passwd") String pw) {
		System.out.printf("userid: %s, passwd: %s\n", id, pw);
		
		return "login";
	}
	
	@RequestMapping(value = "/login2_1", method = RequestMethod.POST)
	public String login2_1(@RequestParam("userid") String id, @RequestParam("passwd") int pw) {
		System.out.printf("userid: %s, passwd: %s\n", id, pw);
		
		return "login";
	}
	
	@RequestMapping(value = "/login3")
	public String login3(@RequestParam String userid, @RequestParam String passwd) {
		System.out.printf("userid: %s, passwd: %s\n", userid, passwd);
		
		return "login";
	}
	
	@RequestMapping(value = "/login4")
	public String login4(String userid, String passwd) {
		System.out.printf("userid: %s, passwd: %s\n", userid, passwd);
		
		return "login";
	}
	
	@RequestMapping(value = "/login5")
	public String login5(@RequestParam(required = false, defaultValue = "Satoru")
		String userid, String passwd) {
		System.out.printf("userid: %s, passwd: %s\n", userid, passwd);
		
		return "login";
	}
	
	@RequestMapping(value = "/login5_1")
	public String login5_1(@RequestParam String userid, String passwd) {
		System.out.printf("userid: %s, passwd: %s\n", userid, passwd);
		
		return "login";
	}
	
	@RequestMapping(value = "/login6")
	public String login6(@RequestParam Map<String, String> userinfo) {
		System.out.printf("userid: %s, passwd: %s\n", userinfo.get("userid"), userinfo.get("passwd"));
		
		return "login";
	}
	
	@RequestMapping(value = "/login6_1")
	public String login6_1(Map<String, String> userinfo) {
		System.out.printf("userid: %s, passwd: %s\n", userinfo.get("userid"), userinfo.get("passwd"));
		
		return "login";
	}
	
	@RequestMapping(value = "/login7")
	public String login7(HttpServletRequest request) {
		String id = request.getParameter("userid");
		String pw = request.getParameter("passwd");
		System.out.printf("userid: %s, passwd: %s\n", id, pw);
		
		return "login";
	}
}
