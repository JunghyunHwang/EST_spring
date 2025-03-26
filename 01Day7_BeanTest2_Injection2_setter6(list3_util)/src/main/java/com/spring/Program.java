package com.spring;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		testUtil();
	}

	private static void testEmbed() {
		String path = "classpath:echo2.xml";
		GenericXmlApplicationContext con = new GenericXmlApplicationContext(path);
		
		EchoBean eb = con.getBean("echoBean", EchoBean.class);
		List<AnotherBean> list = eb.getValueList();
		
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i).getName());
		}
	}
	
	private static void testUtil() {
		System.out.println("==== testUtil() ====");
		String path = "classpath:echo.xml";
		GenericXmlApplicationContext con = new GenericXmlApplicationContext(path);
		
		EchoBean eb = con.getBean("echoBean", EchoBean.class);
		List<AnotherBean> list = eb.getValueList();
		
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i).getName());
		}
	}
}
