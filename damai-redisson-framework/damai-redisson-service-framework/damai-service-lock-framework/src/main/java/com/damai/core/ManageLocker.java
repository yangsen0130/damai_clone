package com.damai.core;

import com.damai.servicelock.LockType;
import com.damai.servicelock.ServiceLocker;
import com.damai.servicelock.impl.RedissonFairLocker;
import com.damai.servicelock.impl.RedissonReadLocker;
import com.damai.servicelock.impl.RedissonReentrantLocker;
import com.damai.servicelock.impl.RedissonWriteLocker;
import org.redisson.api.RedissonClient;

import java.util.HashMap;
import java.util.Map;

import static com.damai.servicelock.LockType.Fair;
import static com.damai.servicelock.LockType.Read;
import static com.damai.servicelock.LockType.Reentrant;
import static com.damai.servicelock.LockType.Write;

/**
 * @program: damai
 * @description: 分布式锁 锁缓存
 * @author: yangsen
 **/
public class ManageLocker {

    private final Map<LockType, ServiceLocker> cacheLocker = new HashMap<>();
    
    public ManageLocker(RedissonClient redissonClient){
        cacheLocker.put(Reentrant,new RedissonReentrantLocker(redissonClient));
        cacheLocker.put(Fair,new RedissonFairLocker(redissonClient));
        cacheLocker.put(Write,new RedissonWriteLocker(redissonClient));
        cacheLocker.put(Read,new RedissonReadLocker(redissonClient));
    }
    
    public ServiceLocker getReentrantLocker(){
        return cacheLocker.get(Reentrant);
    }
    
    public ServiceLocker getFairLocker(){
        return cacheLocker.get(Fair);
    }
    
    public ServiceLocker getWriteLocker(){
        return cacheLocker.get(Write);
    }
    
    public ServiceLocker getReadLocker(){
        return cacheLocker.get(Read);
    }
}
