package com.lic.package.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.POLICY_SRV_MBR;
import com.lic.package.model.POLICY_SRV_MBR_ADD;
import com.lic.package.model.POLICY_SRV_MBR_BANK;
import com.lic.package.model.POLICY_SRV_MBR_NOMI;
import com.lic.package.model.POLICY_SRV_MBR_APOTE;
import com.lic.package.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;

	public POLICY_SRV_MBR saveMember(POLICY_SRV_MBR member) {
		return memberRepository.save(member);
	}

	public POLICY_SRV_MBR_ADD saveAddress(POLICY_SRV_MBR_ADD address) {
		return memberRepository.save(address);
	}

	public POLICY_SRV_MBR_BANK saveBankInformation(POLICY_SRV_MBR_BANK bank) {
		return memberRepository.save(bank);
	}

	public POLICY_SRV_MBR_APOTE saveAppointee(POLICY_SRV_MBR_APOTE appointee) {
		return memberRepository.save(appointee);
	}

	public POLICY_SRV_MBR_NOMI saveNominee(POLICY_SRV_MBR_NOMI nominee) {
		return memberRepository.save(nominee);
	}

	public POLICY_SRV_MBR updateMember(POLICY_SRV_MBR member) {
		return memberRepository.update(member);
	}

	public POLICY_SRV_MBR_ADD updateAddress(POLICY_SRV_MBR_ADD address) {
		return memberRepository.update(address);
	}

	public POLICY_SRV_MBR_BANK updateBankInformation(POLICY_SRV_MBR_BANK bank) {
		return memberRepository.update(bank);
	}

	public POLICY_SRV_MBR_APOTE updateAppointee(POLICY_SRV_MBR_APOTE appointee) {
		return memberRepository.update(appointee);
	}

	public POLICY_SRV_MBR_NOMI updateNominee(POLICY_SRV_MBR_NOMI nominee) {
		return memberRepository.update(nominee);
	}

}