package com.aditya.fundstransfer.service;

import com.aditya.fundstransfer.request.InquiryAccountRequest;
import com.aditya.fundstransfer.request.InquiryCustomerRequest;
import com.aditya.fundstransfer.response.InquiryAccountResponse;
import com.aditya.fundstransfer.response.InquiryCustomerResponse;

public interface FundTransferService {
	
	public InquiryAccountResponse inquiryAccount(InquiryAccountRequest req);
	public InquiryCustomerResponse inquiryCustomer(InquiryCustomerRequest req);

}
