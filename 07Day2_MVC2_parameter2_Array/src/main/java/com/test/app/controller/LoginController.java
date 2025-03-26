package com.test.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto) {
		System.out.println(dto);
		return "loginForm";
	}
	
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public String login(@RequestParam String[] phone, @RequestParam String[] chk) {
		System.out.println(phone.length);
		System.out.println(chk.length);
		return "loginForm";
	}
	
	@RequestMapping(value = "/login3", method = RequestMethod.POST)
	public String login(HttpServletRequest req) {
		String id = req.getParameter("name");
		String[] phone = req.getParameterValues("phone");
		String[] chk = req.getParameterValues("chk");
		
		System.out.println(id);
		System.out.printf("%s - %s\n", phone[0], phone[1]);
		System.out.printf("%s - %s\n", chk[0], chk[1]);
		return "loginForm";
	}
}
