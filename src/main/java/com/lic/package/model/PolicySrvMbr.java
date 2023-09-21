PolicySrvMbr> findByScheme(String scheme);

    Optional<PolicySrvMbr> findByServiceServiceId(Long serviceServiceId);

    Optional<PolicySrvMbr> findBySource(String source);

}

package com.lic.package.model;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicySrvMbr {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long memberId;
	private Long aadharNumber;
	private Long categoryNo;
	private String communicationPreference;
	private String createdBy;
	private Timestamp createdOn;
	private Timestamp dateOfBirth;
	private Timestamp dateOfJoining;
	private Timestamp dateOfJoiningScheme;
	private Timestamp dateOfRetirement;
	private String designation;
	private String emailId;
	private String fatherName;
	private String firstName;
	private String gender;
	private Long isActive;
	private Long isZeroId;
	private Long landlineNo;
	private String languagePreference;
	private String lastName;
	private String licId;
	private String maritalStatus;
	private Long memberAdditionId;
	private String memberPan;
	private String memberStatus;
	private String membershipNumber;
	private String middleName;
	private Long mobileNo;
	private String modifiedBy;
	private Timestamp modifiedOn;
	private Long policyId;
	private String spouseName;
	private String typeOfMembership;
	private String annuityOption;
	private Long batchId;
	private Long category;
	private Long employeeContribution;
	private Long employerContribution;
	private Long frequency;
	private String mphCode;
	private String mphName;
	private String pan;
	private Long phone;
	private String policyNo;
	private String policyStatus;
	private String product;
	private String scheme;
	private Long serviceServiceId;
	private String source;
	
	public PolicySrvMbr() {
		
	}
	
	public PolicySrvMbr(Long memberId, Long aadharNumber, Long categoryNo, String communicationPreference,
			String createdBy, Timestamp createdOn, Timestamp dateOfBirth, Timestamp dateOfJoining,
			Timestamp dateOfJoiningScheme, Timestamp dateOfRetirement, String designation, String emailId,
			String fatherName, String firstName, String gender, Long isActive, Long isZeroId, Long landlineNo,
			String languagePreference, String lastName, String licId, String maritalStatus, Long memberAdditionId,
			String memberPan, String memberStatus, String membershipNumber, String middleName, Long mobileNo,
			String modifiedBy, Timestamp modifiedOn, Long policyId, String spouseName, String typeOfMembership,
			String annuityOption, Long batchId, Long category, Long employeeContribution, Long employerContribution,
			Long frequency, String mphCode, String mphName, String pan, Long phone, String policyNo, String policyStatus,
			String product, String scheme, Long serviceServiceId, String source) {
		super();
		this.memberId = memberId;
		this.aadharNumber = aadharNumber;
		this.categoryNo = categoryNo;
		this.communicationPreference = communicationPreference;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
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
		this.is