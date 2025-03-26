package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dto.TestDTO;

public class TestDAO {
	private JdbcTemplate jdbcTemplate;
	
	public TestDAO(DataSource datSource) {
		this.jdbcTemplate = new JdbcTemplate(datSource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<TestDTO> select() {
		List<TestDTO> list = jdbcTemplate.query("select * from test",
				new RowMapper<TestDTO>() {
					public TestDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
						TestDTO dto = new TestDTO();
						dto.setNum(rs.getInt(1));
						dto.setUsername(rs.getString(2));
						dto.setAddress(rs.getString(3));
						System.out.println(rowNum);
						
						return dto;
					}
				}
		);
		
		return list;
	}
	
	public List<TestDTO> selectByName(String name) {
		List<TestDTO> list = jdbcTemplate.query("select * from test where username=?",
				new RowMapper<TestDTO>() {
					public TestDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
						TestDTO dto = new TestDTO();
						dto.setNum(rs.getInt(1));
						dto.setUsername(rs.getString(2));
						dto.setAddress(rs.getString(3));
						System.out.println(rowNum);
						
						return dto;
					}
				}, name
		);
		
		return list;
	}
	
	public void insert(int num, String name, String address) {
		jdbcTemplate.update("insert into test(num, username, address) values(?, ?, ?)", num, name, address);
	}
}
