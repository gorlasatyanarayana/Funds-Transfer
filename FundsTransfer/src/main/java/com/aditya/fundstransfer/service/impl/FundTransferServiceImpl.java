package com.aditya.fundstransfer.service.impl;

import org.springframework.stereotype.Service;

import com.aditya.fundstransfer.request.InquiryAccountRequest;
import com.aditya.fundstransfer.response.InquiryAccountResponse;
import com.aditya.fundstransfer.service.FundTransferService;

@Service
public class FundTransferServiceImpl implements FundTransferService{

	@Override
	public InquiryAccountResponse inquiryAccount(InquiryAccountRequest req) {
		System.out.println("Entered in method FundTransferServiceImpl.inquiryAccount");
		InquiryAccountResponse response = new InquiryAccountResponse();
		response.setAccountNo(req.getAccountNo());
		response.setAccountName("Test");
		return response;
	}

}
