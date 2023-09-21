package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class POLICY_SRV_MBR_ADD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MEMBER_ADDITION_ID;

    private Double EMPLOYEE_CONTRIBUTION;
    private Double EMPLOYER_CONTRIBUTION;
    private Boolean IS_ACTIVE;
    private String LINE_OF_BUSINESS;
    private String MODIFIED_BY;
    private String MODIFIED_ON;
    private Integer NO_OF_CATEGORY;
    private String POLICY_MBR_NO;
    private String POLICY_STATUS;
    private String PRODUCT;
    private Integer REJECTION_REASON_CODE;
    private String REJECTION_REMARKS;
    private String SERVICE_ID;
    private String SERVICE_NUMBER;
    private String SERVICE_STATUS;
    private Double TOTAL_CONTRIBUTION;
    private String UNIT_CODE;
    private Double VOLUNTARY_CONTRIBUTION;

    public Long getMEMBER_ADDITION_ID() {
        return MEMBER_ADDITION_ID;
    }

    public void setMEMBER_ADDITION_ID(Long MEMBER_ADDITION_ID) {
        this.MEMBER_ADDITION_ID = MEMBER_ADDITION_ID;
    }

    public Double getEMPLOYEE_CONTRIBUTION() {
        return EMPLOYEE_CONTRIBUTION;
    }

    public void setEMPLOYEE_CONTRIBUTION(Double EMPLOYEE_CONTRIBUTION) {
        this.EMPLOYEE_CONTRIBUTION = EMPLOYEE_CONTRIBUTION;
    }

    public Double getEMPLOYER_CONTRIBUTION() {
        return EMPLOYER_CONTRIBUTION;
    }

    public void setEMPLOYER_CONTRIBUTION(Double EMPLOYER_CONTRIBUTION) {
        this.EMPLOYER_CONTRIBUTION = EMPLOYER_CONTRIBUTION;
    }

    public Boolean getIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(Boolean IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }

    public String getLINE_OF_BUSINESS() {
        return LINE_OF_BUSINESS;
    }

    public void setLINE_OF_BUSINESS(String LINE_OF_BUSINESS) {
        this.LINE_OF_BUSINESS = LINE_OF_BUSINESS;
    }

    public String getMODIFIED_BY() {
        return MODIFIED_BY;
    }

    public void setMODIFIED_BY(String MODIFIED_BY) {
        this.MODIFIED_BY = MODIFIED_BY;
    }

    public String getMODIFIED_ON() {
        return MODIFIED_ON;
    }

    public void setMODIFIED_ON(String MODIFIED_ON) {
        this.MODIFIED_ON = MODIFIED_ON;
    }

    public Integer getNO_OF_CATEGORY() {
        return NO_OF_CATEGORY;
    }

    public void setNO_OF_CATEGORY(Integer NO_OF_CATEGORY) {
        this.NO_OF_CATEGORY = NO_OF_CATEGORY;
    }

    public String getPOLICY_MBR_NO() {
        return POLICY_MBR_NO;
    }

    public void setPOLICY_MBR_NO(String POLICY_MBR_NO) {
        this.POLICY_MBR_NO = POLICY_MBR_NO;
    }

    public String getPOLICY_STATUS() {
        return POLICY_STATUS;
    }

    public void setPOLICY_STATUS(String POLICY_STATUS) {
        this.POLICY_STATUS = POLICY_STATUS;
    }

    public String getPR