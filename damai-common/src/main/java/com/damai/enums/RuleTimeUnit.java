package com.damai.enums;

/**
 * @program: damai
 * @description: 规则时间单位
 * @author: yangsen
 **/
public enum RuleTimeUnit {
    /**
     * 规则时间单位
     * */
    SECOND(1,"秒"),
    MINUTE(2,"分钟")
    ;

    private Integer code;

    private String msg;

    RuleTimeUnit(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg == null ? "" : this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static String getMsg(Integer code) {
        for (RuleTimeUnit re : RuleTimeUnit.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re.msg;
            }
        }
        return "";
    }

    public static RuleTimeUnit getRc(Integer code) {
        for (RuleTimeUnit re : RuleTimeUnit.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re;
            }
        }
        return null;
    }
}
