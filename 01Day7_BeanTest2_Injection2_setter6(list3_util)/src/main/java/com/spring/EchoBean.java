package com.spring;

import java.util.List;

public class EchoBean {
	private List<AnotherBean> valueList;
	private AnotherBean anotherBean;
	
	public EchoBean() {}

	public EchoBean(List<AnotherBean> valueList, AnotherBean anotherBean) {
		super();
		this.valueList = valueList;
		this.anotherBean = anotherBean;
	}

	public List<AnotherBean> getValueList() {
		return valueList;
	}

	public void setValueList(List<AnotherBean> valueList) {
		this.valueList = valueList;
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
}
