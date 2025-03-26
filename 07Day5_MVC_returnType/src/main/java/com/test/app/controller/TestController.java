package com.test.app.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "main"; // main.jsp
	}
	
	@RequestMapping(value = "/hhh", method = RequestMethod.GET)
	public String hhh() {
		return "redirect:main";
	}
	
	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public ModelAndView bbb() {
		ModelAndView result = new ModelAndView();
		result.addObject("username", "사토루");
		result.setViewName("main2");
		
		return result;
	}
	
	@RequestMapping(value = "/bbb2", method = RequestMethod.GET)
	public String bbb2(Model m) {
		m.addAttribute("username", "사토루");
		return "main2";
	}
	
	@RequestMapping(value = "/ccc", method = RequestMethod.GET)
	public LoginDTO xxx() {
		System.out.println("/ccc");
		LoginDTO dto = new LoginDTO("사토루", "1234");
		return dto; // /ccc.jsp로 요청됨
	}
	
	@RequestMapping(value = "/ccc2", method = RequestMethod.GET)
	@ModelAttribute("xxx")
	public LoginDTO xxx2() {
		System.out.println("/ccc");
		LoginDTO dto = new LoginDTO("사토루", "1234");
		return dto; // /ccc.jsp로 요청됨
	}
	
	@RequestMapping(value = "/eee", method = RequestMethod.GET)
	@ModelAttribute("yyy")
	public ArrayList<String> eee() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사토루01");
		list.add("사토루02");
		list.add("사토루03");
		
		return list;
	}
	
	@RequestMapping(value = "/fff", method = RequestMethod.GET)
	public void fff(HttpServletRequest req) {
		req.setAttribute("username", "사토루");
	}
	
	@RequestMapping(value = "/ggg", method = RequestMethod.GET)
	public void ggg(Model m) {
		m.addAttribute("username", "사토루");
	}
}
