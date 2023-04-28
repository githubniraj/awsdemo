package com.demo.awsdemo.unit;

import com.demo.awsdemo.dao.DemoDAO;
import com.demo.awsdemo.model.Student;
import com.demo.awsdemo.service.DemoService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
public class DemoServiceTest {

    @Mock
    private DemoDAO demoDAO;

    @InjectMocks
    private DemoService demoService;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void testGetStudentHappyPath() {
        Mockito.when(demoDAO.get(Mockito.anyInt())).thenReturn(Optional.of(new Student()));
        Optional<Student> student = demoService.getStudent(1);
        assertTrue(student.get()!=null);
        assertEquals(null, student.get().getName());
        Mockito.verify(demoDAO, Mockito.times(1)).get(Mockito.anyInt());
    }
    @Test
    public void testGetStudentExceptionPath() {
        Mockito.when(demoDAO.get(Mockito.anyInt())).thenThrow(new IllegalArgumentException("Illegal arguments"));
        Optional<Student> student = demoService.getStudent(1);
        assertTrue(!student.isPresent());
        Mockito.verify(demoDAO, Mockito.times(1)).get(Mockito.anyInt());
    }

    @Test
    public void testGetAllStudentHappyPath(){
        Mockito.when(demoDAO.getAll()).thenReturn(Collections.emptyList());
        Collection<Student> studentCollection = demoService.getAllStudent();
        assertTrue(studentCollection !=null);
        assertEquals(0, studentCollection.size());
        Mockito.verify(demoDAO, Mockito.times(1)).getAll();
    }

    @Test
    public void testDeleteStudentHappyPath(){
        Mockito.when(demoDAO.delete(Mockito.anyInt())).thenReturn(0);
        int num = demoService.deleteStudent(1);
        assertTrue(num ==0);
        Mockito.verify(demoDAO, Mockito.times(1)).delete(Mockito.anyInt());
    }


    @Test
    public void testPostStudentHappyPath(){
        Mockito.when(demoDAO.post(Mockito.any())).thenReturn(1);
        int num = demoService.postStudent(new Student(9,"Thapa"));
        assertEquals(1, num);
        Mockito.verify(demoDAO, Mockito.times(1)).post(Mockito.any());
    }

    @Test
    public void testPutStudentHappyPath(){
        Mockito.when(demoDAO.put(Mockito.any())).thenReturn(1);
        int num = demoService.putStudent(new Student(100,"Sushant"));
        assertEquals(num, 1);
        Mockito.verify(demoDAO, Mockito.times(1)).put(Mockito.any());
    }

}

//    @Test
//    public void testGetStudentEmptyHappyPath() {
//        Mockito.when(demoDAO.get(Mockito.anyInt())).thenReturn(Optional.empty());
//        Optional<Student> student = demoService.getStudent(1);
//        assertTrue(student.get() != null);
//        assertEquals(null, student.get().getName());
//        Mockito.verify(demoDAO, Mockito.times(1)).get(Mockito.anyInt());
//    }

//    @Test
//    public void testGetAllStudentExceptionPath(){
//        Mockito.when(demoDAO.getAll()).thenThrow(new NullPointerException("No object found"));
//        Collection<Student> studentCollection = demoService.getAllStudent();
//        assertTrue(!studentCollection.isEmpty());
//        Mockito.verify(demoDAO, Mockito.times(1)).getAll();
//    }

