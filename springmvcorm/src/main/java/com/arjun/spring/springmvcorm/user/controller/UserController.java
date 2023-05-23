package com.arjun.spring.springmvcorm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.arjun.spring.springmvcorm.user.servies.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
}
