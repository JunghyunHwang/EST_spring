package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.OrderDTO;
import com.entity.ProductDTO;

@Repository
public class ProductDAO {
	@Autowired
	private SqlSessionTemplate template;
	
	public ProductDAO() {}
	
	public SqlSessionTemplate getJdbcTemplate() {
		return template;
	}
	
	public void setJdbcTemplate(SqlSessionTemplate jdbcTemplate) {
		this.template = jdbcTemplate;
	}
	
	public List<ProductDTO> selectProduct() {
		return template.selectList("productList");
	}
	
	public List<OrderDTO> selectOrder() {
		return template.selectList("orderList");
	}
	
	public void addOrder(String pcode, int quantity) throws Exception {
		OrderDTO dto = new OrderDTO();
		dto.setPcode(pcode);
		dto.setQuantity(quantity);
		
		int n = template.insert("order.orderInsert", dto);
		System.out.println("order table insert = " + n);
		
		template.update("product.pr            ", dto);
		System.out.println("product table update = " + n);
	}
}
