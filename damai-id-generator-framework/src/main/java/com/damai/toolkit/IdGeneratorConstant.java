package com.damai.toolkit;

/**
 * @program: damai
 * @description: 雪花算法相关常量
 * @author: yangsen
 **/
public class IdGeneratorConstant {
    /**
     * 机器标识位数
     */
    public static final long WORKER_ID_BITS = 5L;
    public static final long DATA_CENTER_ID_BITS = 5L;
    public static final long MAX_WORKER_ID = -1L ^ (-1L << WORKER_ID_BITS);
    public static final long MAX_DATA_CENTER_ID = -1L ^ (-1L << DATA_CENTER_ID_BITS);
}
