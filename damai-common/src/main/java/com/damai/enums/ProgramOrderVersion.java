package com.damai.enums;

/**
 * @program: damai
 * @description: 节目订单枚举
 * @author: yangsen
 **/
public enum ProgramOrderVersion {
    /**
     * 版本
     * */
    V1_VERSION("v1","v1版本",1),
    
    V2_VERSION("v2","v2版本",2),
   
    V3_VERSION("v3","v3版本",3),
    
    V4_VERSION("v4","v4版本",4),
    ;

    private final String version;

    private final String msg;
    
    private final Integer value;

    ProgramOrderVersion(String version, String msg, Integer value) {
        this.version = version;
        this.msg = msg;
        this.value = value;
    }

    public String getVersion() {
        return version;
    }
    

    public String getMsg() {
        return this.msg == null ? "" : this.msg;
    }
    
    public Integer getValue(){
        return value;
    }
    

    public static String getMsg(String version) {
        for (ProgramOrderVersion re : ProgramOrderVersion.values()) {
            if (re.version.equals(version)) {
                return re.msg;
            }
        }
        return "";
    }

    public static ProgramOrderVersion getRc(String version) {
        for (ProgramOrderVersion re : ProgramOrderVersion.values()) {
            if (re.version.equals(version)) {
                return re;
            }
        }
        return null;
    }
}
