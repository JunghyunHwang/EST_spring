package com.spring;

public class EchoBean {
	private AnotherBean another;
	
	public EchoBean() {}

	public EchoBean(AnotherBean another) {
		this.another = another;
	}
	
	public String sayHello() {
		return "hello";
	}

	public AnotherBean getAnother() {
		return another;
	}

	public void setAnother(AnotherBean another) {
		this.another = another;
	}

	@Override
	public String toString() {
		return "EchoBean [another=" + another + "]";
	}
}
