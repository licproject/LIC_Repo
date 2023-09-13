package com.lic.package.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_SRV_MBR_ADD")
public class POLICY_SRV_MBR_ADD {
	@Id
	private Long MEMBER_ADDITION_ID;
	private String CREATED_BY;
	private Timestamp CREATED_ON;
	private Double EMPLOYEE_CONTRIBUTION;
	private Double EMPLOYER_CONTRIBUTION;
	private Boolean IS_ACTIVE;
	private String LINE_OF_BUSINESS;
	private String MEMBER_ADDITION_STATUS;
	private String MODIFIED_BY;
	private Timestamp MODIFIED_ON;
	private String MPH_CODE;
	private String MPH_NAME;
	private Long POLICY_ID;
	private Long POLICY_MBR_NO;
	private String POLICY_NUMBER;
	private String POLICY_STATUS;
	private String PRODUCT;
	private String REJECTION_REASON_CODE;
	private String REJECTION_REMARKS;
	private Long SERVICE_ID;
	private String SERVICE_NUMBER;
	private String SERVICE_STATUS;
	private Double TOTAL_CONTRIBUTION;
	private String UNIT_CODE;
	private Double VOLUNTARY_CONTRIBUTION;
	private Integer NO_OF_CATEGORY;

	public Long getMEMBER_ADDITION_ID() {
		return MEMBER_ADDITION_ID;
	}

	public void setMEMBER_ADDITION_ID(Long mEMBER_ADDITION_ID) {
		MEMBER_ADDITION_ID = mEMBER_ADDITION_ID;
	}

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	public Timestamp getCREATED_ON() {
		return CREATED_ON;
	}

	public void setCREATED_ON(Timestamp cREATED_ON) {
		CREATED_ON = cREATED_ON;
	}

	public Double getEMPLOYEE_CONTRIBUTION() {
		return EMPLOYEE_CONTRIBUTION;
	}

	public void setEMPLOYEE_CONTRIBUTION(Double eMPLOYEE_CONTRIBUTION) {
		EMPLOYEE_CONTRIBUTION = eMPLOYEE_CONTRIBUTION;
	}

	public Double getEMPLOYER_CONTRIBUTION() {
		return EMPLOYER_CONTRIBUTION;
	}

	public void setEMPLOYER_CONTRIBUTION(Double eMPLOYER_CONTRIBUTION) {
		EMPLOYER_CONTRIBUTION = eMPLOYER_CONTRIBUTION;
	}

	public Boolean getIS_ACTIVE() {
		return IS_ACTIVE;
	}

	public void setIS_ACTIVE(Boolean iS_ACTIVE) {
		IS_ACTIVE = iS_ACTIVE;
	}

	public String getLINE_OF_BUSINESS() {
		return LINE_OF_BUSINESS;
	}

	public void setLINE_OF_BUSINESS(String lINE_OF_BUSINESS) {
		LINE_OF_BUSINESS = lINE_OF_BUSINESS;
	}

	public String getMEMBER_ADDITION_STATUS() {
		return MEMBER_ADDITION_STATUS;
	}

	public void setMEMBER_ADDITION_STATUS(String mEMBER_ADDITION_STATUS) {
		MEMBER_ADDITION_STATUS = mEMBER_ADDITION_STATUS;
	}

	public String getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(String mODIFIED_BY) {
		MODIFIED_BY = mODIFIED_BY;
	}

	public Timestamp getMODIFIED_ON() {
