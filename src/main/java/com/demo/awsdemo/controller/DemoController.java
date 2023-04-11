package com.demo.awsdemo.controller;

import org.springframework.web.bind.annotation.*;

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

    @PutMapping(value = "/put")
    public String putStudents()
    {
        return "I'm PUT";
    }

    @PostMapping(value = "/post")
    public String postStudents()
    {
        return "I'm Post";
    }

}
