package com.lic.package.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_SRV_MBR_ADD")
public class POLICY_SRV_MBR_ADD {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MEMBER_ADDITION_ID")
    private Long memberAdditionId;
    
    @Column(name = "CREATED_BY")
    private String createdBy;
    
    @Column(name = "CREATED_ON")
    private String createdOn;
    
    @Column(name = "EMPLOYEE_CONTRIBUTION")
    private double employeeContribution;
    
    @Column(name = "EMPLOYER_CONTRIBUTION")
    private double employerContribution;
    
    @Column(name = "IS_ACTIVE")
    private boolean isActive;
    
    @Column(name = "LINE_OF_BUSINESS")
    private String lineOfBusiness;
    
    @Column(name = "MEMBER_ADDITION_STATUS")
    private String memberAdditionStatus;
    
    @Column(name = "MODIFIED_BY")
    private String modifiedBy;
    
    @Column(name = "MODIFIED_ON")
    private String modifiedOn;
    
    @Column(name = "MPH_CODE")
    private String mphCode;
    
    @Column(name = "MPH_NAME")
    private String mphName;
    
    @Column(name = "POLICY_ID")
    private long policyId;
    
    @Column(name = "POLICY_MBR_NO")
    private long policyMbrNo;
    
    @Column(name = "POLICY_NUMBER")
    private String policyNumber;
    
    @Column(name = "POLICY_STATUS")
    private String policyStatus;
    
    @Column(name = "PRODUCT")
    private String product;
    
    @Column(name = "REJECTION_REASON_CODE")
    private String rejectionReasonCode;
    
    @Column(name = "REJECTION_REMARKS")
    private String rejectionRemarks;
    
    @Column(name = "SERVICE_ID")
    private long serviceId;
    
    @Column(name = "SERVICE_NUMBER")
    private String serviceNumber;
    
    @Column(name = "SERVICE_STATUS")
    private String serviceStatus;
    
    @Column(name = "TOTAL_CONTRIBUTION")
    private double totalContribution;
    
    @Column(name = "UNIT_CODE")
    private String unitCode;
    
    @Column(name = "VOLUNTARY_CONTRIBUTION")
    private double voluntaryContribution;
    
    @Column(name = "NO_OF_CATEGORY")
    private int noOfCategory;
    
    public POLICY_SRV_MBR_ADD() {
        
    }
    
    public POLICY_SRV_MBR_ADD(String createdBy, String createdOn, double employeeContribution, double employerContribution, boolean isActive, String lineOfBusiness, String memberAdditionStatus, String modifiedBy, String modifiedOn, String mphCode, String mphName, long policyId, long policyMbrNo, String policyNumber, String policyStatus, String product, String rejectionReasonCode, String rejectionRemarks, long serviceId, String serviceNumber, String serviceStatus, double totalContribution, String unitCode, double voluntaryContribution, int noOfCategory) {
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.employeeContribution = employeeContribution;
        this.employerContribution = employerContribution;
        this.isActive = isActive;
        this.lineOfBusiness = lineOfBusiness;
        this.memberAdditionStatus = memberAdditionStatus;
        this.modifiedBy = modifiedBy;
        this.modified