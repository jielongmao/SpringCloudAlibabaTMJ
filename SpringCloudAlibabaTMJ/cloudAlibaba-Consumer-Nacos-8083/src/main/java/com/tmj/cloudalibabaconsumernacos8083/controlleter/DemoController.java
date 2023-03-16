package com.tmj.cloudalibabaconsumernacos8083.controlleter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${server-url.nacos-user-service}")
    private String serverUrl;

    @GetMapping("consumer/nacos")
    public String getDiscovery(){
        return restTemplate.getForObject(serverUrl+"/tmj",String.class);
    }
}
