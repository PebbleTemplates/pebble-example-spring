package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.PostService;
import com.example.service.UserService;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@Autowired
	private UserService userService;
	

	@Autowired
	private PostService postService;
	
	@RequestMapping(value = "/")
	public String redirectToHome(){
		return "redirect:/home";
	}

	@RequestMapping(value="/home")
	public ModelAndView getUserListing() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		
		mav.addObject("activeNav", "home");
		mav.addObject("posts", postService.getPosts());
		return mav;
	}

}
