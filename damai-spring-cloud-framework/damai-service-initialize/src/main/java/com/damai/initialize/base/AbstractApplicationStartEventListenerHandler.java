package com.damai.initialize.base;

import org.springframework.beans.factory.InitializingBean;

import static com.damai.initialize.constant.InitializeHandlerType.APPLICATION_EVENT_LISTENER;

/**
 * @program: damai
 * @description: 用于处理 {@link InitializingBean} 类型 初始化执行 抽象
 * @author: yangsen
 **/
public abstract class AbstractApplicationStartEventListenerHandler implements InitializeHandler {
    
    @Override
    public String type() {
        return APPLICATION_EVENT_LISTENER;
    }
}
