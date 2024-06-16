package com.aditya.fundstransfer.service;

import com.aditya.fundstransfer.request.InquiryAccountRequest;
import com.aditya.fundstransfer.response.InquiryAccountResponse;

public interface FundTransferService {
	
	public InquiryAccountResponse inquiryAccount(InquiryAccountRequest req);

}
