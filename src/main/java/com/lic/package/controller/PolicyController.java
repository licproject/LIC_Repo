package com.lic.package.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.Policy;
import com.lic.package.service.PolicyService;

@RestController
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;
	
	@GetMapping("/policies")
	public List<Policy> getPoliciesByCriteria(@RequestParam(required = false) String policyNumber, 
											@RequestParam(required = false) String schemeType,
											@RequestParam(required = false) String mphName, 
											@RequestParam(required = false) String mphCode,
											@RequestParam(required = false) String policyStatus) {
		
		if(policyNumber != null) {
			return policyService.findPoliciesByPolicyNumber(policyNumber);
		}
		
		if(schemeType != null) {
			return policyService.findPoliciesBySchemeType(schemeType);
		}
		
		if(mphName != null) {
			return policyService.findPoliciesByMphName(mphName);
		}
		
		if(mphCode != null) {
			return policyService.findPoliciesByMphCode(mphCode);
		}
		
		if(policyStatus != null) {
			return policyService.findPoliciesByPolicyStatus(policyStatus);
		}
		
		return null;
	}

}