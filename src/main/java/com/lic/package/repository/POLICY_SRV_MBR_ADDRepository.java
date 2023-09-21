o   The "MODIFIED_BY" and "MODIFIED_ON" fields must be updated with the latest values when the details are updated.

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.lic.package.repository.POLICY_SRV_MBR_ADD;

public interface POLICY_SRV_MBR_ADDRepository extends JpaRepository<POLICY_SRV_MBR_ADD, Long> {
    
    //To save the member address details
    @Modifying
    @Query("INSERT INTO POLICY_SRV_MBR_ADD(CREATED_BY, CREATED_ON, EMPLOYEE_CONTRIBUTION, EMPLOYER_CONTRIBUTION, IS_ACTIVE, LINE_OF_BUSINESS, MEMBER_ADDITION_STATUS, MODIFIED_BY, MODIFIED_ON, MPH_CODE, MPH_NAME, POLICY_ID, POLICY_MBR_NO, POLICY_NUMBER, POLICY_STATUS, PRODUCT, REJECTION_REASON_CODE, REJECTION_REMARKS, SERVICE_ID, SERVICE_NUMBER, SERVICE_STATUS, TOTAL_CONTRIBUTION, UNIT_CODE, VOLUNTARY_CONTRIBUTION, NO_OF_CATEGORY) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")
    void saveMemberAddressDetails(String createdBy, String createdOn, double employeeContribution, double employerContribution, boolean isActive, String lineOfBusiness, String memberAdditionStatus, String modifiedBy, String modifiedOn, String mphCode, String mphName, long policyId, long policyMbrNo, String policyNumber, String policyStatus, String product, String rejectionReasonCode, String rejectionRemarks, long serviceId, String serviceNumber, String serviceStatus, double totalContribution, String unitCode, double voluntaryContribution, int noOfCategory); 
    
    //To update the member address details
    @Modifying
    @Query("UPDATE POLICY_SRV_MBR_ADD SET CREATED_BY = ?, CREATED_ON = ?, EMPLOYEE_CONTRIBUTION = ?, EMPLOYER_CONTRIBUTION = ?, IS_ACTIVE = ?, LINE_OF_BUSINESS = ?, MEMBER_ADDITION_STATUS = ?, MODIFIED_BY = ?, MODIFIED_ON = ?, MPH_CODE = ?, MPH_NAME = ?, POLICY_ID = ?, POLICY_MBR_NO = ?, POLICY_NUMBER = ?, POLICY_STATUS = ?, PRODUCT = ?, REJECTION_REASON_CODE = ?, REJECTION_REMARKS = ?, SERVICE_ID = ?, SERVICE_NUMBER = ?, SERVICE_STATUS = ?, TOTAL_CONTRIBUTION = ?, UNIT_CODE = ?, VOLUNTARY_CONTRIBUTION = ?, NO_OF_CATEGORY = ? WHERE MEMBER_ADDITION_ID = ?")
    void updateMemberAddressDetails(String createdBy, String createdOn, double employeeContribution, double employerContribution, boolean isActive, String lineOfBusiness, String memberAdditionStatus, String modifiedBy, String modifiedOn, String mphCode, String mphName, long policyId, long policyMbrNo, String policyNumber, String policyStatus, String product, String rejectionReasonCode, String rejectionRemarks, long serviceId, String serviceNumber, String serviceStatus, double totalContribution, String unitCode, double voluntaryContribution, int noOfCategory, long memberAdditionId); 
}