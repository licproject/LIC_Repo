o   The columns in this table that must be updated are: EMPLOYEE_CONTRIBUTION, EMPLOYER_CONTRIBUTION, IS_ACTIVE, LINE_OF_BUSINESS, MODIFIED_BY, MODIFIED_ON, NO_OF_CATEGORY, POLICY_MBR_NO, POLICY_STATUS, PRODUCT, REJECTION_REASON_CODE, REJECTION_REMARKS, SERVICE_ID, SERVICE_NUMBER, SERVICE_STATUS, TOTAL_CONTRIBUTION, UNIT_CODE, VOLUNTARY_CONTRIBUTION

package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MemberAddressRepository extends JpaRepository<POLICY_SRV_MBR_ADD, Long> {

    @Modifying
    @Query("UPDATE POLICY_SRV_MBR_ADD SET EMPLOYEE_CONTRIBUTION = :employeeContribution, EMPLOYER_CONTRIBUTION = :employerContribution, IS_ACTIVE = :isActive, LINE_OF_BUSINESS = :lineOfBusiness, MODIFIED_BY = :modifiedBy, MODIFIED_ON = :modifiedOn, NO_OF_CATEGORY = :noOfCategory, POLICY_MBR_NO = :policyMbrNo, POLICY_STATUS = :policyStatus, PRODUCT = :product, REJECTION_REASON_CODE = :rejectionReasonCode, REJECTION_REMARKS = :rejectionRemarks, SERVICE_ID = :serviceId, SERVICE_NUMBER = :serviceNumber, SERVICE_STATUS = :serviceStatus, TOTAL_CONTRIBUTION = :totalContribution, UNIT_CODE = :unitCode, VOLUNTARY_CONTRIBUTION = :voluntaryContribution WHERE MEMBER_ADDITION_ID = :memberAdditionId")
    int updateMemberAddress(@Param("memberAdditionId") Long memberAdditionId,
                            @Param("employeeContribution") Double employeeContribution,
                            @Param("employerContribution") Double employerContribution,
                            @Param("isActive") Boolean isActive,
                            @Param("lineOfBusiness") String lineOfBusiness,
                            @Param("modifiedBy") String modifiedBy,
                            @Param("modifiedOn") String modifiedOn,
                            @Param("noOfCategory") Integer noOfCategory,
                            @Param("policyMbrNo") String policyMbrNo,
                            @Param("policyStatus") String policyStatus,
                            @Param("product") String product,
                            @Param("rejectionReasonCode") Integer rejectionReasonCode,
                            @Param("rejectionRemarks") String rejectionRemarks,
                            @Param("serviceId") String serviceId,
                            @Param("serviceNumber") String serviceNumber,
                            @Param("serviceStatus") String serviceStatus,
                            @Param("totalContribution") Double totalContribution,
                            @Param("unitCode") String unitCode,
                            @Param("voluntaryContribution") Double voluntaryContribution);

}