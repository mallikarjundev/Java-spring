package com.arjun.spring.springorm.product.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.arjun.spring.springorm.product.dao.ProductDao;
import com.arjun.spring.springorm.product.entity.Product;

public class ProductDaoImpl implements ProductDao {

	HibernateTemplate hibernateTemplate;

	@Override
	public int create(Product product) {

		return 0;
	}

}
