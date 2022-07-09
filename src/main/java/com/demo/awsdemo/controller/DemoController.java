package com.demo.awsdemo.controller;

import com.demo.awsdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    TestService testService;


    @PutMapping(value = "/update/{msg}")
    public ResponseEntity<String> updateTest(@PathVariable(name = "msg") String msg) {
        return ResponseEntity.ok(testService.updateTest());
    }

    @PostMapping(value = "/user")
    public ResponseEntity<String> postTest() {
        return ResponseEntity.ok(testService.postTest());
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<String> deleteTest() {
        return ResponseEntity.ok(testService.deleteTest());
    }

    @GetMapping(value = "/account")
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok(testService.getTest());
    }

}
