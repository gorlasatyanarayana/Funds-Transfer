package com.aditya.fundstransfer.service.impl;

import org.springframework.stereotype.Service;

import com.aditya.fundstransfer.request.InquiryAccountRequest;
import com.aditya.fundstransfer.request.InquiryCustomerRequest;
import com.aditya.fundstransfer.response.InquiryAccountResponse;
import com.aditya.fundstransfer.response.InquiryCustomerResponse;
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

	@Override
	public InquiryCustomerResponse inquiryCustomer(InquiryCustomerRequest req) {
		System.out.println("Entered in method FundTransferServiceImpl.inquiryCustomer");
		InquiryCustomerResponse response = new InquiryCustomerResponse();
		response.setCustomerNo(req.getCustomerNo());		
		response.setCustomerName("Gorla");
		response.setDob("01/06/1985");
		response.setEmail("test@gmail.com");
		response.setMobileNo("018908271618");
		
		return response;
	}

}
