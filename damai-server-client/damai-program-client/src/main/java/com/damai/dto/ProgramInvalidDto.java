package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: damai
 * @description: 节目失效 dto
 * @author: yangsen
 **/
@Data
@Schema(title="ProgramInvalidDto", description ="节目失效")
public class ProgramInvalidDto {
    
    @Schema(name ="id", type ="Long", description ="id",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Long id;
}
