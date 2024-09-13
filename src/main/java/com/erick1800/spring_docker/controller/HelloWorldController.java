package com.erick1800.spring_docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erick1800.spring_docker.service.HelloWorldService;
import com.erick1800.spring_docker.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/hello-World")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    //@Autowired
    //private SDKAWS adkAWS;

    @GetMapping
    public String HelloWorld(){
        return helloWorldService.HelloWorld("Erick");
    }

    @PostMapping("/{id}")
    public String HelloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody user body){
        return "Hello World " + body.getName() + id;
    }
}
