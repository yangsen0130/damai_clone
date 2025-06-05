package com.damai.exception;

import lombok.Data;

/**
 * @program: damai
 * @description: 参数错误
 * @author: yangsen
 **/
@Data
public class ArgumentError {
	
	private String argumentName;
	
	private String message;
}
