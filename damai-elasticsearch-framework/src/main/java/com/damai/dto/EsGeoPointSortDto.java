package com.damai.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: damai
 * @description: elasticsearch GeoPoint定位
 * @author: yangsen
 **/
@Data
public class EsGeoPointSortDto {
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
