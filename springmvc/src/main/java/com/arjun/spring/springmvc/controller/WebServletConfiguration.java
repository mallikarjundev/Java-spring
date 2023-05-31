package com.arjun.spring.springmvc.controller;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

public class WebServletConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext webcontext = new AnnotationConfigWebApplicationContext();
		webcontext.register(SpringConfig.class);
	}

}
