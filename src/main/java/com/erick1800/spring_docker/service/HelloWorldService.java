package com.erick1800.spring_docker.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String HelloWorld(String name){
        return "Hello World " + name + "!";
    }
}
