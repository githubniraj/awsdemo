package com.demo.awsdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @GetMapping(value = "/welcome")
    public String getHello() {
        return "Hello! Welcome to Dallas";
    }
}