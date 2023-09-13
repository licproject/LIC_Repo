package com.lic.package.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.PolicySrvMbr;
import com.lic.package.model.PolicySrvMbrAdd;
import com.lic.package.model.PolicySrvMbrBank;
import com.lic.package.model.PolicySrvMbrNomi;
import com.lic.package.model.PolicySrvMbrApote;
import com.lic.package.repository.PolicyManagementSystemRepository;

@Service
public class PolicyManagementSystemService {

	@Autowired
	private PolicyManagementSystemRepository policyManagementSystemRepository;

	// Save Member Details
	public PolicySrvMbr saveMemberDetails(PolicySrvMbr policySrvMbr) {
		return policyManagementSystemRepository.save(policySrvMbr);
	}

	// Update Member Details
	public void updateMemberDetails(Integer memberId, PolicySrvMbr policySrvMbr) {
		Optional<PolicySrvMbr> existingMember = policyManagementSystemRepository.findById(memberId);
		if (existingMember.isPresent()) {
			policySrvMbr.setId(memberId);
			policyManagementSystemRepository.save(policySrvMbr);
		}
	}

	// Save Member Address
	public PolicySrvMbrAdd saveMemberAddress(PolicySrvMbrAdd policySrvMbrAdd) {
		return policyManagementSystemRepository.save(policySrvMbrAdd);
	}

	// Save Member Bank Information
	public PolicySrvMbrBank saveMemberBankInformation(PolicySrvMbrBank policySrvMbrBank) {
		return policyManagementSystemRepository.save(policySrvMbrBank);
	}

	// Save Member Appointee Information
	public PolicySrvMbrApote saveMemberAppointeeInformation(PolicySrvMbrApote policySrvMbrApote) {
		return policyManagementSystemRepository.save(policySrvMbrApote);
	}

	// Save Member Nominee Information
	public PolicySrvMbrNomi saveMemberNomineeInformation(PolicySrvMbrNomi policySrvMbrNomi) {
		return policyManagementSystemRepository.save(policySrvMbrNomi);
	}

}