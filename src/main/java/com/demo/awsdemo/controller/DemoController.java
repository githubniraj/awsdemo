package com.demo.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/get")
    public String get() {
        return "Test Get";
    }
    @GetMapping(value = "/get")
    public String get() {
        return "Test Get";
    }


    @PostMapping(value = "/post")
    public String delete() {
        return "Test Post";
    }

    @PutMapping(value = "/put")
    public String put() {
        return "Test Put";
    }
}