package com.lic.package.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.PMST_MPH;
import com.lic.package.service.PolicyRepository;
import com.lic.package.service.PolicyService;

@RestController
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	@Autowired
	private PolicyRepository policyRepository;

	@GetMapping("/policyDetails/mphId")
	public List<Object[]> getPolicyDetailsByMphId(@RequestParam("mph_id") Long mph_id) {
		return policyService.getPolicyDetailsByMphId(mph_id);
	}

	@GetMapping("/policyDetails/mphIds")
	public List<Object[]> getPolicyDetailsByMphIds(@RequestParam("mph_ids") List<Long> mph_ids) {
		return policyService.getPolicyDetailsByMphIds(mph_ids);
	}

	@GetMapping("/policyDetails/policyNumber")
	public List<Object[]> getPolicyDetailsByPolicyNumber(@RequestParam("policy_number") String policy_number) {
		return policyService.getPolicyDetailsByPolicyNumber(policy_number);
	}

	@GetMapping("/policyDetails/dateRange")
	public List<Object[]> getPolicyDetailsByDateRange(@RequestParam("start_date") Date start_date,
			@RequestParam("end_date") Date end_date) {
		return policyService.getPolicyDetailsByDateRange(start_date, end_date);
	}

}