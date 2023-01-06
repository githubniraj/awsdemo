package com.demo.awsdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @GetMapping(value = "/welcome")
    public String getHello() {
        return "Hello sonam! Welcome to Dallas";
    }

    //@PostMapping to feature branch
    @PostMapping(value = "/welcome")
    public String postHello(@RequestBody String message) {
        return "Hey sonam, your message has been posted!!\n" + message;
    }

    @PutMapping(value = "/welcome")
    public String putHello() {
        return "Hello sonam! Welcome to NYC";
    }
    @DeleteMapping(value="/welcome")
    public String deleteHello(){
        return "Hello, your file has been deleted";
    }
    @PatchMapping(value = "/welcome")
    public String patchHello() {
        return "Hello sonam! Welcome to NYC";
    }

    public static void main(String[] args) {
        System.out.println("Github test");
    }
}