package com.damai.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: damai
 * @description: 分页dto
 * @author: yangsen
 **/
@Data
public class BasePageDto {
    
    
    @NotNull
    private Integer pageNumber;
    
    
    @NotNull
    private Integer pageSize;
}
