package com.example.controller;

import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {

  private final UserService userService;

  public ProfileController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping(value = "/profile")
  public ModelAndView getUserProfile(@RequestParam("id") long id) {
    ModelAndView mav = new ModelAndView();
    mav.addObject("user", this.userService.getUser(id));
    mav.setViewName("profile");
    return mav;
  }

}
