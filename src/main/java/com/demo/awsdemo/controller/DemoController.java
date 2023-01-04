package com.demo.awsdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/welcome")
    public String getHello(){
        return "Hello Sunaina! Welcome to NC";
    }

    @PutMapping(value = "/welcome")
    public String putHello(){
        return "Hello Namshang! Welcome to NYC";
    }
}
