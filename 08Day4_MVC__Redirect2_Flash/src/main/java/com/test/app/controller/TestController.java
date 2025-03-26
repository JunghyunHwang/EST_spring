package com.test.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	// RedirectAttributes 사용시 <mvc:annotattion-driven /> 필요함
	@RequestMapping(value = "/flash", method = RequestMethod.GET)
	public String redirectFlash(RedirectAttributes m) {
		m.addFlashAttribute("userid", new LoginDTO("사토루", "1234"));
		return "redirect:main";
	}
	
}
