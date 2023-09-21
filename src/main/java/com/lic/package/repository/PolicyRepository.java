package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.package.model.PolicyMember;
import com.lic.package.model.MemberAddress;
import com.lic.package.model.BankInformation;
import com.lic.package.model.Nominee;
import com.lic.package.model.Appointee;

@Repository
public interface PolicyRepository extends JpaRepository<PolicyMember, Long> {
	
	// For Policy Members (POLICY_SRV_MBR)
	@Modifying
    @Query("UPDATE PolicyMember pm SET pm.aadharNumber=:aadharNumber, pm.categoryNo=:categoryNo, pm.communicationPreference=:communicationPreference, pm.createdBy=:createdBy, pm.dateOfBirth=:dateOfBirth, pm.dateOfJoining=:dateOfJoining, pm.dateOfJoiningScheme=:dateOfJoiningScheme, pm.dateOfRetrirement=:dateOfRetrirement, pm.designation=:designation, pm.emailId=:emailId, pm.fatherName=:fatherName, pm.firstName=:firstName, pm.gender=:gender, pm.isActive=:isActive, pm.isZeroId=:isZeroId, pm.landlineNo=:landlineNo, pm.languagePreference=:languagePreference, pm.lastName=:lastName, pm.licId=:licId, pm.maritalStatus=:maritalStatus, pm.memberPan=:memberPan, pm.memberStatus=:memberStatus, pm.membershipNumber=:membershipNumber, pm.middleName=:middleName, pm.mobileNo=:mobileNo, pm.modifiedBy=:modifiedBy, pm.policyIds=:policyIds, pm.spouseName=:spouseName, pm.typeOfMemebership=:typeOfMemebership, pm.annuityOption=:annuityOption, pm.batchId=:batchId, pm.category=:category, pm.employeeContribution=:employeeContribution, pm.employerContribution=:employerContribution, pm.frequency=:frequency, pm.mphCode=:mphCode, pm.mphName=:mphName, pm.pan=:pan, pm.phone=:phone, pm.policyNo=:policyNo, pm.policyStatus=:policyStatus, pm.product=:product, pm.quotationId=:quotationId, pm.quotationType=:quotationType, pm.refLicId=:refLicId, pm.role=:role, pm.serviceId=:serviceId, pm.serviceNumber=:serviceNumber, pm.serviceStatus=:serviceStatus, pm.totalContribution=:totalContribution, pm.totalInterestedAccrued=:totalInterestedAccrued, pm.unitCode=:unitCode, pm.voluntaryContribution=:voluntaryContribution, pm.memberShipId=:memberShipId WHERE pm.memberId=:memberId")
    int updatePolicyMember(Long memberId, String aadharNumber, String categoryNo, String communicationPreference, String createdBy, String dateOfBirth, String dateOfJoining, String dateOfJoiningScheme, String dateOfRetrirement, String designation, String emailId, String fatherName, String firstName, String gender, Boolean isActive, Boolean isZeroId, String landlineNo, String languagePreference, String lastName, String licId, String maritalStatus, String memberPan, String memberStatus, String membershipNumber, String middleName, String mobileNo, String modifiedBy, String policyIds, String spouseName, String typeOfMemebership, String annuityOption, String batchId, String category, String employeeContribution, String employerContribution, String frequency, String mphCode, String mphName, String pan, String phone, String policyNo, String policyStatus, String product, String quotationId, String quotationType, String refLicId, String role, String serviceId, String serviceNumber, String serviceStatus, String totalContribution, String totalInterestedAccrued, String unitCode, String voluntaryContribution, String memberShipId);
	
