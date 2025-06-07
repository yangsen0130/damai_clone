package com.damai.context;

import com.damai.core.ConsumerTask;
import lombok.Data;

/**
 * @program: damai
 * @description: 消息主题
 * @author: yangsen
 **/
@Data
public class DelayQueuePart {
    
    private final DelayQueueBasePart delayQueueBasePart;
 
    private final ConsumerTask consumerTask;
    
    public DelayQueuePart(DelayQueueBasePart delayQueueBasePart, ConsumerTask consumerTask){
        this.delayQueueBasePart = delayQueueBasePart;
        this.consumerTask = consumerTask;
    }
}
