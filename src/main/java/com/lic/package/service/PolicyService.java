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
	
	public List<Policy> findByPolicyNumber(String policyNumber) {
		return policyRepository.findByPolicyNumber(policyNumber);
	}
	
	public List<Policy> findBySchemeType(String schemeType) {
		return policyRepository.findBySchemeType(schemeType);
	}
	
	public List<Policy> findByMphName(String mphName) {
		return policyRepository.findByMphName(mphName);
	}
	
	public List<Policy> findByMphCode(String mphCode) {
		return policyRepository.findByMphCode(mphCode);
	}
	
	public List<Policy> findByPolicyStatus(String policyStatus) {
		return policyRepository.findByPolicyStatus(policyStatus);
	}
	
	public List<Policy> findByAll(String policyNumber, String schemeType, String mphName, String mphCode, String policyStatus) {
		return policyRepository.findByAll(policyNumber, schemeType, mphName, mphCode, policyStatus);
	}
}