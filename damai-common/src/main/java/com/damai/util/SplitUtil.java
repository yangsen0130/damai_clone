package com.damai.util;

import static com.damai.constant.Constant.GLIDE_LINE;

/**
 * @program: damai
 * @description: 分割工具
 * @author: yangsen
 **/
public class SplitUtil {
    
    public static String[] toSplit(String str) {
        return str.split(GLIDE_LINE);
    }
}
