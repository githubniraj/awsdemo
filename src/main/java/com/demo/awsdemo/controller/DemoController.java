package com.demo.awsdemo.controller;

import com.demo.awsdemo.model.Student;
import com.demo.awsdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController

public class DemoController
{
    DemoService demoService=new DemoService();

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Optional<Student>> getStudent(@PathVariable int id)
    {
        Optional<Student> student = demoService.getStudent(id);
        return ResponseEntity.ok().body(student);
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<Collection<Student>>  getStudents()
    {
        Collection<Student> students = demoService.getAllStudent();
        return ResponseEntity.ok().body(students);
    }

    @PostMapping(value = "/post")
    public ResponseEntity<Integer> postStudent(Student student)
    {
        return ResponseEntity.ok().body(demoService.postStudent(student));
    }

    @PutMapping(value = "/put")
    public ResponseEntity<Integer> putStudent(Student student)
    {
        return ResponseEntity.ok().body(demoService.putStudent(student));
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Integer> deleteStudent(@PathVariable int id)
    {
        return ResponseEntity.ok().body(demoService.deleteStudent(id));

    }
}
