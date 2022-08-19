package com.demo.awsdemo.service.unit;


import com.demo.awsdemo.dao.TestDao;
import com.demo.awsdemo.service.TestService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestServiceTest {

    @InjectMocks
    TestService testService;

    @Mock
    TestDao testDao;

    @BeforeAll
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetNull(){
        String actualResult=testService.testGet(null);
        Assertions.assertEquals(null,actualResult);
        verify(testDao,times(0)).testGet(anyString());
    }

    @Test
    public void testGetEmpty(){
        String actualResult=testService.testGet("");
        Assertions.assertEquals("",actualResult);
        verify(testDao,times(0)).testGet(anyString());
    }

    @Test
    public void testGetWithSaroj(){

        String actualResult=testService.testGet("saroj");
        Assertions.assertEquals("saroj",actualResult);
        verify(testDao,times(0)).testGet(anyString());
    }


    @Test
    public void testGetWithException(){
        String actualResult=testService.testGet("exception");
        Assertions.assertEquals("exception",actualResult);
        verify(testDao,times(0)).testGet(anyString());
    }

    @Test
    public void testGetWithCorrectInput(){
        when(testDao.testGet(anyString())).thenReturn("Hello! World");
        String actualResult=testService.testGet("Hello! World");
        Assertions.assertEquals("Hello! World",actualResult);
        verify(testDao,times(1)).testGet(anyString());
    }









}
