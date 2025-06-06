package com.damai.enums;

/**
 * @program: damai
 * @description: job运行状态
 * @author: yangsen
 **/
public enum JobRunStatus {
    /**
     * job运行状态
     * */
    RUN_NEW(1, "新建"),
    
    RUN_SUCCESS(2,"执行成功"),
    RUN_FAILURE(3,"执行失败");
    
    private Integer code;
    
    private String msg = "";
    
    JobRunStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public Integer getCode() {
        return this.code;
    }
    
    public String getMsg() {
        return this.msg == null ? "" : this.msg;
    }
    
    public static String getMsg(Integer code) {
        for (JobRunStatus re : JobRunStatus.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re.msg;
            }
        }
        return "";
    }
    
    public static JobRunStatus getRc(Integer code) {
        for (JobRunStatus re : JobRunStatus.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re;
            }
        }
        return null;
    }
}
