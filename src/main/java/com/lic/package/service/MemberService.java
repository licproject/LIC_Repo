for the above entity

package com.lic.package.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.package.model.Member;
import com.lic.package.repository.MemberRepository;

@Service
@Transactional
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	// Create
	public Member save(Member member) {
		return memberRepository.save(member);
	}
	
	// Read 
	public Member findById(int id) {
		return memberRepository.findById(id);
	}
	
	public Member findByAadharNumber(String aadharNumber) {
		return memberRepository.findByAadharNumber(aadharNumber);
	}
	
	public List<Member> findAll() {
		return memberRepository.findAll();
	}
	
	// Update
	public int updateMember(int memberId, String categoryNo, String communicationPreference, String dateOfBirth, String dateOfJoining, String dateOfJoiningScheme, String dateOfRetirement, String designation, String emailId, String fatherName, String firstName, String gender, String isActive, String isZeroId, String landlineNo, String languagePreference, String lastName, String licId, String maritalStatus, String memberPan, String memberStatus, String membershipNumber, String middleName, String mobileNo, String policyId, String spouseName, String typeOfMembership) {
		return memberRepository.updateMember(memberId, categoryNo, communicationPreference, dateOfBirth, dateOfJoining, dateOfJoiningScheme, dateOfRetirement, designation, emailId, fatherName, firstName, gender, isActive, isZeroId, landlineNo, languagePreference, lastName, licId, maritalStatus, memberPan, memberStatus, membershipNumber, middleName, mobileNo, policyId, spouseName, typeOfMembership);
	}
	
	// Delete
	public void deleteById(int id) {
		memberRepository.deleteById(id);
	}
	
	public int deleteByAadharNumber(String aadharNumber) {
		return memberRepository.deleteByAadharNumber(aadharNumber);
	}
	
}