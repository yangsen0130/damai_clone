package com.damai.context;

import com.damai.config.DelayQueueProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.redisson.api.RedissonClient;

/**
 * @program: damai
 * @description: 延迟队列配置信息
 * @author: yangsen
 **/
@Data
@AllArgsConstructor
public class DelayQueueBasePart {
    
    private final RedissonClient redissonClient;
    
    private final DelayQueueProperties delayQueueProperties;
}
