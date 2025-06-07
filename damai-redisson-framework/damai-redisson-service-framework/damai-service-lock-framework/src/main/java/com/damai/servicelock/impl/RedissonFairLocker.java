package com.damai.servicelock.impl;

import com.damai.servicelock.ServiceLocker;
import lombok.AllArgsConstructor;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

import java.util.concurrent.TimeUnit;

/**
 * @program: damai
 * @description: 分布式锁 公平锁
 * @author: yangsen
 **/
@AllArgsConstructor
public class RedissonFairLocker implements ServiceLocker {

    private final RedissonClient redissonClient;
    
    @Override
    public RLock getLock(String lockKey) {
        return redissonClient.getFairLock(lockKey);
    }

    @Override
    public RLock lock(String lockKey) {
        RLock lock = redissonClient.getFairLock(lockKey);
        lock.lock();
        return lock;
    }

    @Override
    public RLock lock(String lockKey, long leaseTime) {
        RLock lock = redissonClient.getFairLock(lockKey);
        lock.lock(leaseTime, TimeUnit.SECONDS);
        return lock;
    }

    @Override
    public RLock lock(String lockKey, TimeUnit unit ,long leaseTime) {
        RLock lock = redissonClient.getFairLock(lockKey);
        lock.lock(leaseTime, unit);
        return lock;
    }

    @Override
    public boolean tryLock(String lockKey, TimeUnit unit, long waitTime) {
        RLock lock = redissonClient.getFairLock(lockKey);
        try {
            return lock.tryLock(waitTime, unit);
        } catch (InterruptedException e) {
            return false;
        }
    }
    
    @Override
    public boolean tryLock(String lockKey, TimeUnit unit, long waitTime, long leaseTime) {
        RLock lock = redissonClient.getFairLock(lockKey);
        try {
            return lock.tryLock(waitTime, leaseTime, unit);
        } catch (InterruptedException e) {
            return false;
        }
    }

    @Override
    public void unlock(String lockKey) {
        RLock lock = redissonClient.getFairLock(lockKey);
        lock.unlock();
    }

    @Override
    public void unlock(RLock lock) {
        lock.unlock();
    }

}
