package com.mangocity.bean;

public class Result {

	private boolean success = false;
	
	private String errorCode;
	
	private String errorMsg;
	
	
	public Result(boolean success) {
		super();
		this.success = success;
	}

	public Result( String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "Result [success=" + success + ", errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}
	
}
