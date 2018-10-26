package com.yy.dao;

import com.yy.microservicecloudapi.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    public List<Dept> list();
}
