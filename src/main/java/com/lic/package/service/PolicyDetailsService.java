package com.lic.package.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.PolicyDetails;
import com.lic.package.repository.PolicyDetailsRepository;

@Service
public class PolicyDetailsService {
	
	@Autowired
	private PolicyDetailsRepository policyDetailsRepository;
	
	public List<PolicyDetails> findPolicyDetails(String mph_code, String mph_name, String account_number, String sort_1,
			String sort_2, String sort_3, String sort_4, String sort_5, String sort_6, Integer page_no) {
		return policyDetailsRepository.findPolicyDetails(mph_code, mph_name, account_number, sort_1, sort_2, sort_3, sort_4, sort_5, sort_6, page_no);
	}
	
	public int getTotalPages(String mph_code, String mph_name, String account_number) {
		int totalCount = policyDetailsRepository.getTotalCount(mph_code, mph_name, account_number);
		int noOfPages = (int)Math.ceil(totalCount / 10.0);
		return noOfPages;
	}
}