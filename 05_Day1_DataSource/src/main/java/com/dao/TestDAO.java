package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dto.TestDTO;

public class TestDAO {
	private JdbcTemplate jdbcTemplate;
	
	public TestDAO() {}
	
	public TestDAO(DataSource datSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public ArrayList<TestDTO> select() {
		ArrayList<TestDTO> list = new ArrayList<TestDTO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement("select * from test");
			rs = ps.executeQuery();
			
			while (rs.next()) {
				int n = rs.getInt("num");
				String name = rs.getString("username");
				String addr = rs.getString("address");

				list.add(new TestDTO(n, name, addr));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (ps != null) {
					rs.close();
				}
				
				// 이제 connection close 아니고 반납 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public void delete(int num) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement("delete from test where num = ?");
			ps.setInt(1, num);
			
			int n = ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
