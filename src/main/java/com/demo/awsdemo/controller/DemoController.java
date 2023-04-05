package com.demo.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{

    @GetMapping(value = "/get")
    public String getStudents()
    {
        return "I'm Anil.";
    }



}
