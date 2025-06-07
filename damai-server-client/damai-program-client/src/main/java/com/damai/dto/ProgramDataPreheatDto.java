package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: damai
 * @description: 节目相关数据数据预热 dto
 * @author: yangsen
 **/
@Data
@Schema(title="ProgramDataPreheatDto", description ="节目相关数据预热")
public class ProgramDataPreheatDto {
    
    @Schema(name ="programId", type ="Long", description ="节目id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long programId;
}
