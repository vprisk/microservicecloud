package com.yy.controller;

import com.yy.microservicecloudapi.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    private static final String URL_PREFEX="http://localhost:8001/dept/";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(URL_PREFEX+"list",List.class);
    }
}
