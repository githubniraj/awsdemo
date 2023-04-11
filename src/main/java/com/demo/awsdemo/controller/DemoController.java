package com.demo.awsdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

    @DeleteMapping(value = "/delete")
    public String deleteStudents()
    {
        return "I'm Delete.";
    }

    @DeleteMapping(value = "/delete1")
    public String deleteStudents1()
    {
        return "I'm Delete 1.";
    }

    @PutMapping(value = "/put")
    public String putStudents()
    {
        return "I'm PUT";
    }

}
