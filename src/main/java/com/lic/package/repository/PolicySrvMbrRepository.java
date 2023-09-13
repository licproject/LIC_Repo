package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicySrvMbrRepository extends JpaRepository<PolicySrvMbr, Long> {

    @Modifying
    @Query(value = "MERGE INTO POLICY_SRV_MBR tgt " +
                   "USING (SELECT :memberId AS MEMBER_ID, :aadharNumber AS AADHAR_NUMBER, :categoryNo AS CATEGORY_NO, " +
                   ":communicationPreference AS COMMUNICATION_PREFERENCE, :createdBy AS CREATED_BY, :createdOn AS CREATED_ON, " +
                   ":dateOfBirth AS DATE_OF_BIRTH, :dateOfJoining AS DATE_OF_JOINING, :dateOfJoiningScheme AS DATE_OF_JOINING_SCHEME, " +
                   ":dateOfRetriement AS DATE_OF_RETRIREMENT, :designation AS DESIGNATION, :emailId AS EMAILID, :fatherName AS FATHER_NAME, " +
                   ":firstName AS FIRST_NAME, :gender AS GENDER, :isActive AS IS_ACTIVE, :isZeroId AS IS_ZEROID, :landlineNo AS LANDLINE_NO, " +
                   ":languagePreference AS LANGUAGE_PREFERENCE, :lastName AS LAST_NAME, :licId AS LIC_ID, :maritalStatus AS MARITAL_STATUS, " +
                   ":memberAdditionId AS MEMBER_ADDITION_ID, :memberPan AS MEMBER_PAN, :memberStatus AS MEMBER_STATUS, :membershipNumber AS MEMBERSHIP_NUMBER, " +
                   ":middleName AS MIDDLE_NAME, :mobileNo AS MOBILE_NO, :modifiedBy AS MODIFIED_BY, :modifiedOn AS MODIFIED_ON, :policyId AS POLICY_ID, " +
                   ":spouseName AS SPOUSE_NAME, :typeOfMembership AS TYPE_OF_MEMEBERSHIP, :annuityOption AS ANNUITY_OPTION, :batchId AS BATCH_ID, " +
                   ":category AS CATEGORY, :employeeContribution AS EMPLOYEE_CONTRIBUTION, :employerContribution AS EMPLOYER_CONTRIBUTION, " +
                   ":frequency AS FREQUENCY, :mphCode AS MPH_CODE, :mphName AS MPH_NAME, :pan AS PAN, :phone AS PHONE, :policyNo AS POLICY_NO, " +
                   ":policyStatus AS POLICY_STATUS, :product AS PRODUCT, :quotationId AS QUOTATION_ID, :quotationType AS QUOTATION_TYPE, " +
                   ":refLicId AS REF_LIC_ID, :role AS ROLE, :serviceId AS SERVICE_ID, :serviceNumber AS SERVICE_NUMBER, :serviceStatus AS SERVICE_STATUS, " +
                   ":totalContribution AS TOTAL_CONTRIBUTION, :totalInterestedAccured AS TOTAL_INTERESTED_ACCURED, :unitCode AS UNIT_CODE, " +
                   ":voluntaryContribution AS VOLUNTARY_CONTRIBUTION, :memberShipId AS MEMBER_SHIP_ID FROM DUAL) src " +
                   "ON (tgt.MEMBER_ID = src.MEMBER_ID) " +
                   "WHEN MATCHED THEN " +
                   "UPDATE SET tgt.AADHAR_NUMBER = src.AADHAR_NUMBER, tgt.CATEGORY_NO = src.CATEGORY_NO, tgt.COMMUNICATION_PREFERENCE = src.COMMUNICATION_PREFERENCE, " +
                   "tgt.CREATED_BY = src.CREATED_BY, tgt.CREATED_ON = src.CREATED_ON, tgt.DATE_OF_BIRTH = src.