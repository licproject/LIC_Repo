package com.lic.package.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_SRV_MBR_APOTE")
public class PolicySrvMbrApote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "APPOINTEE_ID")
	private Long appointeeId;

	@Column(name = "APPOINTEE_AADHAR_NUMBER")
	private String aadharNumber;

	@Column(name = "APPOINTEE_ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name = "APPOINTEE_ACCOUNT_TYPE")
	private String accountType;

	@Column(name = "APPOINTEE_CODE")
	private String appointeeCode;

	@Column(name = "APPOINTEE_NAME")
	private String appointeeName;

	@Column(name = "APPOINTEE_BANK_NAME")
	private String bankName;

	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;

	@Column(name = "CREATED_BY")
	private Long createdBy;

	@Column(name = "CREATED_ON")
	private Timestamp createdOn;

	@Column(name = "DATE_OF_BIRTH")
	private Timestamp dateOfBirth;

	@Column(name = "APPOINTEE_IFSC_CODE")
	private String ifscCode;

	@Column(name = "IS_ACTIVE")
	private Boolean isActive;

	@Column(name = "MEMBER_ID")
	private Long memberId;

	@Column(name = "MODIFIED_BY")
	private Long modifiedBy;

	@Column(name = "MODIFIED_ON")
	private Timestamp modifiedOn;

	@Column(name = "APPOINTEE_PAN")
	private String pan;

	@Column(name = "RELATIONSHIP")
	private String relationship;

	public Long getAppointeeId() {
		return appointeeId;
	}

	public void setAppointeeId(Long appointeeId) {
		this.appointeeId = appointeeId;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAppointeeCode() {
		return appointeeCode;
	}

	public void setAppointeeCode(String appointeeCode) {
		this.appointeeCode = appointeeCode;
	}

	public String getAppointeeName() {
		return appointeeName;
	}

	public void setAppointeeName(String appointeeName) {
		this.appointeeName = appointeeName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {