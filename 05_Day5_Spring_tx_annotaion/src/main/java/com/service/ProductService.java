package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;

public class ProductService {
	private ProductDAO dao;
	
	public ProductService() {}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	public List<ProductDTO> selectProduct() {
		return dao.selectProduct();
	}

	public List<OrderDTO> selectOrder() {
		return dao.selectOrder();
	}

	@Transactional
	public void addORder(String pcode, int quantity) throws Exception {
		dao.addOrder(pcode, quantity);
	}
}
