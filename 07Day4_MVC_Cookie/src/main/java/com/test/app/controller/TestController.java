package com.test.app.controller;

import java.net.http.HttpResponse;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping("/")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/setCookie")
	public String setCookie(HttpServletRequest req, HttpServletResponse res) {
		Cookie c1 = new Cookie("myName", "사토루");
		Cookie c2 = new Cookie("age", "30");
		Cookie c3 = new Cookie("favorit", "math");
		
		c1.setMaxAge(60 * 60);
		c2.setMaxAge(60 * 60);
		c3.setMaxAge(60 * 60);
		
		res.addCookie(c1);
		res.addCookie(c2);
		res.addCookie(c3);
		
		return "hello";
	}
	
	@RequestMapping("/getCookie")
	public String getCookie(HttpServletRequest req, HttpServletResponse res) {
		Cookie[] cookies = req.getCookies();
		
		for (Cookie c : cookies) {
			System.out.println(c.getName() + "\t" + c.getValue());
		}
		
		return "hello";
	}
}
