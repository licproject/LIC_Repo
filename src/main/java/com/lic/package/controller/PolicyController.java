package com.lic.package.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyResponseDto;
import com.lic.package.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;
	
	private static final Logger logger = LoggerFactory.getLogger(PolicyController.class);
	
	@PostMapping("/save")
	public ResponseEntity<PolicyResponseDto> savePolicyDetails(@RequestBody PolicyDto policyDto) {
		logger.info("Started processing save policy details for the policyDto={}", policyDto);
		
		PolicyResponseDto policyResponseDto = policyService.savePolicyDetails(policyDto);
		
		return new ResponseEntity<>(policyResponseDto, HttpStatus.OK);
		
	}
	
}