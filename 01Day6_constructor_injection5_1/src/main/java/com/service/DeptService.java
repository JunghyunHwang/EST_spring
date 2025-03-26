package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	private DeptDAO dao;
	
	public DeptService() {
		this.dao = new DeptDAO();
	}
	
	public DeptService(DeptDAO dao) {
		this.dao = dao;
	}
	
	public List<String> getList() {
		return dao.getList();
	}
}
