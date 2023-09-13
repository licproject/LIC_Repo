o   The following fields must be updated when changes are made:  EMPLOYEE_CONTRIBUTION, EMPLOYER_CONTRIBUTION, IS_ACTIVE, LINE_OF_BUSINESS, MEMBER_ADDITION_STATUS, MODIFIED_BY, MODIFIED_ON, MPH_CODE, MPH_NAME, POLICY_ID, POLICY_MBR_NO, POLICY_NUMBER, POLICY_STATUS, PRODUCT, REJECTION_REASON_CODE, REJECTION_REMARKS, SERVICE_ID, SERVICE_NUMBER, SERVICE_STATUS, TOTAL_CONTRIBUTION, UNIT_CODE, VOLUNTARY_CONTRIBUTION, NO_OF_CATEGORY

package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicySrvMbrAddRepository extends JpaRepository<PolicySrvMbrAdd, Long> {

    // Save member address
    @Query("INSERT INTO POLICY_SRV_MBR_ADD (CREATED_BY, CREATED_ON, EMPLOYEE_CONTRIBUTION, EMPLOYER_CONTRIBUTION, IS_ACTIVE, LINE_OF_BUSINESS, MEMBER_ADDITION_STATUS, MODIFIED_BY, MODIFIED_ON, MPH_CODE, MPH_NAME, POLICY_ID, POLICY_MBR_NO, POLICY_NUMBER, POLICY_STATUS, PRODUCT, REJECTION_REASON_CODE, REJECTION_REMARKS, SERVICE_ID, SERVICE_NUMBER, SERVICE_STATUS, TOTAL_CONTRIBUTION, UNIT_CODE, VOLUNTARY_CONTRIBUTION, NO_OF_CATEGORY) VALUES (:createdBy, :createdOn, :employeeContribution, :employerContribution, :isActive, :lineOfBusiness, :memberAdditionStatus, :modifiedBy, :modifiedOn, :mphCode, :mphName, :policyId, :policyMbrNo, :policyNumber, :policyStatus, :product, :rejectionReasonCode, :rejectionRemarks, :serviceId, :serviceNumber, :serviceStatus, :totalContribution, :unitCode, :voluntaryContribution, :noOfCategory)")
    int saveMemberAddress(@Param("createdBy") String createdBy, @Param("createdOn") Timestamp createdOn, @Param("employeeContribution") int employeeContribution, @Param("employerContribution") int employerContribution, @Param("isActive") int isActive, @Param("lineOfBusiness") String lineOfBusiness, @Param("memberAdditionStatus") String memberAdditionStatus, @Param("modifiedBy") String modifiedBy, @Param("modifiedOn") Timestamp modifiedOn, @Param("mphCode") String mphCode, @Param("mphName") String mphName, @Param("policyId") long policyId, @Param("policyMbrNo") String policyMbrNo, @Param("policyNumber") String policyNumber, @Param("policyStatus") String policyStatus, @Param("product") String product, @Param("rejectionReasonCode") String rejectionReasonCode, @Param("rejectionRemarks") String rejectionRemarks, @Param("serviceId") long serviceId, @Param("serviceNumber") String serviceNumber, @Param("serviceStatus") String serviceStatus, @Param("totalContribution") int totalContribution, @Param("unitCode") String unitCode, @Param("voluntaryContribution") int voluntaryContribution, @Param("noOfCategory") int noOfCategory);

    // Update member address
    @Query("UPDATE POLICY_SRV_MBR_ADD SET EMPLOYEE_CONTRIBUTION = :employeeContribution, EMPLOYER_CONTRIBUTION = :employerContribution, IS_ACTIVE = :isActive, LINE_OF_BUSINESS = :lineOfBusiness, MEMBER_ADDITION_STATUS = :memberAdditionStatus, MODIFIED_BY = :modifiedBy, MODIFIED_ON = :modifiedOn, MPH_CODE = :mphCode, MPH_NAME = :mphName, POLICY_ID = :policyId, POLICY_MBR_NO = :policyMbrNo, POLICY_NUMBER = :policyNumber, POLICY_STATUS = :policyStatus, PRODUCT =