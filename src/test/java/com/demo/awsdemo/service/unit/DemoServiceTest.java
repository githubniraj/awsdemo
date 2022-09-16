package com.demo.awsdemo.service.unit;


import com.demo.awsdemo.dao.DemoDao;
import com.demo.awsdemo.service.DemoService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DemoServiceTest {

    @InjectMocks
    DemoService demoService;

    @Mock
    DemoDao demoDao;

    @BeforeAll
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testPostWithNull() {
        ResponseEntity response = demoService.post(null);
        Assertions.assertEquals(null,response);
        verify(demoDao, times(0)).post(anyString());
    }

    @Test
    void testPostWithValidInput(){
        when(demoDao.post(anyString())).thenReturn(ResponseEntity.ok("Devendra"));
        ResponseEntity response = demoService.post("Devendra");
        String resosneBody = (String) response.getBody();
        Assertions.assertEquals("Devendra",resosneBody);

        when(demoDao.post(anyString())).thenReturn(ResponseEntity.ok("Jagdish"));
        ResponseEntity response1 = demoService.post("Jagdish");
        String resosneBody1 = (String) response1.getBody();
        Assertions.assertEquals("Jagdish",resosneBody1);

        verify(demoDao, times(2)).post(anyString());
    }

    @Test
    void testDeleteWithNull() {
        ResponseEntity response = demoService.delete(null);
        Assertions.assertEquals(null,response);
        verify(demoDao, times(0)).delete(anyString());
    }

    @Test
    void testDeleteWithValidInput(){
        when(demoDao.delete(anyString())).thenReturn(ResponseEntity.ok("Namshang"));
        ResponseEntity response = demoService.delete("Namshang");
        String responseBody = (String) response.getBody();
        Assertions.assertEquals("Namshang", responseBody);

        when(demoDao.delete(anyString())).thenReturn(ResponseEntity.ok("Jagdish"));
        ResponseEntity response1 = demoService.delete("Jagdish");
        String responseBody1 = (String) response1.getBody();
        Assertions.assertEquals("Jagdish",responseBody1);

        verify(demoDao, times(2)).delete(anyString());
    }

}
