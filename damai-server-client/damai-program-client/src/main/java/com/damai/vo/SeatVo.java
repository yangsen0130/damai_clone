package com.damai.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @program: damai
 * @description: 座位 vo
 * @author: yangsen
 **/
@Data
@Schema(title="SeatVo", description ="座位")
public class SeatVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    
    
    @Schema(name ="id", type ="Long", description ="座位id")
    private Long id;
    
    @Schema(name ="programId", type ="Long", description ="节目表id")
    private Long programId;
    
    @Schema(name ="ticketCategoryId", type ="Long", description ="节目票档id")
    private Long ticketCategoryId;
    
    @Schema(name ="rowCode", type ="Integer", description ="排号")
    private Integer rowCode;
  
    @Schema(name ="colCode", type ="Integer", description ="列号")
    private Integer colCode;
    
    @Schema(name ="seatType", type ="Integer", description ="座位类型")
    private Integer seatType;
    
    @Schema(name ="seatTypeName", type ="String", description ="座位类型名")
    private String seatTypeName;
    
    @Schema(name ="price", type ="BigDecimal", description ="座位价格")
    private BigDecimal price;
    
    @Schema(name ="sellStatus", type ="Integer", description ="1未售卖 2锁定 3已售卖")
    private Integer sellStatus;
}
