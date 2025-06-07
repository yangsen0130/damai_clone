package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Collection;

/**
 * @program: damai
 * @description: 节目票档集合 dto
 * @author: yangsen
 **/
@Data
@Schema(title="TicketCategoryListDto", description ="节目票档集合")
public class TicketCategoryListDto {
    
    @Schema(name ="programId", type ="Long", description ="节目id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long programId;

    @Schema(name ="ticketCategoryIdList", type ="Long[]", description ="票档id集合",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Collection<Long> ticketCategoryIdList;
}
