package com.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class DeptDAO {
	public List<String> getList(){//db코드 구현 예정 
		return Arrays.asList("A", "B","C");
	}
}
