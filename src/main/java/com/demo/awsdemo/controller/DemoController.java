package com.demo.awsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/welcome")
    public String getHello(){
        return "Hello Niraj! Welcome to Brucewayne";
    }




    public void testBibhasa() {
        System.out.println("Hello!I am bibhasa");
    }

}
