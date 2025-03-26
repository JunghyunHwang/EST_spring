package com.spring;

import java.util.Map;

public class EchoBean {
	private Map<String, AnotherBean> map;
	
	public EchoBean() {}

	public EchoBean(Map<String, AnotherBean> map) {
		super();
		this.map = map;
	}

	public Map<String, AnotherBean> getMap() {
		return map;
	}

	public void setMap(Map<String, AnotherBean> map) {
		this.map = map;
	}
}
