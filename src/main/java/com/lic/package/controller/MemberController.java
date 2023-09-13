DateOfBirth(),
				member.getDateOfJoining(),
				member.getDateOfJoiningScheme(),
				member.getDateOfRetirement(),
				member.getDesignation(),
				member.getEmailId(),
				member.getFatherName(),
				member.getFirstName(),
				member.getGender(),
				member.getIsActive(),
				member.getIsZeroId(),
				member.getLandlineNo(),
				member.getLanguagePreference(),
				member.getLastName(),
				member.getLicId(),
				member.getMaritalStatus(),
				member.getMemberPan(),
				member.getMemberStatus(),
				member.getMembershipNumber(),
				member.getMiddleName(),
				member.getMobileNo());
		return member;
	}
	
	public Optional<Member> getMemberDetails(String memberId) {
		return memberRepo.getMemberDetails(memberId);
	}
	
	@Modifying
	@Query(value = "UPDATE POLICY_SRV_MBR SET AADHAR_NUMBER = :aadharNumber, 
package com.lic.package.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.Member;
import com.lic.package.service.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	@PutMapping("/updateMemberDetails")
	public void updateMemberDetails(@RequestParam("memberId") String memberId, 
							@RequestParam("aadharNumber") String aadharNumber,
							@RequestParam("categoryNo") String categoryNo,
							@RequestParam("communicationPreference") String communicationPreference,
							@RequestParam("createdBy") String createdBy,
							@RequestParam("dateOfBirth") Long dateOfBirth,
							@RequestParam("dateOfJoining") Long dateOfJoining,
							@RequestParam("dateOfJoiningScheme") Long dateOfJoiningScheme,
							@RequestParam("dateOfRetirement") Long dateOfRetirement,
							@RequestParam("designation") String designation,
							@RequestParam("emailId") String emailId,
							@RequestParam("fatherName") String fatherName,
							@RequestParam("firstName") String firstName,
							@RequestParam("gender") String gender,
							@RequestParam("isActive") String isActive,
							@RequestParam("isZeroId") String isZeroId,
							@RequestParam("landlineNo") String landlineNo,
							@RequestParam("languagePreference") String languagePreference,
							@RequestParam("lastName") String lastName,
							@RequestParam("licId") String licId,
							@RequestParam("maritalStatus") String maritalStatus,
							@RequestParam("memberPan") String memberPan,
							@RequestParam("memberStatus") String memberStatus,
							@RequestParam("membershipNumber") String membershipNumber,
							@RequestParam("middleName") String middleName,
	