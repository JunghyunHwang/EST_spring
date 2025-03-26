package com.spring;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		GenericXmlApplicationContext con = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean echo = con.getBean("echoBean", EchoBean.class);
		List<Integer> list = echo.getValueList();
		AnotherBean ab = echo.getAnotherBean();
		
		System.out.println(list);
		ab.getInfo();
	}

}
