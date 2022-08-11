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

    @DeleteMapping(value = "/delete")
    public String delete() {
        return "Test Delete";
    }

    @PostMapping(value = "/post")
    public String post() {
        return "Test Post";
    }

    @PutMapping(value = "/put")
    public String put() {
        return "Test Put";
    }
}