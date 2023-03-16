package com.tmj.cloudalibabanacos9002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController()
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/tmj")
    public String getServerPort(){
        return "Hello Nacos Discovery"+serverPort;
    }

}
