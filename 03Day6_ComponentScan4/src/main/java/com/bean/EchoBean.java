package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.OneService;
import com.service.TwoService;

@Component("echoBean")
public class EchoBean {
	@Autowired
	private OneService one;
	@Autowired
	private TwoService two;
	
	public OneService getOne() {
		return one;
	}
	
	public void setOne(OneService one) {
		this.one = one;
	}
	
	public TwoService getTwo() {
		return two;
	}
	
	public void setTwo(TwoService two) {
		this.two = two;
	}
}
