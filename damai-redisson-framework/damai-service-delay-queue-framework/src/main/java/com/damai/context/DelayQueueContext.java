package com.damai.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @program: damai
 * @description: 延迟队列 发送者上下文
 * @author: yangsen
 **/
public class DelayQueueContext {
    
    private final DelayQueueBasePart delayQueueBasePart;
    /**
     * key为topic主题，value为发送消息的处理器
     * */
    private final Map<String, DelayQueueProduceCombine> delayQueueProduceCombineMap = new ConcurrentHashMap<>();
    
    public DelayQueueContext(DelayQueueBasePart delayQueueBasePart){
        this.delayQueueBasePart = delayQueueBasePart;
    }
    
    public void sendMessage(String topic,String content,long delayTime, TimeUnit timeUnit) {
        DelayQueueProduceCombine delayQueueProduceCombine = delayQueueProduceCombineMap.computeIfAbsent(
                topic, k -> new DelayQueueProduceCombine(delayQueueBasePart,topic));
        delayQueueProduceCombine.offer(content,delayTime,timeUnit);
    }
}
