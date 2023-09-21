Contribution(Long employerContribution);
    
    POLICY_SRV_MBR findBySalary(Long salary);
    
    POLICY_SRV_MBR findByTotalContribution(Long totalContribution);

}

package com.lic.package.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POLICY_SRV_MBR")
public class POLICY_SRV_MBR {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="member_id")
	private Long memberId;
	
	@Column(name="aadhar_number")
	private Long aadharNumber;
	
	@Column(name="category_no")
	private Long categoryNo;
	
	@Column(name="communication_preference")
	private String communicationPreference;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_on")
	private String createdOn;
	
	@Column(name="date_of_birth")
	private String dateOfBirth;
	
	@Column(name="date_of_joining")
	private String dateOfJoining;
	
	@Column(name="date_of_joining_scheme")
	private String dateOfJoiningScheme;
	
	@Column(name="date_of_retirement")
	private String dateOfRetirement;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="father_name")
	private String fatherName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="is_active")
	private Long isActive;
	
	@Column(name="is_zero_id")
	private Long isZeroId;
	
	@Column(name="landline_no")
	private Long landlineNo;
	
	@Column(name="language_preference")
	private String languagePreference;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="lic_id")
	private String licId;
	
	@Column(name="marital_status")
	private String maritalStatus;
	
	@Column(name="member_addition_id")
	private Long memberAdditionId;
	
	@Column(name="member_pan")
	private String memberPan;
	
	@Column(name="member_status")
	private String memberStatus;
	
	@Column(name="membership_number")
	private String membershipNumber;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="mobile_no")
	private Long mobileNo;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@Column(name="modified_on")
	private String modifiedOn;
	
	@Column(name="policy_id")
	private Long policyId;
	
	@Column(name="spouse_name")
	private String spouseName;
	
	@Column(name="type_of_membership")
	private String typeOfMembership;
	
	@Column(name="annuity_option")
	private String annuityOption;
	
	@Column(name="batch_id")
	private Long batchId;
	
	@Column(name="category")
	private Long category;
	
	@Column(name="employee_contribution")
	private Long employeeContribution;
	
	@Column(name="employer_contribution")
	private Long employerContribution;
	
	@Column(name="salary")
	private Long salary;
	
	@Column(name="