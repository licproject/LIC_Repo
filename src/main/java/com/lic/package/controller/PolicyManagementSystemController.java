package com.lic.package.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.PolicySrvMbr;
import com.lic.package.model.PolicySrvMbrAdd;
import com.lic.package.model.PolicySrvMbrBank;
import com.lic.package.model.PolicySrvMbrNomi;
import com.lic.package.model.PolicySrvMbrApote;
import com.lic.package.repository.PolicyManagementSystemRepository;
import com.lic.package.service.PolicyManagementSystemService;

@RestController
public class PolicyManagementSystemController {

	@Autowired
	private PolicyManagementSystemService policyManagementSystemService;

	// Save Member Details
	@PutMapping("/saveMemberDetails")
	public PolicySrvMbr saveMemberDetails(@RequestBody PolicySrvMbr policySrvMbr) {
		return policyManagementSystemService.saveMemberDetails(policySrvMbr);
	}

	// Update Member Details
	@PutMapping("/updateMemberDetails")
	public void updateMemberDetails(@RequestParam("memberId") Integer memberId, @RequestBody PolicySrvMbr policySrvMbr) {
		policyManagementSystemService.updateMemberDetails(memberId, policySrvMbr);
	}

	// Save Member Address
	@PutMapping("/saveMemberAddress")
	public PolicySrvMbrAdd saveMemberAddress(@RequestBody PolicySrvMbrAdd policySrvMbrAdd) {
		return policyManagementSystemService.saveMemberAddress(policySrvMbrAdd);
	}

	// Save Member Bank Information
	@PutMapping("/saveMemberBankInformation")
	public PolicySrvMbrBank saveMemberBankInformation(@RequestBody PolicySrvMbrBank policySrvMbrBank) {
		return policyManagementSystemService.saveMemberBankInformation(policySrvMbrBank);
	}

	// Save Member Appointee Information
	@PutMapping("/saveMemberAppointeeInformation")
	public PolicySrvMbrApote saveMemberAppointeeInformation(@RequestBody PolicySrvMbrApote policySrvMbrApote) {
		return policyManagementSystemService.saveMemberAppointeeInformation(policySrvMbrApote);
	}

	// Save Member Nominee Information
	@PutMapping("/saveMemberNomineeInformation")
	public PolicySrvMbrNomi saveMemberNomineeInformation(@RequestBody PolicySrvMbrNomi policySrvMbrNomi) {
		return policyManagementSystemService.saveMemberNomineeInformation(policySrvMbrNomi);
	}

}