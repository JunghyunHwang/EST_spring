package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	private DeptDAO dao;
	
	public DeptService() {}
	
	public List<String> getList() {
		return dao.getList();
	}

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	
}
