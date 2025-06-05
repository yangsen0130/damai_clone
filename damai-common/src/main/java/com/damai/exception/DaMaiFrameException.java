package com.damai.exception;

import com.damai.common.ApiResponse;
import com.damai.enums.BaseCode;
import lombok.Data;

/**
 * @program: damai
 * @description: 业务异常
 * @author: yangsen
 **/
@Data
public class DaMaiFrameException extends BaseException {

	private Integer code;
	
	private String message;

	public DaMaiFrameException() {
		super();
	}

	public DaMaiFrameException(String message) {
		super(message);
	}
	
	
	public DaMaiFrameException(String code, String message) {
		super(message);
		this.code = Integer.parseInt(code);
		this.message = message;
	}
	
	public DaMaiFrameException(Integer code, String message) {
		super(message);
		this.code = code;
		this.message = message;
	}
	
	public DaMaiFrameException(BaseCode baseCode) {
		super(baseCode.getMsg());
		this.code = baseCode.getCode();
		this.message = baseCode.getMsg();
	}
	
	public DaMaiFrameException(ApiResponse apiResponse) {
		super(apiResponse.getMessage());
		this.code = apiResponse.getCode();
		this.message = apiResponse.getMessage();
	}

	public DaMaiFrameException(Throwable cause) {
		super(cause);
	}

	public DaMaiFrameException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
	}

	public DaMaiFrameException(Integer code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
		this.message = message;
	}
}
