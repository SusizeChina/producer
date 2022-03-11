package com.example.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @Value("${producer.test:}")
    private String test;

    @GetMapping("/producer/v1/producer")
    public String getApplictaionName(){
        return applicationName+":"+port;
    }

    @GetMapping("/producer/v1/test")
    public String getTest(){
        return test;
    }
}
