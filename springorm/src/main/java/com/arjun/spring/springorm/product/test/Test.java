package com.arjun.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arjun.spring.springorm.product.dao.ProductDao;
import com.arjun.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/arjun/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("Awww");
		product.setPrice(7000);
		productDao.create(product);
	}

}
