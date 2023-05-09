package com.arjun.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/arjun/spring/springcore/reftypes/refconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}
