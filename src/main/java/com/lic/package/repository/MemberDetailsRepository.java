package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.lic.package.entity.MemberDetails;

@Repository
public interface MemberDetailsRepository extends JpaRepository<MemberDetails, String> {

  //Saving Member Details
  @Modifying
  @Query("INSERT INTO POLICY_SRV_MBR (AADHAR_NUMBER, CATEGORY_NO, COMMUNICATION_PREFERENCE, CREATED_BY, DATE_OF_BIRTH, DATE_OF_JOINING, DATE_OF_JOINING_SCHEME, DATE_OF_RETIREMENT, DESIGNATION, EMAILID, FATHER_NAME, FIRST_NAME, GENDER, IS_ACTIVE, IS_ZEROID, LANDLINE_NO, LANGUAGE_PREFERENCE, LAST_NAME, LIC_ID, MARITAL_STATUS, MEMBER_PAN, MEMBER_STATUS, MEMBERSHIP_NUMBER, MIDDLE_NAME, MOBILE_NO, POLICY_ID, SPOUSE_NAME, TYPE_OF_MEMBERSHIP)"
  + "VALUES (:aadharNumber, :categoryNo, :communicationPreference, :createdBy, :dateOfBirth, :dateOfJoining, :dateOfJoiningScheme, :dateOfRetirement, :designation, :emailId, :fatherName, :firstName, :gender, :isActive, :isZeroId, :landlineNo, :languagePreference, :lastName, :licId, :maritalStatus, :memberPan, :memberStatus, :membershipNumber, :middleName, :mobileNo, :policyId, :spouseName, :typeOfMembership)")
  public int saveMemberDetails(@Param("aadharNumber") String aadharNumber, @Param("categoryNo") String categoryNo, @Param("communicationPreference") String communicationPreference, @Param("createdBy") String createdBy, @Param("dateOfBirth") String dateOfBirth, @Param("dateOfJoining") String dateOfJoining, @Param("dateOfJoiningScheme") String dateOfJoiningScheme, @Param("dateOfRetirement") String dateOfRetirement, @Param("designation") String designation, @Param("emailId") String emailId, @Param("fatherName") String fatherName, @Param("firstName") String firstName, @Param("gender") String gender, @Param("isActive") String isActive, @Param("isZeroId") String isZeroId, @Param("landlineNo") String landlineNo, @Param("languagePreference") String languagePreference, @Param("lastName") String lastName, @Param("licId") String licId, @Param("maritalStatus") String maritalStatus, @Param("memberPan") String memberPan, @Param("memberStatus") String memberStatus, @Param("membershipNumber") String membershipNumber, @Param("middleName") String middleName, @Param("mobileNo") String mobileNo, @Param("policyId") String policyId, @Param("spouseName") String spouseName, @Param("typeOfMembership") String typeOfMembership);

//Updating Member Details
@Modifying
@Query("UPDATE POLICY_SRV_MBR SET AADHAR_NUMBER = :aadharNumber, CATEGORY_NO = :categoryNo, COMMUNICATION_PREFERENCE = :communicationPreference, CREATED_BY = :createdBy, DATE_OF_BIRTH = :dateOfBirth, DATE_OF_JOINING = :dateOfJoining, DATE_OF_JOINING_SCHEME = :dateOfJoiningScheme, DATE_OF_RETIREMENT = :dateOfRetirement, DESIGNATION = :designation, EMAILID = :emailId, FATHER_NAME = :fatherName, FIRST_NAME = :firstName, GENDER = :gender, IS_ACTIVE = :isActive, IS_ZEROID = :isZeroId, LANDLINE_