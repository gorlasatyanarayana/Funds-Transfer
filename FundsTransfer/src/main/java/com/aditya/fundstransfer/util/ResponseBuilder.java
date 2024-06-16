package com.aditya.fundstransfer.util;

import org.springframework.stereotype.Component;

import com.aditya.fundstransfer.model.CustomResponse;
import com.aditya.fundstransfer.model.CustomResponseBody;

@Component
public class ResponseBuilder<T> {

	public CustomResponse<T> buildResponse(CustomResponseBody<T> responseBody){
		CustomResponse<T> response = new CustomResponse<>();
		response.setResponseBody(responseBody);
		response.setSuccess(true);
		return response;
	}
}
