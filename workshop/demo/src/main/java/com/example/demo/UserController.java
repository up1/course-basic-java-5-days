package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public UserResponse xyz(@PathVariable int id) {
        return new UserResponse();
    }

    @GetMapping("/users")
    public List<UserResponse> getAll() {
        List<UserResponse> res = new ArrayList<>();
        res.add(new UserResponse());
        res.add(new UserResponse());
        return res;
    }

}
