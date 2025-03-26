package com.test.app.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/main")
	public String main() {
		
		return "main";
	}
	
	@RequestMapping("/test")
	public String test() {
		
		return "test";
	}
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		
		return "loginForm";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		System.out.println("login 호출, 로그인 되었습니다." + request.getParameter("userid"));
		request.setAttribute("test", "스구루");
		return "logined";
	}
}
