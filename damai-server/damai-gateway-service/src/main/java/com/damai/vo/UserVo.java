package com.damai.vo;

import lombok.Data;

import java.util.Date;

/**
 * @program: damai
 * @description: 用户 返回vo
 * @author: yangsen
 **/
@Data
public class UserVo {
    
    private String id;
    
    private String name;
    
    private String password;
    
    private Integer age;
    
    private Integer status;
    
    private Date createTime;
    
    private String mobile;
    
    private Date editTime;
}
