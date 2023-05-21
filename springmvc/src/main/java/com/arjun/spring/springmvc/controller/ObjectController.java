package com.arjun.spring.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arjun.spring.springmvc.dto.Employee;

public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Arj");
		employee.setSalary(7000);
		modelAndView.addObject("employee", employee);

		return modelAndView;
	}
}
