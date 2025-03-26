package com.spring;

import java.util.List;

public class EchoBean {
	private List<Integer> valueList;
	private AnotherBean anotherBean;
	
	public EchoBean() {}

	public EchoBean(List<Integer> valueList, AnotherBean anotherBean) {
		super();
		this.valueList = valueList;
		this.anotherBean = anotherBean;
	}

	public List<Integer> getValueList() {
		return valueList;
	}

	public void setValueList(List<Integer> valueList) {
		this.valueList = valueList;
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
	
	public String sayHello() {
		return "hello";
	}
}
