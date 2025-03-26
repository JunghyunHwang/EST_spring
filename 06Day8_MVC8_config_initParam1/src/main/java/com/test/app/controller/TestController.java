package com.test.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@Autowired
	private TestService service;
	
	@Autowired
	private Person person;
	
	@RequestMapping(value = "/xxx")
	public String sayEcho() {
		System.out.println("/xxx 주소 요청");
		System.out.println(person);
		System.out.println(service.xx());
		
		return "login";
	}

	public TestService getService() {
		return service;
	}

	public void setService(TestService service) {
		this.service = service;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
