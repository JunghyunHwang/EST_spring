package com.test.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("loginForm============");
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login1(LoginDTO dto) {
		System.out.printf("ID: %s\n", dto.getUserid());
		System.out.printf("PW: %s\n", dto.getPasswd());
		return "login1";
	}
	
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public ModelAndView login2(LoginDTO dto) {
		ModelAndView result = new ModelAndView();
		result.addObject("login", dto);
		result.setViewName("login2");
		
		return result;
	}
	
	@RequestMapping(value = "/login3", method = RequestMethod.POST)
	public String login3(@ModelAttribute("xxx") LoginDTO dto) {
		System.out.println("login3:post");
		// request.setAttribute("xxx", dto); 이것과 같음
		
		return "login3";
	}
}
