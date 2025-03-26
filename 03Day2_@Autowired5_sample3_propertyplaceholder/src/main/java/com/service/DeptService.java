package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;

public class DeptService {
	@Autowired
	private DeptDAO dao;
	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	public DeptService() {}
	
	public DeptService(DeptDAO dao, String driver, String url, String username, String password) {
		super();
		this.dao = dao;
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public List<String> getList() {
		return dao.getList();
	}

	public DeptDAO getDao() {
		return dao;
	}
	
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DeptService [dao=" + dao + ", driver=" + driver + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}
}
