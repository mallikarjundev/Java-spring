package com.arjun.spring.springjdbc.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arjun.spring.springjdbc.passenger.dao.PassengerDao;
import com.arjun.spring.springjdbc.passenger.dto.Passenger;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/arjun/spring/springjdbc/passenger/test/config.xml");
		PassengerDao dao = (PassengerDao) context.getBean("passengerDao");
		Passenger p=new Passenger();
		p.setId(11);
		p.setFirstName("rad");
		p.setLastName("o");
//		int res = dao.create(p);
//		int res = dao.update(p);
//		int res = dao.delete(11);
//		Passenger res= dao.read(2);
		List<Passenger> res= dao.read();
		System.out.println(res);
	}

}
