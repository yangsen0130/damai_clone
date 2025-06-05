package com.damai.vo;

import cn.hutool.core.util.DesensitizedUtil;
import cn.hutool.core.util.StrUtil;
import com.damai.util.StringUtil;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @program: damai
 * @description: 购票人数据 vo
 * @author: yangsen
 **/
@Data
@Schema(title="TicketUserVo", description ="购票人数据")
public class TicketUserVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    
    @Schema(name ="id", type ="Long", description ="购票人id")
    private Long id;
    
    @Schema(name ="userId", type ="Long", description ="用户id")
    private Long userId;
    
    @Schema(name ="relName", type ="String", description ="用户真实名字")
    private String relName;
    
    @Schema(name ="idType", type ="Integer", description ="证件类型 1:身份证 2:港澳台居民居住证 3:港澳居民来往内地通行证 4:台湾居民来往内地通行证 5:护照 6:外国人永久居住证")
    private Integer idType;
    
    @Schema(name ="idNumber", type ="String", description ="证件号码")
    private String idNumber;
    
    public String getRelName() {
        if (StringUtil.isNotEmpty(relName)) {
            return StrUtil.hide(relName, 0, 1);
        }
        return relName;
    }
    
    public String getIdNumber() {
        if (StringUtil.isNotEmpty(idNumber)) {
            return DesensitizedUtil.idCardNum(idNumber, 4, 4);
        }else {
            return idNumber;
        }
    }
}
