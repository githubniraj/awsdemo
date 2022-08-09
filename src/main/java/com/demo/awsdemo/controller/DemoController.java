package com.demo.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/welcome")
    public String getHello() {
        return "Hello Niraj! Welcome to Brucewayne";
    }
    public void testAyusha() {
        System.out.println("This is Ayusha");
    }

    public void testAyusha() {
        System.out.println("This is Ayusha");
    }



    public void testSaroj() {
        System.out.println("Hello,This is Saroj");
    }


    public void testSachina() {
        System.out.print("This is Sachina");

    }
}