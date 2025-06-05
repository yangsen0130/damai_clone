package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: damai
 * @description: 地区查询 dto
 * @author: yangsen
 **/
@Data
@Schema(title="AreaGetDto", description ="AreaGetDto")
public class AreaGetDto {
    
    @Schema(name ="id", type ="Long",description="地区id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long id;
}
