
package com.demo.awsdemo.service;

import com.demo.awsdemo.bean.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DemoServiceTest
{
    DemoService demoService;
    @BeforeAll
    void setUp()
    {
        demoService = new DemoService();
    }

    @Test
    void testGetAllStudents() {
       List<Student> listStudents =  demoService.getallStudents();
        Assertions.assertTrue(listStudents.size()>=2);
    }

    @Test
    void testGetStudentbyID() {
        Student student =  demoService.getStudentsbyID(1);
        Assertions.assertEquals(1,student.getId());
        Assertions.assertEquals("Namshang", student.getName());
    }

    @Test
    void testGetStudentbyIDDOE() {
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> {
            //Code under test
            demoService.getStudentsbyID(3);
        });
        Assertions.assertEquals("Id does not exist!!!!!", thrown.getMessage());
    }

    @Test
    void testGetStudentbyInvalidInput() {
        IllegalArgumentException thrown = Assertions.assertThrows( IllegalArgumentException.class, () -> {
            //Code under test
            demoService.getStudentsbyID(0);
        });
        Assertions.assertEquals("Invalid input", thrown.getMessage());
    }
}