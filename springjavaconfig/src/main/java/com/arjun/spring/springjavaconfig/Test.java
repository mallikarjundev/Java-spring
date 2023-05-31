package com.arjun.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service service = context.getBean(Service.class);
//		service.save();
		System.out.println(service.hashCode());

		Service service2 = context.getBean(Service.class);
		System.out.println(service2.hashCode());
		context.close();
	}

}
