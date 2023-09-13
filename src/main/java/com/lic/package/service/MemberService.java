NO = :categoryNo, COMMUNICATION_PREFERENCE = :communicationPreference, CREATED_BY = :createdBy, DATE_OF_BIRTH = :dateOfBirth, DATE_OF_JOINING = :dateOfJoining, DATE_OF_JOINING_SCHEME = :dateOfJoiningScheme, DATE_OF_RETIREMENT = :dateOfRetirement, DESIGNATION = :designation, EMAILID = :emailId, FATHER_NAME = :fatherName, FIRST_NAME = :firstName, GENDER = :gender, IS_ACTIVE = :isActive, IS_ZEROID = :isZeroId, LANDLINE_NO = :landlineNo, LANGUAGE_PREFERENCE = :languagePreference, LAST_NAME = :lastName, LIC_ID = :licId, MARITAL_STATUS = :maritalStatus, MEMBER_PAN = :memberPan, MEMBER_STATUS = :memberStatus, MEMBERSHIP_NUMBER = :membershipNumber, MIDDLE_NAME = :middleName, MOBILE_NO = :mobileNo WHERE MEMBER_ID = :memberId", nativeQuery = true)
public void updateMemberDetails(@Param("memberId") String memberId, 
							@Param("aadharNumber") String aadharNumber,
							@Param("categoryNo") String categoryNo,
							@Param("communicationPreference") String communicationPreference,
							@Param("createdBy") String createdBy,
							@Param("dateOfBirth") Long dateOfBirth,
							@Param("dateOfJoining") Long dateOfJoining,
							@Param("dateOfJoiningScheme") Long dateOfJoiningScheme,
							@Param("dateOfRetirement") Long dateOfRetirement,
							@Param("designation") String designation,
							@Param("emailId") String emailId,
							@Param("fatherName") String fatherName,
							@Param("firstName") String firstName,
							@Param("gender") String gender,
							@Param("isActive") String isActive,
							@Param("isZeroId") String isZeroId,
							@Param("landlineNo") String landlineNo,
							@Param("languagePreference") String languagePreference,
							@Param("lastName") String lastName,
							@Param("licId") String licId,
							@Param("maritalStatus") String maritalStatus,
							@Param("memberPan") String memberPan,
							@Param("memberStatus") String memberStatus,
							@Param("membershipNumber") String membershipNumber,
							@Param("middleName") String middleName,
							@Param("mobileNo") String mobileNo);

}

package com.lic.package.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.Member;
import com.lic.package.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepo;
	
	public Member saveMemberDetails(Member member) {
		member.setCreatedOn(LocalDateTime.now());
		member.setModifiedOn(LocalDateTime.now());
		memberRepo.saveMemberDetails(
				member.getMemberId(), 
				member.getAadharNumber(), 
				member.getCategoryNo(), 
				member.getCommunicationPreference(), 
				member.getCreatedBy(), 
				member.get