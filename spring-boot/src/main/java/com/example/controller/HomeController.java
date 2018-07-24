package com.example.controller;

import com.example.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  private final PostService postService;

  public HomeController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping({"/", "/home"})
  public String getUserListing(Model model) {
    model.addAttribute("posts", this.postService.getPosts());
    return "home";
  }
}
