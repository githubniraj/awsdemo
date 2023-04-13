package com.demo.awsdemo.controller;

import com.demo.awsdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController
{

    DemoService service = new DemoService();

    @GetMapping(value = "/get")
    public String getStudents()
    {
        return service.getStudents();
    }

    @DeleteMapping(value = "/delete")
    public String deleteStudents()
    {
        return service.deleteStudents();
    }

    @PutMapping(value = "/put")
    public String putStudents()
    {
        return service.putStudents();
    }

    @PostMapping(value = "/post")
    public String postStudents()
    {
        return service.postStudents();
    }

    @PutMapping(value = "/put1")
    public String putStudents1()
    {
        return "I'm PUT 1";
    }

}
