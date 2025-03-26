package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;

@Service("productService")
public class ProductService {
	@Autowired
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
