package com.mitchellbosecke.pebble.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/home")
public class HomeController extends BaseController{
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getView() {
		ModelAndView mav = getMav();
		mav.setViewName("home");
		return mav;
	}
}
