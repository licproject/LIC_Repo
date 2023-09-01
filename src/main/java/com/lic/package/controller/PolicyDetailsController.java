package com.lic.package.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.PolicyDetails;
import com.lic.package.service.PolicyDetailsService;

@RestController
public class PolicyDetailsController {
	
	@Autowired
	private PolicyDetailsService policyDetailsService;
	
	@GetMapping(value = "/getPolicyDetails")
	public List<PolicyDetails> getPolicyDetails(@RequestParam String mphCode, @RequestParam String mphName, @RequestParam String accountNumber, 
			@RequestParam boolean sortByMphNameAsc, @RequestParam boolean sortByMphNameDesc, @RequestParam boolean sortByBankNameAsc, @RequestParam boolean sortByBankNameDesc, 
			@RequestParam boolean sortByBankBranchAsc, @RequestParam boolean sortByBankBranchDesc, @RequestParam boolean sortByAccountNumberAsc, @RequestParam boolean sortByAccountNumberDesc, 
			@RequestParam boolean sortByCityLocalityAsc, @RequestParam boolean sortByCityLocalityDesc, @RequestParam boolean sortByDistrictAsc, @RequestParam boolean sortByDistrictDesc, @RequestParam int pageNumber) {
		return policyDetailsService.getPolicyDetails(mphCode, mphName, accountNumber, 
				sortByMphNameAsc, sortByMphNameDesc, sortByBankNameAsc, sortByBankNameDesc, 
				sortByBankBranchAsc, sortByBankBranchDesc, sortByAccountNumberAsc, sortByAccountNumberDesc, 
				sortByCityLocalityAsc, sortByCityLocalityDesc, sortByDistrictAsc, sortByDistrictDesc, pageNumber);
	}

}