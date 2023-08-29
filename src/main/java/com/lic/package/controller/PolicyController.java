package com.lic.package.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.Policy;
import com.lic.package.service.PolicyService;

@RestController
@RequestMapping("/policies")
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	@GetMapping("/{policyNumber}")
	public ResponseEntity<List<Policy>> getPoliciesByPolicyNumber(@PathVariable("policyNumber") String policyNumber) {
		List<Policy> policies = policyService.findByPolicyNumber(policyNumber);
		if (policies == null || policies.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(policies, HttpStatus.OK);
	}

	@GetMapping("/schemeType/{schemeType}")
	public ResponseEntity<List<Policy>> getPoliciesBySchemeType(@PathVariable("schemeType") String schemeType) {
		List<Policy> policies = policyService.findBySchemeType(schemeType);
		if (policies == null || policies.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(policies, HttpStatus.OK);
	}

	@GetMapping("/mphName/{mphName}")
	public ResponseEntity<List<Policy>> getPoliciesByMphName(@PathVariable("mphName") String mphName) {
		List<Policy> policies = policyService.findByMphName(mphName);
		if (policies == null || policies.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(policies, HttpStatus.OK);
	}

	@GetMapping("/mphCode/{mphCode}")
	public ResponseEntity<List<Policy>> getPoliciesByMphCode(@PathVariable("mphCode") String mphCode) {
		List<Policy> policies = policyService.findByMphCode(mphCode);
		if (policies == null || policies.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(policies, HttpStatus.OK);
	}

	@GetMapping("/status/{policyStatus}")
	public ResponseEntity<List<Policy>> getPoliciesByPolicyStatus(@PathVariable("policyStatus") String policyStatus) {
		List<Policy> policies = policyService.findByPolicyStatus(policyStatus);
		if (policies == null || policies.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(policies, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Policy>> getAllPolicies() {
		List<Policy> policies = policyService.getAllPolicies();
		if (policies == null || policies.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(policies, HttpStatus.OK);
	}

}