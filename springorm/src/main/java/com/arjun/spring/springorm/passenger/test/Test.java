package com.arjun.spring.springorm.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arjun.spring.springorm.passenger.dao.PassengerDao;
import com.arjun.spring.springorm.passenger.entity.Passenger;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/arjun/spring/springorm/passenger/test/config.xml");
		PassengerDao passengerdao = (PassengerDao) context.getBean("passengerDao");

		Passenger passenger = new Passenger();
		passenger.setId(2);
		passenger.setFirstName("radi");
		passenger.setLastName("O");
//		passengerdao.create(passenger);
//		passengerdao.update(passenger);
//		passengerdao.delete(passenger);
//		Passenger result = passengerdao.find(1);
		List<Passenger> passengers = passengerdao.findAll();
		System.out.println(passengers);
	}

}
