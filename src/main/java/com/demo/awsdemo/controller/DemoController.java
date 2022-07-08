package com.demo.awsdemo.controller;

import com.demo.awsdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @Autowired
    TestService testService;
    @GetMapping(value = "/welcome")
    public String getHello(){
        return "Hello Niraj! Welcome to Brucewayne";
    }

//    @PutMapping(value = "update/{hello}")
//    public String updateTest(@PathVariable("hello") String hello){
//        return testService.updateTest(hello);
//    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<String> updateTest(@RequestBody String hello){
        return testService.updateTest(hello);
    }



}
