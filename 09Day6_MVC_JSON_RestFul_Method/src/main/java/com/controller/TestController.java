package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;

@Controller
public class TestController {
	@RequestMapping(value = "/board", method =  RequestMethod.GET)
	public String boardGet() {
		System.out.println("board GET");
		return "main";
	}
	
	@RequestMapping(value = "/board", method =  RequestMethod.POST)
	public String boardPost() {
		System.out.println("board POST");
		return "main";
	}
	
	@RequestMapping(value = "/board", method =  RequestMethod.DELETE)
	public String boardDelete() {
		System.out.println("board Delete");
		return "main";
	}
	
	@RequestMapping(value = "/board", method =  RequestMethod.PUT)
	public String boardPut() {
		System.out.println("board Put");
		return "main";
	}
	
	@RequestMapping(value = "/board", method =  RequestMethod.PATCH)
	public String boardPatch() {
		System.out.println("board Patch");
		return "main";
	}
}
