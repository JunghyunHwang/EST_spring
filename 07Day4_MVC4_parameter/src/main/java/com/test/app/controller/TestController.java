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
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/aaa")
	public ModelAndView aaa() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "사토루");
		mav.addObject("age", 20);
		
		LoginDTO dto = new LoginDTO("aaa");
		mav.addObject("login", dto);
		mav.setViewName("main2");
		
		return mav;
	}
}
