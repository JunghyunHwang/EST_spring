package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;

@Controller
public class TestController2 {
	@RequestMapping("/hhh")
	public ResponseEntity<Login> ddd() {
		Login login = new Login("스구루", "30");
		ResponseEntity<Login> entity = ResponseEntity.status(200).body(login);
		return entity;
	}
}
