package com.demo.awsdemo.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/welcome")
    public String getHello() {
        return "Hello Niraj! Welcome to Brucewayne";
    }

    public void testSachina() {
        System.out.print("This is Sachina");

    }
}