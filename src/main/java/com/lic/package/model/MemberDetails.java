NO = :landlineNo, LANGUAGE_PREFERENCE = :languagePreference, LAST_NAME = :lastName, LIC_ID = :licId, MARITAL_STATUS = :maritalStatus, MEMBER_PAN = :memberPan, MEMBER_STATUS = :memberStatus, MEMBERSHIP_NUMBER = :membershipNumber, MIDDLE_NAME = :middleName, MOBILE_NO = :mobileNo, POLICY_ID = :policyId, SPOUSE_NAME = :spouseName, TYPE_OF_MEMBERSHIP = :typeOfMembership WHERE MEMBERSHIP_NUMBER = :membershipNumber")
public int updateMemberDetails(@Param("aadharNumber") String aadharNumber, @Param("categoryNo") String categoryNo, @Param("communicationPreference") String communicationPreference, @Param("createdBy") String createdBy, @Param("dateOfBirth") String dateOfBirth, @Param("dateOfJoining") String dateOfJoining, @Param("dateOfJoiningScheme") String dateOfJoiningScheme, @Param("dateOfRetirement") String dateOfRetirement, @Param("designation") String designation, @Param("emailId") String emailId, @Param("fatherName") String fatherName, @Param("firstName") String firstName, @Param("gender") String gender, @Param("isActive") String isActive, @Param("isZeroId") String isZeroId, @Param("landlineNo") String landlineNo, @Param("languagePreference") String languagePreference, @Param("lastName") String lastName, @Param("licId") String licId, @Param("maritalStatus") String maritalStatus, @Param("memberPan") String memberPan, @Param("memberStatus") String memberStatus, @Param("membershipNumber") String membershipNumber, @Param("middleName") String middleName, @Param("mobileNo") String mobileNo, @Param("policyId") String policyId, @Param("spouseName") String spouseName, @Param("typeOfMembership") String typeOfMembership);

}

// Spring Boot Entity/Model class package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_SRV_MBR")
public class MemberDetails {

  private String aadharNumber;
  private String categoryNo;
  private String communicationPreference;
  private String createdBy;
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

  public String getAadharNumber() {
    return aadharNumber;
  }

  public void setAadharNumber(String aadharNumber) {
    this.aadharNumber = aadharNumber;
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

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getDateOfJoining() {
    return dateOfJoining;
 