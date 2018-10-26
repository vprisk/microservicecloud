package com.yy.service;

import com.yy.microservicecloudapi.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {
    @RequestMapping(value = "/dept/list")
    public List<Dept> list();
}
