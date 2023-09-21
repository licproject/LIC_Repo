o   The following address details must be updated:EMPLOYEE_CONTRIBUTIONEMPLOYER_CONTRIBUTIONIS_ACTIVELINE_OF_BUSINESSMEMBER_ADDITION_STATUSMODIFIED_BYMODIFIED_ONMPH_CODEMPH_NAMEPOLICY_MBR_NOPOLICY_NUMBERPOLICY_STATUSPRODUCTREJECTION_REASON_CODEREJECTION_REMARKSSERVICE_IDSERVICE_NUMBERSERVICE_STATUSTOTAL_CONTRIBUTIONUNIT_CODEVOLUNTARY_CONTRIBUTIONNO_OF_CATEGORY

package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicySrvMbrAddRepository extends JpaRepository<PolicySrvMbrAdd, Long> {

    // Method to save member address
    PolicySrvMbrAdd saveMemberAddress(Long memberAdditionId, String createdBy, String modifiedBy,
            String lineOfBusiness, String policyMbrNo, String policyNumber, String product,
            String serviceId, String serviceNumber, String serviceStatus, float employeeContribution,
            float employerContribution, float totalContribution, float voluntaryContribution, int noOfCategory,
            String mphCode, String mphName, String policyStatus, String rejectionReasonCode,
            String rejectionRemarks, boolean isActive, String memberAdditionStatus);

    // Method to update member address
    PolicySrvMbrAdd updateMemberAddress(Long memberAdditionId, String modifiedBy,
            String lineOfBusiness, String policyMbrNo, String policyNumber, String product,
            String serviceId, String serviceNumber, String serviceStatus, float employeeContribution,
            float employerContribution, float totalContribution, float voluntaryContribution, int noOfCategory,
            String mphCode, String mphName, String policyStatus, String rejectionReasonCode,
            String rejectionRemarks, boolean isActive, String memberAdditionStatus);

}