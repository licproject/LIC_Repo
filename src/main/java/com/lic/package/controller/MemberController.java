package com.lic.package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.POLICY_SRV_MBR;
import com.lic.package.model.POLICY_SRV_MBR_ADD;
import com.lic.package.model.POLICY_SRV_MBR_BANK;
import com.lic.package.model.POLICY_SRV_MBR_NOMI;
import com.lic.package.model.POLICY_SRV_MBR_APOTE;
import com.lic.package.repository.MemberRepository;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@PostMapping("/saveMember")
	public POLICY_SRV_MBR saveMember(POLICY_SRV_MBR member) {
		return memberRepository.save(member);
	}
	
	@PostMapping("/saveAddress")
	public POLICY_SRV_MBR_ADD saveAddress(POLICY_SRV_MBR_ADD address) {
		return memberRepository.save(address);
	}
	
	@PostMapping("/saveBankInformation")
	public POLICY_SRV_MBR_BANK saveBankInformation(POLICY_SRV_MBR_BANK bank) {
		return memberRepository.save(bank);
	}
	
	@PostMapping("/saveAppointee")
	public POLICY_SRV_MBR_APOTE saveAppointee(POLICY_SRV_MBR_APOTE appointee) {
		return memberRepository.save(appointee);
	}
	
	@PostMapping("/saveNominee")
	public POLICY_SRV_MBR_NOMI saveNominee(POLICY_SRV_MBR_NOMI nominee) {
		return memberRepository.save(nominee);
	}
	
	@PutMapping("/updateMember")
	public POLICY_SRV_MBR updateMember(POLICY_SRV_MBR member) {
		return memberRepository.update(member);
	}
	
	@PutMapping("/updateAddress")
	public POLICY_SRV_MBR_ADD updateAddress(POLICY_SRV_MBR_ADD address) {
		return memberRepository.update(address);
	}
	
	@PutMapping("/updateBankInformation")
	public POLICY_SRV_MBR_BANK updateBankInformation(POLICY_SRV_MBR_BANK bank) {
		return memberRepository.update(bank);
	}
	
	@PutMapping("/updateAppointee")
	public POLICY_SRV_MBR_APOTE updateAppointee(POLICY_SRV_MBR_APOTE appointee) {
		return memberRepository.update(appointee);
	}
	
	@PutMapping("/updateNominee")
	public POLICY_SRV_MBR_NOMI updateNominee(POLICY_SRV_MBR_NOMI nominee) {
		return memberRepository.update(nominee);
	}

}