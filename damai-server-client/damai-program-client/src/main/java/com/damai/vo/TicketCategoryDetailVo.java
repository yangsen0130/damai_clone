package com.damai.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: damai
 * @description: 节目票档详情 Vo
 * @author: yangsen
 **/
@Data
@Schema(title="TicketCategoryDetailVo", description ="节目票档详情")
public class TicketCategoryDetailVo {

    @Schema(name ="id", type ="Long", description ="节目票档id",requiredMode= RequiredMode.REQUIRED)
    private Long id;
    
    @Schema(name ="programId", type ="Long", description ="节目表id",requiredMode= RequiredMode.REQUIRED)
    private Long programId;
    
    @Schema(name ="introduce", type ="String", description ="介绍",requiredMode= RequiredMode.REQUIRED)
    private String introduce;
    
    @Schema(name ="price", type ="BigDecimal", description ="价格",requiredMode= RequiredMode.REQUIRED)
    private BigDecimal price;
    
    @Schema(name ="totalNumber", type ="Long", description ="总数量",requiredMode= RequiredMode.REQUIRED)
    private Long totalNumber;
    
    @Schema(name ="remainNumber", type ="Long", description ="剩余数量",requiredMode= RequiredMode.REQUIRED)
    private Long remainNumber;
    
    
}
