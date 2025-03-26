package com.test.app.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@ModelAttribute("xxx")
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사토루1");
		list.add("사토루2");
		list.add("사토루3");
		list.add("사토루4");
		return list;
	}
	
	@RequestMapping(value = "/aaa")
	public String aaa(@ModelAttribute("xxx") ArrayList<String> list) {
		list.add("aaaaa");
		return "main2";
	}
}
