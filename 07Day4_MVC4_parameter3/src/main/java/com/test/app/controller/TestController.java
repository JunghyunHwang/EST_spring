package com.test.app.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public ModelAndView xxx() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사토루1");
		list.add("사토루2");
		list.add("사토루3");
		list.add("사토루4");
		
		ModelAndView result = new ModelAndView();
		result.addObject("list", list);
		result.setViewName("main");
		
		return result;
	}
	
	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public ModelAndView xxx(ArrayList<String> list) {
		list.add("사토루1");
		list.add("사토루2");
		list.add("사토루3");
		list.add("사토루4");
		
		ModelAndView result = new ModelAndView();
		result.addObject("list", list);
		result.setViewName("main");
		
		return result;
	}
	
	@RequestMapping(value = "/ccc", method = RequestMethod.GET)
	public String xxx3(ArrayList<String> list) {
		list.add("사토루1");
		list.add("사토루2");
		list.add("사토루3");
		
		return "main3";
	}
	
	@RequestMapping(value = "/ddd", method = RequestMethod.GET)
	public String xxx2(@ModelAttribute("xxx") ArrayList<String> list) {
		list.add("사토루1");
		list.add("사토루2");
		list.add("사토루3");
		list.add("사토루4");
		
		return "main2";
	}
}
