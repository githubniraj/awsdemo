package com.demo.awsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/welcome")
    public String getHello(){
        return "Hello Niraj! Welcome to Brucewayne";
    }

    @PostMapping(value = "/user")
    public String addUser() {
        return "Hi its Karma";
    }
}
