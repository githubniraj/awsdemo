package com.demo.awsdemo.controller;

import com.demo.awsdemo.bean.Student;
import com.demo.awsdemo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class DemoController
{

    //The following is an alternative of autowire function.
    private DemoService demoService = new DemoService();

    //Returns all the students in the form of list
    @GetMapping(value = "/getallstudents")
    public List getStudents()
    {
        return demoService.getallStudents();
    }

    //Returns students using their id
    @GetMapping(value = "/getallstudents/{id}")
    public Student getStudentsbyID(@PathVariable(value ="id") int id)
    {
        return demoService.getStudentsbyID(id);
    }

    //Returns students using their name
    @GetMapping(value = "/getallstudents/studentname")
    public Student getStudentsbyName(@RequestParam(value ="name") String StudentName)
    {
        return demoService.getStudentsbyName(StudentName);
    }

    //To add students into the hashmap
    @PostMapping(value = "/addstudents")
    public Student addstudents(@RequestBody Student student )
    {
        return demoService.addStudents(student);
    }

    //To update students into the hashmap
    @PutMapping(value = "/updatestudents")
    public Student updatestudents(@RequestBody Student student)
   {
        return demoService.updateStudents(student);
    }


    //To delete students from the hashmap using their id
    @DeleteMapping(value = "/deletestudents/{id}")
    public String deletestudents(@PathVariable(value ="id") int id)
    {
        return demoService.deleteStudents(id);
    }

}
