package com.demo.awsdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class DemoController {

    @GetMapping(value = "/get")
    public String get() {
        return "niraj";
    }
}
