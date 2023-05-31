package com.arjun.spring.springmvc.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@EnableWebMvc
@ComponentScan("com.arjun.spring.springmvc.controller")
@Configuration
public class SpringConfig extends WebMvcConfigurationSupport{

}
