package com.example.controller;


import com.example.pojo.ClassProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ClassProperties classProperties;
    @GetMapping("Hello")
    public String hello(){
        return "hello, spring boot!";
    }
    @GetMapping("/prop")
    public ClassProperties classProperties(){
        return classProperties;
    }
}
