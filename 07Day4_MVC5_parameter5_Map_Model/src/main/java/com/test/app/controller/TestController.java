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
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String xxx(Model m) {
		m.addAttribute("username", "사토루");
		m.addAttribute("login", new LoginDTO("사토루", "1234"));
		return "main";
	}
	
	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public String bbb(Map<String, String> map) {
		map.put("username", "사토루");
		map.put("address", "도쿄");
		return "main2";
	}
	
	@RequestMapping(value = "/ccc", method = RequestMethod.GET)
	public String ccc(HttpServletRequest req) {
		req.setAttribute("username", "사토루");
		req.setAttribute("login", new LoginDTO("사토루", "1234"));
		return "main";
	}
}
