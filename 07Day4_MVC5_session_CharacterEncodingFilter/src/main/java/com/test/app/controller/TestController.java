package com.test.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm(HttpServletRequest req) {
		System.out.println(req.getParameter("userid"));
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto, HttpSession session) {
		session.setAttribute("login", dto);
		return "login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		System.out.println("로그아웃됨");
		return "redirect:login"; // jsp 요청 아닌 /login get 방식 요청
	}
	
	@RequestMapping(value = "mypage", method = RequestMethod.GET)
	public String mypage(HttpSession session) {
		if (session.getAttribute("login") == null) {
			return "redirect:login";
		}
		
		return "mypage";
	}
}
