package com.aditya.fundstransfer.model;

public class CustomResponse<T> {
	
	private CustomResponseBody<T> responseBody;
	private boolean success;
	public CustomResponseBody<T> getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(CustomResponseBody<T> responseBody) {
		this.responseBody = responseBody;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	

}
