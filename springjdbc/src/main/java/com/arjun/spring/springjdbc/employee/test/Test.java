package com.arjun.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arjun.spring.springjdbc.employee.dao.EmployeeDao;
import com.arjun.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/arjun/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstName("Micheal");
//		employee.setLastName("Kama");
//		int result = dao.create(employee);
//		int result = dao.update(employee);
//		int result = dao.delete(1);
		Employee employee = dao.read(2);
		System.out.println("employee record" + employee);
	}

}
