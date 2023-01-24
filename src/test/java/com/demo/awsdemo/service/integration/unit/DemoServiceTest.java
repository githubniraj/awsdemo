package com.demo.awsdemo.service.integration.unit;

import com.demo.awsdemo.bean.Student;
import com.demo.awsdemo.dao.DemoDao;
import com.demo.awsdemo.service.DemoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DemoServiceTest  {

    @InjectMocks
    DemoService demoService;
    @Mock
    DemoDao demoDao;

    Map<Integer, Student> studentsMap;

    Student student;

    Student student1;

    @BeforeAll
    void setUp()
    {
        MockitoAnnotations.openMocks(this);
        studentsMap = new HashMap<Integer, Student>();
        student = new Student(1, "Namshang");
        student1 = new Student(2, "Deepa");
        studentsMap.put(1, student);
        studentsMap.put(2, student1);

    }

    @Test
    void testGetAllStudents()
    {
        when(demoDao.demoGet()).thenReturn((Arrays.asList(studentsMap.values())));
        List<Student> listStudents =  demoService.getallStudents();
        Assertions.assertTrue(listStudents.size()>=1);
        verify(demoDao, times(1)).demoGet();
    }

    @Test
    void testGetStudentbyID()
    {
        when(demoDao.demoGetbyID(anyInt())).thenReturn((student));
        Student student =  demoService.getStudentsbyID(1);
        Assertions.assertEquals(1,student.getId());
        Assertions.assertEquals("Namshang", student.getName());
        verify(demoDao, times(1)).demoGetbyID(anyInt());
    }

}
