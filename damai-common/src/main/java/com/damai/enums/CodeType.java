package com.damai.enums;

/**
 * @program: damai
 * @description: 基础数据 code
 * @author: yangsen
 **/
public enum CodeType {
    /**
     * 支付宝相关信息
     * */
    PC(1,"0001","pc网站"),
    
    WX_MINI_PROGRAM(2,"0002","微信小程序"),
    
    ALIPAY_MINI_PROGRAM(3,"0003","支付宝小程序"),
    
    ;

    private Integer code;
    
    private String value;

    private String msg;

    CodeType(Integer code, String value, String msg) {
        this.code = code;
        this.value = value;
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
    
    public String getValue() {
        return value;
    }
    
    public void setValue(final String value) {
        this.value = value;
    }
    
    public static String getMsg(Integer code) {
        for (CodeType re : CodeType.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re.msg;
            }
        }
        return "";
    }

    public static CodeType getRc(Integer code) {
        for (CodeType re : CodeType.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re;
            }
        }
        return null;
    }
}
