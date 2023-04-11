package com.demo.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{

    @GetMapping(value = "/get")
    public String getStudents()
    {
        return "I'm Anil.";
    }


    @PutMapping(value = "/put")
    public String putStudents()
    {
        return "I'm PUT";
    }

    @PostMapping(value = "/post")
    public String postStudents (){
        return "I am Post";
    }

}
