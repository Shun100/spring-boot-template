package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
  
  @GetMapping("/demo")
  private String display(Model model) {
    model.addAttribute("message", "Hello, Spring Boot & Thymeleaf");
    return "./index"; // templates/index.htmlを返す
  }
}
