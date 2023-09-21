// For Member Addresses (POLICY_MEM_ADRS)
	@Modifying
    @Query("UPDATE MemberAddress ma SET ma.address1=:address1, ma.address2=:address2, ma.address3=:address3, ma.area=:area, ma.city=:city, ma.country=:country, ma.state=:state, ma.zipcode=:zipcode WHERE ma.memberId=:memberId")
    int updateMemberAddress(Long memberId, String address1, String address2, String address3, String area, String city, String country, String state, String zipcode);
	
	// For Bank Information (POLICY_BNK_INFO)
	@Modifying
    @Query("UPDATE BankInformation bi SET bi.accountNo=:accountNo, bi.accountType=:accountType, bi.bankName=:bankName, bi.branchName=:branchName, bi.ifscCode=:ifscCode WHERE bi.memberId=:memberId")
    int updateBankInformation(Long memberId, String accountNo, String accountType, String bankName, String branchName, String ifscCode);
	
	// For Nominees (POLICY_NOMINEE)
	@Modifying
    @Query("UPDATE Nominee n SET n.dateOfBirth=:dateOfBirth, n.dateOfDeath=:dateOfDeath, n.firstName=:firstName, n.guardianName=:guardianName, n.guardianRelationship=:guardianRelationship, n.isMinor=:isMinor, n.lastName=:lastName, n.middleName=:middleName, n.nomineeRelationship=:nomineeRelationship, n.nomineeType=:nomineeType, n.percentage=:percentage, n.share=:share WHERE n.memberId=:memberId")
    int updateNominee(Long memberId, String dateOfBirth, String dateOfDeath, String firstName, String guardianName, String guardianRelationship, Boolean isMinor, String lastName, String middleName, String nomineeRelationship, String nomineeType, String percentage, String share);
	
	// For Appointees (POLICY_APPOINTEE)
	@Modifying
    @Query("UPDATE Appointee a SET a.dateOfBirth=:dateOfBirth, a.firstName=:firstName, a.lastName=:lastName, a.middleName=:middleName, a.relationWithMember=:relationWithMember, a.share=:share WHERE a.memberId=:memberId")
    int updateAppointee(Long memberId, String dateOfBirth, String firstName, String lastName, String middleName, String relationWithMember, String share);

}

// Spring Boot Entity/Model class package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_SRV_MBR")
public class PolicyMember {
	
	@Id
	private Long memberId;
	private String aadharNumber;
	private String categoryNo;
	private String communicationPreference;
	private String createdBy;
	private String dateOfBirth;
	private String dateOfJoining;
	private String dateOfJoiningScheme;
	private String dateOfRetrirement;
	private String designation;
	private String emailId;
	private String fatherName;
	private String firstName;
	private String gender;
	private Boolean isActive;
	private Boolean isZeroId;
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
	private String modifiedBy;
	private String policyIds;
	private String spouseName;
	private String typeOfMemebership;
	private String annuityOption;
	private String batchId;
	private String category;
	private String employeeContribution;
	private String employerContribution;
	private String frequency;
	private String mphCode;
	private String mphName;
	private String pan;
	private String phone;