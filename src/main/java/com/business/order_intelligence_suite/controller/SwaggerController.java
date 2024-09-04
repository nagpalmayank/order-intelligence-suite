package com.business.order_intelligence_suite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerController {
  @GetMapping("/")
  public String reMap(){
    return "redirect:/swagger-ui/index.html";
  }
}
