package com.lic.package.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Policy_Srv_Mbr_Add")
public class PolicySrvMbrAdd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memberAdditionId;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "LINE_OF_BUSINESS")
    private String lineOfBusiness;

    @Column(name = "POLICY_MBR_NO")
    private String policyMbrNo;

    @Column(name = "POLICY_NUMBER")
    private String policyNumber;

    @Column(name = "PRODUCT")
    private String product;

    @Column(name = "SERVICE_ID")
    private String serviceId;

    @Column(name = "SERVICE_NUMBER")
    private String serviceNumber;

    @Column(name = "SERVICE_STATUS")
    private String serviceStatus;

    @Column(name = "EMPLOYEE_CONTRIBUTION")
    private float employeeContribution;

    @Column(name = "EMPLOYER_CONTRIBUTION")
    private float employerContribution;

    @Column(name = "TOTAL_CONTRIBUTION")
    private float totalContribution;

    @Column(name = "VOLUNTARY_CONTRIBUTION")
    private float voluntaryContribution;

    @Column(name = "NO_OF_CATEGORY")
    private int noOfCategory;

    @Column(name = "MPH_CODE")
    private String mphCode;

    @Column(name = "MPH_NAME")
    private String mphName;

    @Column(name = "POLICY_STATUS")
    private String policyStatus;

    @Column(name = "REJECTION_REASON_CODE")
    private String rejectionReasonCode;

    @Column(name = "REJECTION_REMARKS")
    private String rejectionRemarks;

    @Column(name = "IS_ACTIVE")
    private boolean isActive;

    @Column(name = "MEMBER_ADDITION_STATUS")
    private String memberAdditionStatus;

    @Column(name = "MODIFIED_ON")
    private String modifiedOn;

    // Getters and Setters
    public Long getMemberAdditionId() {
        return memberAdditionId;
    }

    public void setMemberAdditionId(Long memberAdditionId) {
        this.memberAdditionId = memberAdditionId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String getPolicyMbrNo() {
        return policyMbrNo;
    }

    public void setPolicyMbrNo(String policyMbrNo) {
        this.policyMbrNo = policyMbrNo;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
