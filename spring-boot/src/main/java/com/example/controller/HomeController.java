package com.example.controller;

import com.example.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

  private final PostService postService;

  public HomeController(PostService postService) {
    this.postService = postService;
  }

  @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
  public ModelAndView getUserListing() {
    ModelAndView mav = new ModelAndView();
    mav.addObject("posts", this.postService.getPosts());
    mav.setViewName("home");
    return mav;
  }
}
