package com.damai.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @program: damai
 * @description: 地区 vo
 * @author: yangsen
 **/
@Data
@Schema(title="AreaVo", description ="区域数据")
public class AreaVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 区域id
     */
    @Schema(name ="id", type ="Long", description ="区域id")
    private Long id;

    /**
     * 父区域id
     */
    @Schema(name ="parentId", type ="Long", description ="父区域id")
    private Long parentId;
    /**
     * 区域名字
     */
    @Schema(name ="name", type ="Long", description ="区域名字")
    private String name;

    /**
     * 1:省 2:区 3:县
     */
    @Schema(name ="type", type ="Integer", description ="1:省 2:区 3:县")
    private Integer type;

    /**
     * 1:是 0:否
     */
    @Schema(name ="municipality", type ="Boolean", description ="1:是 0:否")
    private Integer municipality;
}
