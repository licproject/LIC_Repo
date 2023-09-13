package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int memberId;
	
	private String categoryNo;
	private String communicationPreference;
	private String dateOfBirth;
	private String dateOfJoining;
	private String dateOfJoiningScheme;
	private String dateOfRetirement;
	private String designation;
	private String emailId;
	private String fatherName;
	private String firstName;
	private String gender;
	private String isActive;
	private String isZeroId;
	private String landlineNo;
	private String languagePreference;
	private String lastName;
	private String licId;
	private String maritalStatus;
	private String memberPan;
	private String memberStatus;
	private String membershipNumber;
	private String middleName;
	private String mobileNo;
	private String policyId;
	private String spouseName;
	private String typeOfMembership;
	private String aadharNumber;
	
	public Member() {}
	
	public Member(int memberId, String categoryNo, String communicationPreference, String dateOfBirth,
			String dateOfJoining, String dateOfJoiningScheme, String dateOfRetirement, String designation,
			String emailId, String fatherName, String firstName, String gender, String isActive, String isZeroId,
			String landlineNo, String languagePreference, String lastName, String licId, String maritalStatus,
			String memberPan, String memberStatus, String membershipNumber, String middleName, String mobileNo,
			String policyId, String spouseName, String typeOfMembership, String aadharNumber) {
		this.memberId = memberId;
		this.categoryNo = categoryNo;
		this.communicationPreference = communicationPreference;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.dateOfJoiningScheme = dateOfJoiningScheme;
		this.dateOfRetirement = dateOfRetirement;
		this.designation = designation;
		this.emailId = emailId;
		this.fatherName = fatherName;
		this.firstName = firstName;
		this.gender = gender;
		this.isActive = isActive;
		this.isZeroId = isZeroId;
		this.landlineNo = landlineNo;
		this.languagePreference = languagePreference;
		this.lastName = lastName;
		this.licId = licId;
		this.maritalStatus = maritalStatus;
		this.memberPan = memberPan;
		this.memberStatus = memberStatus;
		this.membershipNumber = membershipNumber;
		this.middleName = middleName;
		this.mobileNo = mobileNo;
		this.policyId = policyId;
		this.spouseName = spouseName;
		this.typeOfMembership = typeOfMembership;
		this.aadharNumber = aadharNumber;
	}

	public int getMemberId() {
		return memberId;
	}

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCommunicationPreference() {
		return communicationPreference;
	}

	public void setCommunicationPreference(String communicationPreference) {
		this.communicationPreference = communicationPreference;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		