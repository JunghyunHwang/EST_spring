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
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void main() {
		
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public void loginForm() {
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(LoginDTO dto, HttpServletRequest req) {
		req.setAttribute("xxx", dto);
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		return "redirect:main";
	}
}
