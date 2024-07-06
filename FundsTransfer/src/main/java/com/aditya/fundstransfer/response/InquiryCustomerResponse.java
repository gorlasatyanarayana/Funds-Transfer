package com.aditya.fundstransfer.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InquiryCustomerResponse implements ResponseVo{
	
	@JsonProperty("customerNo")
	private String customerNo;
	
	@JsonProperty("customerName")
	private String customerName;
	
	@JsonProperty("dob")
	private String dob;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("mobileNo")
	private String mobileNo;

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	
	
	
	

}
