package com.demo.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/get")
    public String get() {
        return "Test Get";
    }

    @PutMapping(value = "/put")
    public String put() {
        return "Test Put";
    }
}
