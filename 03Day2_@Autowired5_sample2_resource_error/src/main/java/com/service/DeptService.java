package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;

public class DeptService {
	@Resource(name = "dao")
	private DeptDAO dao;
	
	public DeptService() {}
	
	public List<String> getList() {
		return dao.getList();
	}

	public DeptDAO getDao() {
		return dao;
	}
}
