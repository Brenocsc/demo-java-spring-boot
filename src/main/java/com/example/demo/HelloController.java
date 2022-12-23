package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
  
  @GetMapping
  public String hello() {
    String f1 = "H";
    String f2 = "ello";
    return f1 + f2 + " from containe";
  }
}
