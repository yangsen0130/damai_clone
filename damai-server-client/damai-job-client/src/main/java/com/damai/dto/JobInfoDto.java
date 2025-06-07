package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @program: damai
 * @description: job任务 dto
 * @author: yangsen
 **/
@Data
@Schema(title="JobInfoDto", description ="job任务")
public class JobInfoDto {
    
    @Schema(name ="name", type ="String", description ="job任务名字", requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String name;
    
    @Schema(name ="name", type ="String", description ="job任务描述")
    private String description;
    
    @Schema(name ="url", type ="String", description ="job任务路径", requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String url;
    
    @Schema(name ="headers", type ="String", description ="job任务请求头信息", requiredMode= RequiredMode.REQUIRED)
    @NotBlank
    private String headers;
    
    @Schema(name ="method", type ="Integer", description ="job任务方法 1:get 2:post 3:put", requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Integer method;
    
    @Schema(name ="params", type ="String", description ="job任务请求参数")
    private String params;
    
    @Schema(name ="retry", type ="Integer", description ="是否重试 1是 0否")
    private Integer retry;
    
    @Schema(name ="retryNumber", type ="Integer", description ="重试次数")
    private Integer retryNumber;
}
