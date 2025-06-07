package com.damai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Map;

/**
 * @program: damai
 * @description: 支付回调通知 dto
 * @author: yangsen
 **/
@Data
@Schema(title="NotifyDto", description ="支付回调通知")
public class NotifyDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    
    
    @Schema(name ="channel", type ="Integer", description ="支付渠道 alipay：支付宝 wx：微信",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private String channel;

    @Schema(name ="params", type ="Map<String, String>", description ="回调参数",requiredMode= RequiredMode.REQUIRED)
    @NotNull
    private Map<String, String> params;
}
