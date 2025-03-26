package com.spring;

import java.util.List;

public class EchoBean {
	private List<Integer> list;
	private AnotherBean anotherBean;
	
	public EchoBean() {}

	public EchoBean(List<Integer> list, AnotherBean anotherBean) {
		super();
		this.list = list;
		this.anotherBean = anotherBean;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

	@Override
	public String toString() {
		return "EchoBean [list=" + list + ", anotherBean=" + anotherBean + "]";
	}
}
