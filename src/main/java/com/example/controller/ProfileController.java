package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.UserService;

@Controller
@RequestMapping(value = "/profile")
public class ProfileController {

	@Autowired
	private UserService userService;

	@RequestMapping
	public ModelAndView getUserProfile(@RequestParam("id") long id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", userService.getUser(id));
		mav.setViewName("profile");
		return mav;
	}

}
