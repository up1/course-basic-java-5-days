package com.example.security.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping("/")
  public String home() {
    return "Hello World";
  }

  @GetMapping("/user")
  public Principal user(Principal user) {
    return user;
  }

}
