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
	
	public List<PolicyDetails> getPolicyDetails(String mphCode, String mphName, String accountNumber, 
			boolean sortByMphNameAsc, boolean sortByMphNameDesc, boolean sortByBankNameAsc, boolean sortByBankNameDesc, 
			boolean sortByBankBranchAsc, boolean sortByBankBranchDesc, boolean sortByAccountNumberAsc, boolean sortByAccountNumberDesc, 
			boolean sortByCityLocalityAsc, boolean sortByCityLocalityDesc, boolean sortByDistrictAsc, boolean sortByDistrictDesc, int pageNumber) {
		return policyDetailsRepository.getPolicyDetails(mphCode, mphName, accountNumber, 
				sortByMphNameAsc, sortByMphNameDesc, sortByBankNameAsc, sortByBankNameDesc, 
				sortByBankBranchAsc, sortByBankBranchDesc, sortByAccountNumberAsc, sortByAccountNumberDesc, 
				sortByCityLocalityAsc, sortByCityLocalityDesc, sortByDistrictAsc, sortByDistrictDesc, pageNumber);
	}

}