package com.demo.awsdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @GetMapping(value = "/welcome")
    public String getHello() {
        return "Hello Mahima! Welcome to Dallas";
    }

    //@PostMapping to feature branch
    @PostMapping(value = "/welcome")
    public String postHello(@RequestBody String message) {
        return "Hey Mahima, your message has been posted!!\n" + message;
    }

    @PutMapping(value = "/welcome")
    public String putHello() {
        return "Hello Namshang! Welcome to NYC";
    }
}