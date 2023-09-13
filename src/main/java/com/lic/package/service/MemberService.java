package com.lic.package.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.entity.PolicySrvMbr;
import com.lic.package.entity.PolicySrvMbrAdd;
import com.lic.package.entity.PolicySrvMbrBank;
import com.lic.package.entity.PolicySrvMbrNomi;
import com.lic.package.entity.PolicySrvMbrApote;
import com.lic.package.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	//Saving Member Details
	public void save(PolicySrvMbr policySrvMbr) {
		Timestamp createdOn = new Timestamp(new Date().getTime());
		policySrvMbr.setCreatedOn(createdOn);
		memberRepository.save(policySrvMbr);
	}
	
	//Updating Member Details
	public void updateMember(Long memberId, PolicySrvMbr policySrvMbr) {
		Timestamp modifiedOn = new Timestamp(new Date().getTime());
		policySrvMbr.setModifiedOn(modifiedOn);
		memberRepository.updateMember(memberId, policySrvMbr);
	}
	
	//Saving Member Address
	public void saveAddress(PolicySrvMbrAdd policySrvMbrAdd) {
		Timestamp createdOn = new Timestamp(new Date().getTime());
		policySrvMbrAdd.setCreatedOn(createdOn);
		memberRepository.saveAddress(policySrvMbrAdd);
	}
	
	//Saving Member Bank Information
	public void saveBank(PolicySrvMbrBank policySrvMbrBank) {
		Timestamp createdOn = new Timestamp(new Date().getTime());
		policySrvMbrBank.setCreatedOn(createdOn);
		memberRepository.saveBank(policySrvMbrBank);
	}
	
	//Saving Member Appointee Information
	public void saveAppointee(PolicySrvMbrApote policySrvMbrApote) {
		Timestamp createdOn = new Timestamp(new Date().getTime());
		policySrvMbrApote.setCreatedOn(createdOn);
		memberRepository.saveAppointee(policySrvMbrApote);
	}
	
	//Saving Member Nominee Information
	public void saveNominee(PolicySrvMbrNomi policySrvMbrNomi) {
		Timestamp createdOn = new Timestamp(new Date().getTime());
		policySrvMbrNomi.setCreatedOn(createdOn);
		memberRepository.saveNominee(policySrvMbrNomi);
	}
}