package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @program: damai
 * @description: 座位 dto
 * @author: yangsen
 **/
@Data
@Schema(title="SeatDto", description ="座位")
public class SeatDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    
    @Schema(name ="id", type ="Long", description ="座位id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long id;
    
    @Schema(name ="ticketCategoryId", type ="Long", description ="节目票档id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long ticketCategoryId;
    
    @Schema(name ="rowCode", type ="String", description ="排号",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Integer rowCode;
    
    @Schema(name ="colCode", type ="String", description ="列号",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Integer colCode;
    
    @Schema(name ="seatType", type ="Integer", description ="座位类型")
    private Integer seatType;
    
    @Schema(name ="price", type ="BigDecimal", description ="座位价格",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private BigDecimal price;
}
