package com.example.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

  @RequestMapping(value = "/")
  @ResponseBody
  public String welcome() {
    return "Welcome";
  }
}
