package com.damai.service;

import lombok.Data;

/**
 * @program: damai
 * @description: 接口请求记录 实体对象
 * @author: yangsen
 **/
@Data
public class ApiRestrictData {

    private Long triggerResult;
    
    private Long triggerCallStat;
    
    private Long apiCount;
    
    private Long threshold;
    
    private Long messageIndex;
}
