package com.lic.package.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.PolicyMember;
import com.lic.package.model.MemberAddress;
import com.lic.package.model.BankInformation;
import com.lic.package.model.Nominee;
import com.lic.package.model.Appointee;
import com.lic.package.repository.PolicyRepository;

@Service
public class PolicyService {
	
	@Autowired
	private PolicyRepository policyRepository;
	
	// For Policy Members (POLICY_SRV_MBR)
	public PolicyMember createPolicyMember(PolicyMember pm) {
		pm.setCreatedBy("systemAdmin");
		pm.setCreatedOn(new Date());
		pm.setModifiedBy("systemAdmin");
		pm.setModifiedOn(new Date());
		return policyRepository.save(pm);
	}

	public PolicyMember updatePolicyMember(Long memberId, PolicyMember pm) {
		Optional<PolicyMember> policyMember = policyRepository.findById(memberId);
		if (policyMember.isPresent()) {
			pm.setMemberId(memberId);
			pm.setModifiedBy("systemAdmin");
			pm.setModifiedOn(new Date());
			return policyRepository.save(pm);
		}
		return null;
	}
	
	public PolicyMember getPolicyMemberById(Long memberId) {
		Optional<PolicyMember> policyMember = policyRepository.findById(memberId);
		if (policyMember.isPresent()) {
			return policyMember.get();
		}
		return null;
	}
	
	public List<PolicyMember> getAllPolicyMembers() {
		return policyRepository.findAll();
	}
	
	// For Member Addresses (POLICY_SRV_MBR_ADRS)
	public MemberAddress createMemberAddress(MemberAddress ma) {
		ma.setCreatedBy("systemAdmin");
		ma.setCreatedOn(new Date());
		ma.setModifiedBy("systemAdmin");
		ma.setModifiedOn(new Date());
		return policyRepository.save(ma);
	}
	
	public MemberAddress updateMemberAddress(Long memberAdditionId, MemberAddress ma) {
		Optional<MemberAddress> memberAddress = policyRepository.findById(memberAdditionId);
		if (memberAddress.isPresent()) {
			ma.setMemberAdditionId(memberAdditionId);
			ma.setModifiedBy("systemAdmin");
			ma.setModifiedOn(new Date());
			return policyRepository.save(ma);
		}
		return null;
	}
	
	public MemberAddress getMemberAddressById(Long memberAdditionId) {
		Optional<MemberAddress> memberAddress = policyRepository.findById(memberAdditionId);
		if (memberAddress.isPresent()) {
			return memberAddress.get();
		}
		return null;
	}
	
	public List<MemberAddress> getAllMemberAddresses() {
		return policyRepository.findAll();
	}
	
	// For Bank Information (POLICY_SRV_MBR_BANK)
	public BankInformation createBankInformation(BankInformation bi) {
		bi.setCreatedBy("systemAdmin");
		bi.setCreatedOn(new Date());
		bi.setModifiedBy("systemAdmin");
		bi.setModifiedOn(new Date());
		return policyRepository.save(bi);
	}
	
	public BankInformation updateBankInformation(Long bankId, BankInformation bi) {
		Optional<BankInformation> bankInformation = policyRepository.findById(bankId);
		if (bankInformation.isPresent()) {
			bi.setBankId(bankId);
			bi.setModifiedBy("systemAdmin");
			