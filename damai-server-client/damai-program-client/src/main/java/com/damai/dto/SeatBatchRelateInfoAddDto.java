
package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: damai
 * @description: 节目座位相关信息 dto
 * @author: yangsen
 **/
@Data
@Schema(title="SeatBatchRelateInfoAddDto", description ="节目座位相关信息批量添加")
public class SeatBatchRelateInfoAddDto {
    
    @Schema(name ="ticketCategoryId", type ="Long", description ="节目票档id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long ticketCategoryId;
    
    @Schema(name ="price", type ="BigDecimal", description ="座位价格",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private BigDecimal price;
    
    @Schema(name ="count", type ="Integer", description ="添加的座位数量",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Integer count;
}
