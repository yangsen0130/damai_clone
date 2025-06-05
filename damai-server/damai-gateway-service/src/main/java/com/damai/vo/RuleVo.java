package com.damai.vo;

import lombok.Data;

/**
 * @program: damai
 * @description: 普通对象 返回vo
 * @author: yangsen
 **/
@Data
public class RuleVo {
    
    private String id;
    
    private Integer statTime;
    
    private Integer statTimeType;
    
    private Integer threshold;
    
    private Integer effectiveTime;
    
    private Integer effectiveTimeType;
    
    private String limitApi;
    
    private String message;
    
    private Integer status;
}
