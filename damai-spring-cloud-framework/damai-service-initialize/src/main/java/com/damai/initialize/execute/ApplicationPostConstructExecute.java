package com.damai.initialize.execute;

import com.damai.initialize.execute.base.AbstractApplicationExecute;
import jakarta.annotation.PostConstruct;
import org.springframework.context.ConfigurableApplicationContext;

import static com.damai.initialize.constant.InitializeHandlerType.APPLICATION_POST_CONSTRUCT;

/**
 * @program: damai
 * @description: 用于处理 {@link PostConstruct} 应用程序启动事件。
 * @author: yangsen
 **/
public class ApplicationPostConstructExecute extends AbstractApplicationExecute {
    
    public ApplicationPostConstructExecute(ConfigurableApplicationContext applicationContext){
        super(applicationContext);
    }
    
    @PostConstruct
    public void postConstructExecute() {
        execute();
    }
    
    @Override
    public String type() {
        return APPLICATION_POST_CONSTRUCT;
    }
}
