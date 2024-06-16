package com.aditya.fundstransfer.model;

import java.util.ArrayList;
import java.util.List;

public class CustomResponseBody<T extends Object> {
	private List<T> payload;
	private List<CustomError> errors;
	private String correlationId;
	private String timeStamp;
	
	public CustomResponseBody() {
		payload = new ArrayList<>();
		errors = new ArrayList<>();
	}
	
	
	public CustomResponseBody(List<T> payload, List<CustomError> errors, String correlationId, String timeStamp) {
		super();
		this.payload = payload;
		this.errors = errors;
		this.correlationId = correlationId;
		this.timeStamp = timeStamp;
	}


	public List<T> getPayload() {
		return payload;
	}
	public void setPayload(List<T> payload) {
		this.payload = payload;
	}
	public List<CustomError> getErrors() {
		return errors;
	}
	public void setErrors(List<CustomError> errors) {
		this.errors = errors;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
	
	
}
