package com.test.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(HttpServletRequest req) {
		System.out.println("request main");
		System.out.println(req.getAttribute("userid"));
		System.out.println(req.getParameter("userid"));
		return "main";
	}
	
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect(Model m, HttpServletRequest req) {
		// m.addAttribute("userid", ""); // parameter로 넘어감
		req.setAttribute("passwd", "1234");
		return "redirect:main";
	}
	
	@RequestMapping(value = "/forward", method = RequestMethod.GET)
	public String forward(Model m, HttpServletRequest req) {
		System.out.println("request forward");
		m.addAttribute("userid", "사토루"); // parameter로 넘어감
		req.setAttribute("passwd", "1234");
		return "forward:main";
		// return "main";
	}
}
