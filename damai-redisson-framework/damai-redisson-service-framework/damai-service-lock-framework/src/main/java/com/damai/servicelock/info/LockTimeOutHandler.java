package com.damai.servicelock.info;

/**
 * @program: damai
 * @description: 分布式锁 处理失败抽象
 * @author: yangsen
 **/
public interface LockTimeOutHandler {
    
    /**
     * 处理
     * @param lockName 锁名
     * */
    void handler(String lockName);
}
