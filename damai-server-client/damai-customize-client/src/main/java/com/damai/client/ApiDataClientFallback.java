package com.damai.client;

import com.damai.common.ApiResponse;
import com.damai.dto.AddApiDataDto;
import com.damai.enums.BaseCode;
import org.springframework.stereotype.Component;

/**
 * @program: damai
 * @description: 定制服务 feign 异常
 * @author: yangsen
 **/
@Component
public class ApiDataClientFallback implements ApiDataClient {
    
    @Override
    public ApiResponse<Boolean> add(final AddApiDataDto dto) {
        return ApiResponse.error(BaseCode.SYSTEM_ERROR);
    }
}
