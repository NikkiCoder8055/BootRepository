package com.boot.Util;

public class apiResponse {

	private String message;
	private boolean success;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public apiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public apiResponse(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}

}
