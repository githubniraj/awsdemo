package com.demo.awsdemo.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/welcome")
    public String getHello(){
        return "Hello Alisha! Welcome to Wakanda";
    }


    @DeleteMapping(value = "/welcome")
    public String delete(){
        return "Hello Alisha! Welcome to DeleteMapping";
    }
}


