package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.PostService;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
    public ModelAndView getUserListing() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("posts", this.postService.getPosts());
        mav.setViewName("home");
        return mav;
    }
}
