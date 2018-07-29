package com.example.controller;

import com.example.service.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

  private final EmailService emailService;

  public EmailController(EmailService emailService) {
    this.emailService = emailService;
  }

  @PostMapping("/emails")
  public String sendEmail(EmailForm emailForm) {
    this.emailService.sendEmail(emailForm.getComment());
    return "email/confirmation";
  }
}
