Solution:
//Saving Member Details
INSERT INTO POLICY_SRV_MBR (MEMBER_ID, AADHAR_NUMBER, CATEGORY_NO, COMMUNICATION_PREFERENCE, CREATED_BY, CREATED_ON, DATE_OF_BIRTH, DATE_OF_JOINING, DATE_OF_JOINING_SCHEME, DATE_OF_RETIREMENT, DESIGNATION, EMAILID, FATHER_NAME, FIRST_NAME, GENDER, IS_ACTIVE, IS_ZEROID, LANDLINE_NO, LANGUAGE_PREFERENCE, LAST_NAME, LIC_ID, MARITAL_STATUS, MEMBER_PAN, MEMBER_STATUS, MEMBERSHIP_NUMBER, MIDDLE_NAME, MOBILE_NO, POLICY_ID, SPOUSE_NAME, TYPE_OF_MEMBERSHIP)
VALUES (MEMBER_ID, :aadharNumber, :categoryNo, :communicationPreference, :createdBy, CURRENT_TIMESTAMP, :dateOfBirth, :dateOfJoining, :dateOfJoiningScheme, :dateOfRetirement, :designation, :emailId, :fatherName, :firstName, :gender, :isActive, :isZeroId, :landlineNo, :languagePreference, :lastName, :licId, :maritalStatus, :memberPan, :memberStatus, :membershipNumber, :middleName, :mobileNo, :policyId, :spouseName, :typeOfMembership);

//Updating Member Details
UPDATE POLICY_SRV_MBR SET
    AADHAR_NUMBER = :aadharNumber,
    CATEGORY_NO = :categoryNo,
    COMMUNICATION_PREFERENCE = :communicationPreference,
    CREATED_BY = :createdBy,
    DATE_OF_BIRTH = :dateOfBirth,
    DATE_OF_JOINING = :dateOfJoining,
    DATE_OF_JOINING_SCHEME = :dateOfJoiningScheme,
    DATE_OF_RETIREMENT = :dateOfRetirement,
    DESIGNATION = :designation,
    EMAILID = :emailId,
    FATHER_NAME = :fatherName,
    FIRST_NAME = :firstName,
    GENDER = :gender,
    IS_ACTIVE = :isActive,
    IS_ZEROID = :isZeroId,
    LANDLINE_NO = :landlineNo,
    LANGUAGE_PREFERENCE = :languagePreference,
    LAST_NAME = :lastName,
    LIC_ID = :licId,
    MARITAL_STATUS = :maritalStatus,
    MEMBER_PAN = :memberPan,
    MEMBER_STATUS = :memberStatus,
    MEMBERSHIP_NUMBER = :membershipNumber,
    MIDDLE_NAME = :middleName,
    MOBILE_NO = :mobileNo,
    POLICY_ID = :policyId,
    SPOUSE_NAME = :spouseName,
    TYPE_OF_MEMBERSHIP = :typeOfMembership,
    MODIFIED_BY = :modifiedBy,
    MODIFIED_ON = CURRENT_TIMESTAMP
WHERE MEMBER_ID = :memberId;

package com.lic.package.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.package.repository.MemberDetailsRepository;
import com.lic.package.entity.MemberDetails;

@Service
public class MemberDetailsService {

    @Autowired
    private MemberDetailsRepository memberDetailsRepository;

    //Saving Member Details
    public int saveMemberDetails(MemberDetails memberDetails) {
        return memberDetailsRepository.saveMemberDetails(memberDetails.getAadharNumber(), memberDetails.getCategoryNo(), memberDetails.getCommunicationPreference(),
                memberDetails.getCreatedBy(), memberDetails.getDateOfBirth(), memberDetails.getDateOfJoining(), memberDetails.getDateOfJoiningScheme(), 
                memberDetails.getDateOfRetirement(), memberDetails.getDesignation(), memberDetails.getEmailId(), memberDetails