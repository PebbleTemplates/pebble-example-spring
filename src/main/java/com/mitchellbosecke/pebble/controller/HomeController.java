package com.mitchellbosecke.pebble.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/home")
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getView() {
		return "home";
	}
}
