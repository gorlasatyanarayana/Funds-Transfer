package com.aditya.fundstransfer.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.fundstransfer.model.CustomResponse;
import com.aditya.fundstransfer.model.CustomResponseBody;
import com.aditya.fundstransfer.request.InquiryAccountRequest;
import com.aditya.fundstransfer.response.ResponseVo;
import com.aditya.fundstransfer.service.FundTransferService;
import com.aditya.fundstransfer.util.ResponseBuilder;

@RestController
@RequestMapping("/fundstransfer")
public class FundTransferController {
	
	
	@Autowired
	private ResponseBuilder<ResponseVo> responseBuilder;
	
	@Autowired
	private FundTransferService fundTransferService;
	
	@PostMapping(value = "{version}/inquiry/account")
	public ResponseEntity<CustomResponse<ResponseVo>> inquiryAccount(@PathVariable("version") String version, @RequestBody InquiryAccountRequest req) {
		ResponseVo responseVo = fundTransferService.inquiryAccount(req);
		CustomResponseBody<ResponseVo> response = new CustomResponseBody<>();
		response.setPayload(Collections.singletonList(responseVo));
		response.setErrors(Collections.emptyList());
		
		return ResponseEntity.ok().body(responseBuilder.buildResponse(response));
	}

}
