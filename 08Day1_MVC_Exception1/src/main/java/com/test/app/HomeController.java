package com.test.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "main";
	}
	
	@RequestMapping(value = "/aaa")
	public String xxx() {
		throw new ArithmeticException("Occured ArithmeticException");
	}
	
	@RequestMapping(value = "/bbb")
	public String bbb() {
		throw new NullPointerException("Occured NullPointerException");
	}
	
	@ExceptionHandler({Exception.class})
	public String errorPage() {
		return "error";
	}
}
