package com.demo.awsdemo.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @GetMapping(value = "/get")
    public String get() {
        return null;
    }
    @PutMapping(value="/Put")
    public String put(){
        return null;
    }

    @PostMapping(value ="/post")
    public String post(){
        return null;
    }


    @DeleteMapping(value = "/delete")
    public String delete() {
        return null;
    }
}