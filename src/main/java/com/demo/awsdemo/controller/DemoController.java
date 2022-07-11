package com.demo.awsdemo.controller;

import com.demo.awsdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    TestService testService;

    @PostMapping(value = "/post")
    public ResponseEntity<String> postTest(){

        return ResponseEntity.ok(testService.postTest());
    }

}
