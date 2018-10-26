package yy.controller;

import com.yy.microservicecloudapi.entity.Dept;
import com.yy.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptConsumerController {
    @Autowired
    private DeptClientService deptClientService;


    @RequestMapping("/feign/dept/list")
    public List<Dept> list() {
        return deptClientService.list();
    }
}
