package com.demo.awsdemo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @GetMapping("/welcome")
    public String getHello() {
        return "Hello Mahima! Welcome to Dallas";
    }

    //@PostMapping to feature branch
    @PostMapping("/welcome")
    public String postHello(@RequestBody String message) {
        return "Hey Mahima, your message has been posted!!\n" + message;
    }

    @PutMapping("/welcome")
    public String updateHello(@RequestBody String message){
        return "Hey Mahima, your message has been updated!!\n" + message;
    }

    @DeleteMapping("/welcome")
    public String deleteHello(@RequestBody String name){
        return name.toUpperCase() +", YOUR MESSAGE HAS BEEN DELETED!!";
    }

}