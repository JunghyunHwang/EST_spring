package com.spring;

public class Program {

	public static void main(String[] args) {
		EchoBean echoBean = new EchoBean();
		echoBean.setEcho("Satoru");
		System.out.println(echoBean.getEcho());
	}

}
