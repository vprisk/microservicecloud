package com.yy.controller;

import com.yy.microservicecloudapi.entity.Dept;
import com.yy.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }
}
