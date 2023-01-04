package com.demo.awsdemo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @GetMapping(value = "/welcome")
    public String getHello(){
        return "Hello Sunaina! Welcome to NC";
    }
}
