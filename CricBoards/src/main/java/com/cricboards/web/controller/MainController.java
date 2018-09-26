package com.cricboards.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

	@RequestMapping("/")
	public String home() {
		return "Greetings from Spring Boot!";
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}


}
