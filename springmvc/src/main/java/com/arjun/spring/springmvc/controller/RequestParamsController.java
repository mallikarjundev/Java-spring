package com.arjun.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {

	@RequestMapping("/showData")
	public ModelAndView modelAndView(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("sal") double salary) {

		System.out.println("Id:" + id);
		System.out.println("name:" + name);
		System.out.println("sal:" + salary);
		return new ModelAndView("userReg");
	}
}
