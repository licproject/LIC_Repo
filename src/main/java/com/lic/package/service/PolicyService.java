package com.lic.package.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.Policy;
import com.lic.package.repository.PolicyRepository;

@Service
public class PolicyService {
	
	@Autowired
	private PolicyRepository policyRepository;
	
	public List<Policy> findPoliciesByPolicyNumber(String policyNumber) {
		return policyRepository.findByPolicyNumber(policyNumber);
	}
	
	public List<Policy> findPoliciesBySchemeType(String schemeType) {
		return policyRepository.findBySchemeType(schemeType);
	}
	
	public List<Policy> findPoliciesByMphName(String mphName) {
		return policyRepository.findByMphName(mphName);
	}
	
	public List<Policy> findPoliciesByMphCode(String mphCode) {
		return policyRepository.findByMphCode(mphCode);
	}
	
	public List<Policy> findPoliciesByPolicyStatus(String policyStatus) {
		return policyRepository.findByPolicyStatus(policyStatus);
	} 
}