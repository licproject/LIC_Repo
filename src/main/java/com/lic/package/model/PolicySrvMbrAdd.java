:product, REJECTION_REASON_CODE = :rejectionReasonCode, REJECTION_REMARKS = :rejectionRemarks, SERVICE_ID = :serviceId, SERVICE_NUMBER = :serviceNumber, SERVICE_STATUS = :serviceStatus, TOTAL_CONTRIBUTION = :totalContribution, UNIT_CODE = :unitCode, VOLUNTARY_CONTRIBUTION = :voluntaryContribution, NO_OF_CATEGORY = :noOfCategory WHERE ID = :id")
    int updateMemberAddress(@Param("id") long id, @Param("employeeContribution") int employeeContribution, @Param("employerContribution") int employerContribution, @Param("isActive") int isActive, @Param("lineOfBusiness") String lineOfBusiness, @Param("memberAdditionStatus") String memberAdditionStatus, @Param("modifiedBy") String modifiedBy, @Param("modifiedOn") Timestamp modifiedOn, @Param("mphCode") String mphCode, @Param("mphName") String mphName, @Param("policyId") long policyId, @Param("policyMbrNo") String policyMbrNo, @Param("policyNumber") String policyNumber, @Param("policyStatus") String policyStatus, @Param("product") String product, @Param("rejectionReasonCode") String rejectionReasonCode, @Param("rejectionRemarks") String rejectionRemarks, @Param("serviceId") long serviceId, @Param("serviceNumber") String serviceNumber, @Param("serviceStatus") String serviceStatus, @Param("totalContribution") int totalContribution, @Param("unitCode") String unitCode, @Param("voluntaryContribution") int voluntaryContribution, @Param("noOfCategory") int noOfCategory);
}


package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "POLICY_SRV_MBR_ADD")
public class PolicySrvMbrAdd {

    @Id
    private Long id;

    private String createdBy;
    private Timestamp createdOn;
    private int employeeContribution;
    private int employerContribution;
    private int isActive;
    private String lineOfBusiness;
    private String memberAdditionStatus;
    private String modifiedBy;
    private Timestamp modifiedOn;
    private String mphCode;
    private String mphName;
    private long policyId;
    private String policyMbrNo;
    private String policyNumber;
    private String policyStatus;
    private String product;
    private String rejectionReasonCode;
    private String rejectionRemarks;
    private long serviceId;
    private String serviceNumber;
    private String serviceStatus;
    private int totalContribution;
    private String unitCode;
    private int voluntaryContribution;
    private int noOfCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public int getEmployeeContribution() {
        return employeeContribution;
    }

    public void setEmployeeContribution(int employeeContribution) {
        this.employeeContribution = employeeContribution;
    }

    public int getEmployerContribution() {
        return employerContribution;
    }

    public void setEmployerContribution(int employerContribution) {
        this.employerContribution = employerContribution;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String getMemberAdditionStatus() {
        return memberAdditionStatus;