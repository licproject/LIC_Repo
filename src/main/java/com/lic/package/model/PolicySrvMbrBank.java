package com.lic.package.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_srv_mbr_bank")
public class PolicySrvMbrBank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bank_id")
	private Long bankId;
	
	@Column(name = "account_number")
	private String accountNumber;
	
	@Column(name = "account_type")
	private String accountType;
	
	@Column(name = "bank_address")
	private String bankAddress;
	
	@Column(name = "bank_branch")
	private String bankBranch;
	
	@Column(name = "bank_name")
	private String bankName;
	
	@Column(name = "confirm_account_number")
	private String confirmAccountNumber;
	
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "ifsc_code")
	private String ifscCode;
	
	@Column(name = "ifsc_code_available")
	private String ifscCodeAvailable;
	
	@Column(name = "is_active")
	private String isActive;
	
	@Column(name = "landline_number")
	private String landlineNumber;
	
	@Column(name = "member_id")
	private Long memberId;
	
	@Column(name = "policy_id")
	private Long policyId;
	
	@Column(name = "std_code")
	private String stdCode;

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
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

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getConfirmAccountNumber() {
		return confirmAccountNumber;
	}

	public void setConfirmAccountNumber(String confirmAccountNumber) {
		this.confirmAccountNumber = confirmAccountNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifsc