package com.demo.awsdemo.controller;

import com.demo.awsdemo.service.TestService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    TestService testService = new TestService();

    @GetMapping(value = "/get")
    public String get() {
        return testService.testGet();
    }

    @DeleteMapping(value = "/delete")
    public String delete() {
        return "Test Post";
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