package com.arjun.spring.springcoreadvanced.injecting.interfaces;

public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {

		System.out.println("Inside Order DAO2 createOrder");
	}

}
