package com.damai.initialize.base;

import org.springframework.boot.CommandLineRunner;

import static com.damai.initialize.constant.InitializeHandlerType.APPLICATION_COMMAND_LINE_RUNNER;

/**
 * @program: damai
 * @description: 用于处理 {@link CommandLineRunner} 类型 初始化执行 抽象
 * @author: yangsen
 **/
public abstract class AbstractApplicationCommandLineRunnerHandler implements InitializeHandler {
    
    @Override
    public String type() {
        return APPLICATION_COMMAND_LINE_RUNNER;
    }
}
