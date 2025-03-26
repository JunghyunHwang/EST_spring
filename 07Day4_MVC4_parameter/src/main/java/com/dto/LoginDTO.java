package com.dto;

public class LoginDTO {
	private String name;
	
	public LoginDTO(){}
	
	public LoginDTO(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "LoginDTO [name=" + name + "]";
	}
}
