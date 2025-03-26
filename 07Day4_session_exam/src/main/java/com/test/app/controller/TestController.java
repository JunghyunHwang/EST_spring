package com.test.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "main";
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String memberForm() {
		return "memberForm";
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public String signUp(LoginDTO dto, HttpSession session) {
		session.setAttribute("member", dto);
		
		return "redirect:login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(LoginDTO dto, HttpSession session) {
		LoginDTO logined = (LoginDTO)session.getAttribute("member");
		
		if (logined == null
			|| !dto.getUserid().equals(logined.getUserid()) 
			|| !dto.getPasswd().equals(logined.getPasswd())) {
			return "redirect:login";
		}
		
		session.setAttribute("login", dto);
		return "logined";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:login";
	}
}
