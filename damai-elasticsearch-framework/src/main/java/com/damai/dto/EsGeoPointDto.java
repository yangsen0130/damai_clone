package com.damai.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: damai
 * @description: elasticsearch GeoPoint
 * @author: yangsen
 **/
@Data
public class EsGeoPointDto {
    /**
     * 字段名
     * */
    private String paramName;
    /**
     * 纬度值
     * */
    private BigDecimal latitude;
    /**
     * 经度值
     * */
    private BigDecimal longitude;
    
    
}
