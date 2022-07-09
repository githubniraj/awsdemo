
package com.demo.awsdemo.controller;

import com.demo.awsdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    TestService testService;
    @GetMapping(value = "/welcome")
    public String getHello(){
        return "Hello Niraj! Welcome to Brucewayne";
    }

    @PutMapping(value = "/update/{msg}")
    public ResponseEntity<String> updateTest(@PathVariable(name = "msg") String msg){
        return testService.updateTest(msg);
    }

    @PostMapping(value = "/user")
    public ResponseEntity<String> postTest(){
        return testService.postTest();
    }


}