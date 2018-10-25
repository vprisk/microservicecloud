package com.yy.microservicecloudapi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Dept {
    private Long deptNo;
    private String deptName;
    private String dbSource;
}
