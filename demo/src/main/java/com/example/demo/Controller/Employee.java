package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Employee {
    
    
    @GetMapping("/hello")
    String hello() {
        return "Hello World";
    }
}
