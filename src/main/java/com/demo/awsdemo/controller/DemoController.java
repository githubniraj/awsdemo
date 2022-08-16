package com.demo.awsdemo.controller;

import com.demo.awsdemo.service.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class DemoController {


    TestService testService = new TestService();

    @GetMapping(value = "/get")
    public String get() {
        String str = "";
        return testService.testGet(str);
    }

    @DeleteMapping(value = "/delete")
    public String delete() {
        return testService.testDelete();
    }

    @PostMapping(value = "/post")
    public String post() {
        return testService.testPost();
    }

    @PutMapping(value = "/put")
    public String put() {
        return testService.testPut();
    }
}