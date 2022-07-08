package com.demo.awsdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/welcome")
    public String getHello(){

        return "Hello Niraj! Welcome to Brucewayne";
    }
    @DeleteMapping(value="/user")
    public String deleteUser(){

        return "Delete user";
    }
}
