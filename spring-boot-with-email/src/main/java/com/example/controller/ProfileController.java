package com.example.controller;

import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfileController {

  private final UserService userService;

  public ProfileController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping(value = "/profile")
  public String getUserProfile(@RequestParam("id") long id, Model model) {
    model.addAttribute("user", this.userService.getUser(id));
    return "profile";
  }

}
