package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

//Saving Member Details
@Query(value = "INSERT INTO POLICY_SRV_MBR(MEMBER_ID, AADHAR_NUMBER, CATEGORY_NO, COMMUNICATION_PREFERENCE, CREATED_BY, CREATED_ON, DATE_OF_BIRTH, DATE_OF_JOINING, DATE_OF_JOINING_SCHEME, DATE_OF_RETIREMENT, DESIGNATION, EMAILID, FATHER_NAME, FIRST_NAME, GENDER, IS_ACTIVE, IS_ZEROID, LANDLINE_NO, LANGUAGE_PREFERENCE, LAST_NAME, LIC_ID, MARITAL_STATUS, MEMBER_PAN, MEMBER_STATUS, MEMBERSHIP_NUMBER, MIDDLE_NAME, MOBILE_NO) 
VALUES (:memberId, :aadharNumber, :categoryNo, :communicationPreference, :createdBy, :createdOn, :dateOfBirth, :dateOfJoining, :dateOfJoiningScheme, :dateOfRetirement, :designation, :emailId, :fatherName, :firstName, :gender, :isActive, :isZeroId, :landlineNo, :languagePreference, :lastName, :licId, :maritalStatus, :memberPan, :memberStatus, :membershipNumber, :middleName, :mobileNo)", nativeQuery = true)
public void saveMemberDetails(@Param("memberId") String memberId, 
							@Param("aadharNumber") String aadharNumber,
							@Param("categoryNo") String categoryNo,
							@Param("communicationPreference") String communicationPreference,
							@Param("createdBy") String createdBy,
							@Param("createdOn") Long createdOn,
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

//Updating Member Details
@Modifying
@Query(value = "UPDATE POLICY_SRV_MBR SET AADHAR_NUMBER = :aadharNumber, CATEGORY_