package com.yy.service;

import com.yy.microservicecloudapi.entity.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 获取所有的部门
     * @return
     */
    List<Dept> list();
}
