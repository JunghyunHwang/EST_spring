package com.dto;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Login {
	private String userid;
	
	@JsonIgnore
	private String passwd;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String userid, String passwd) {
		super();
		this.userid = userid;
		this.passwd = passwd;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "Login [userid=" + userid + ", passwd=" + passwd +"]";
	}
	
	
	
	
	
}
