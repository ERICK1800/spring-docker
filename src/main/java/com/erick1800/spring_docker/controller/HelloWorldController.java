package com.erick1800.spring_docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/hello-World")
public class HelloWorldController {

    @GetMapping("/get")
    public String HelloWorld(){
        return "Hello World";
    }
}
