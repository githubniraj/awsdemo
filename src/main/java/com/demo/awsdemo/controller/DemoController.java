package com.demo.awsdemo.controller;

import com.demo.awsdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
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
    public String delete(String id) {
        return testService.testDelete(id);
    }

    @PostMapping(value = "/post")
    public String post(String id) {
        return testService.testPost(id);
    }

    @PutMapping(value = "/put")
    public String put(String id) {
        return testService.testPut(id);
    }
}