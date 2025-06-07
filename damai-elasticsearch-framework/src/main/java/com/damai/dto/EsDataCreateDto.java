package com.damai.dto;

import lombok.Data;

/**
 * @program: damai
 * @description: elasticsearch数据参数
 * @author: yangsen
 **/
@Data
public class EsDataCreateDto {
    
    /**
     * 字段名
     * */
    private String paramName;
    /**
     * 字段值
     * */
    private Object paramValue;
}
