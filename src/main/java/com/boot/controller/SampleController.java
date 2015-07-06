package com.boot.controller;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@ComponentScan
public class SampleController {
 
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/home")
    public String home() {
        return "Home Greetings from Spring Boot!";
    }
 
}