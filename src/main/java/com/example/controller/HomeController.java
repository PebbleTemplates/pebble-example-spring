package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.PostService;

@Controller
@RequestMapping(value = "/")
public class HomeController {

	@Autowired
	private PostService postService;

	@RequestMapping(value = "/")
	public String redirectToHome() {
		return "redirect:/home";
	}

	@RequestMapping(value = "/home")
	public ModelAndView getUserListing() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("posts", postService.getPosts());
		mav.setViewName("home");
		return mav;
	}

}
