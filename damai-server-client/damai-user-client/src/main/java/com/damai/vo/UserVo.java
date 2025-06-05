package com.damai.vo;

import cn.hutool.core.util.DesensitizedUtil;
import com.damai.util.StringUtil;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @program: damai
 * @description: 用户 vo
 * @author: yangsen
 **/

@Data
@Schema(title="UserVo", description ="用户数据")
public class UserVo {
    
    @Schema(name ="id", type ="String", description ="用户id")
    private Long id;
    
    @Schema(name ="name", type ="String", description ="用户名字")
    private String name;
    
    @Schema(name ="relName", type ="String", description ="用户真实名字")
    private String relName;
    
    @Schema(name ="gender", type ="Integer", description ="1:男 2:女")
    private Integer gender;
    
    @Schema(name ="name", type ="String", description ="用户手机号")
    private String mobile;
    
    @Schema(name ="emailStatus", type ="Integer", description ="是否邮箱认证 1:已验证 0:未验证")
    private Integer emailStatus;
    
    @Schema(name ="email", type ="String", description ="邮箱地址")
    private String email;
    
    @Schema(name ="relAuthenticationStatus", type ="Integer", description ="是否实名认证 1:已验证 0:未验证")
    private Integer relAuthenticationStatus;
    
    @Schema(name ="idNumber", type ="String", description ="身份证号码")
    private String idNumber;
    
    @Schema(name ="address", type ="String", description ="收货地址")
    private String address;
    
    public String getIdNumber() {
        if (StringUtil.isNotEmpty(idNumber)) {
            return DesensitizedUtil.idCardNum(idNumber, 4, 4);
        }else {
            return idNumber;
        }
    }
    
    public String getMobile() {
        if (StringUtil.isNotEmpty(mobile)) {
            return DesensitizedUtil.mobilePhone(mobile);
        }else {
            return mobile;    
        }
    }
}
