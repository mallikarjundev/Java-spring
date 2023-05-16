package com.arjun.spring.springorm.product.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.arjun.spring.springorm.product.dao.ProductDao;
import com.arjun.spring.springorm.product.entity.Product;

@Component
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public int create(Product product) {

		return 0;
	}

}
