package com.arjun.spring.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arjun.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendObject() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Arj");
		employee.setSalary(7000);
		
		Employee employee2 = new Employee();
		employee2.setId(345);
		employee2.setName("mal");
		employee2.setSalary(3000);
		
		Employee employee3 = new Employee();
		employee3.setId(456);
		employee3.setName("sss");
		employee3.setSalary(15000);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		
		modelAndView.addObject("employees", employees);

		return modelAndView;
	}
}
