package com.demo.awsdemo.controller;

import com.demo.awsdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController{
        DemoService service = new DemoService();

    //@GetMapping(value = "/get")
    @GetMapping("/students/{id}")
    public String getStudents(@PathVariable Integer id)
    {
        return service.getStudents(id);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudents(@PathVariable  Integer id)
    {
        return service.deleteStudents(id);
    }

    @PutMapping(value = "/students/{id}/{student}")
    public String putStudents(@PathVariable Integer id, @PathVariable String student)
    {
        return service.putStudents(id, student);
    }

    @PostMapping("/students/{id}/{student}")
    public String postStudents(@PathVariable Integer id, @PathVariable String student)
    {
       return service.postStudents(id, student);
    }

}
