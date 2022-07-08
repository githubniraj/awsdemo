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

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<String> updateTest(@RequestBody String hello){
        return testService.updateTest(hello);
    }

    @PostMapping(value = "/user")
    public String addUser() {
        return "Hi its Karma";
    }

    @DeleteMapping(value= "/delete")
    public ResponseEntity<String> deleteUser()
    {
        return testService.deleteTest();
    }
}
