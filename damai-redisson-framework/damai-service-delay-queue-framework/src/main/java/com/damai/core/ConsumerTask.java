package com.damai.core;

/**
 * @program: damai
 * @description: 延迟队列 消费者接口
 * @author: yangsen
 **/
public interface ConsumerTask {
    
    /**
     * 消费任务
     * @param content 具体参数
     * */
    void execute(String content);
    /**
     * 主题
     * @return 主题
     * */
    String topic();
}
