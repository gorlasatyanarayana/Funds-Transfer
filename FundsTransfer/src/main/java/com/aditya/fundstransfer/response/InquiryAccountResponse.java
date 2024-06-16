package com.aditya.fundstransfer.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InquiryAccountResponse implements ResponseVo{
	@JsonProperty("accountNo")
	private String accountNo;
	
	@JsonProperty("accountName")
	private String accountName;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	

}
