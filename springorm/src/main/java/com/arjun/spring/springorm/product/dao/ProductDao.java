package com.arjun.spring.springorm.product.dao;

import com.arjun.spring.springorm.product.entity.Product;

public interface ProductDao {

	int create(Product product);
	void update(Product product);
	void delete(Product product);
	
}
