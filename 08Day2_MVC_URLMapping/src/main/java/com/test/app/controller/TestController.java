package com.test.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		return "main";
	}
	
	@RequestMapping(value = "/aaa", method = RequestMethod.GET)
	public String aaa() {
		return "main";
	}
	
	@RequestMapping(value = { "/aaa2", "aaa3" }, method = RequestMethod.GET)
	public String aaa2() {
		return "main";
	}
	
	@RequestMapping(value = "/bbb*", method = RequestMethod.GET)
	public String bbb() {
		return "main";
	}
	
	@RequestMapping(value = "/ccc/*", method = RequestMethod.GET)
	public String ccc() {
		return "main";
	}
	
	@RequestMapping(value = "/ddd/**", method = RequestMethod.GET)
	public String ddd() {
		return "main";
	}
	
	@RequestMapping(value = "/eee/**/aaa", method = RequestMethod.GET)
	public String eee() {
		return "main";
	}
	
	@RequestMapping(value = "/hhh/{userid}/xxx/{passwd}", method = RequestMethod.GET)
	public String aaa7(@PathVariable("userid") String userid,
			@PathVariable("passwd") String passwd) {
		System.out.println(userid);
		System.out.println(passwd);
		
		return "main";
	}
	
	@RequestMapping(value = "/ggg", method = RequestMethod.GET)
	public String ggg(@RequestParam String id) {
		System.out.println(id);
		return "main";
	}
	
	@RequestMapping(value = "/ggg2", method = RequestMethod.GET)
	public String ggg2(String id) {
		System.out.println(id);
		return "main";
	}
}
