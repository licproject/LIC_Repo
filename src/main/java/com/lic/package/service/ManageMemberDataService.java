package com.lic.package.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.POLICY_SRV_MBR;
import com.lic.package.repository.ManageMemberDataRepository;

@Service
public class ManageMemberDataService {
	
	@Autowired
	private ManageMemberDataRepository repository;
	
	/**
	 * This method saves the member data in the POLICY_SRV_MBR table.
	 * @param memberId
	 * @param aadharNumber
	 * @param categoryNo
	 * @param communicationPreference
	 * @param createdBy
	 * @param createdOn
	 * @param dateOfBirth
	 * @param dateOfJoining
	 * @param dateOfJoiningScheme
	 * @param dateOfRetirement
	 * @param designation
	 * @param emailId
	 * @param fatherName
	 * @param firstName
	 * @param gender
	 * @param isActive
	 * @param isZeroId
	 * @param landlineNo
	 * @param languagePreference
	 * @param lastName
	 * @param licId
	 * @param maritalStatus
	 * @param memberAdditionId
	 * @param memberPan
	 * @param memberStatus
	 * @param membershipNumber
	 * @param middleName
	 * @param mobileNo
	 * @param modifiedBy
	 * @param modifiedOn
	 * @param policyIds
	 * @param spouseName
	 * @param typeOfMemebership
	 * @param annuityOption
	 * @param batchId
	 * @param category
	 * @param employeeContribution
	 * @param employerContribution
	 * @param frequency
	 * @param mphCode
	 * @param mphName
	 * @param pan
	 * @param phone
	 * @param policyNo
	 * @param policyStatus
	 * @param product
	 * @param quotationId
	 * @param quotationType
	 * @param refLicId
	 * @param role
	 * @param serviceId
	 * @param serviceNumber
	 * @param serviceStatus
	 * @param totalContribution
	 * @param totalInterestedAccured
	 * @param unitCode
	 * @param voluntaryContribution
	 * @param memberShipId
	 */
	public void saveMemberData(long memberId, String aadharNumber, int categoryNo, String communicationPreference, String createdBy, 
			String createdOn, String dateOfBirth, String dateOfJoining, String dateOfJoiningScheme, String dateOfRetirement, 
			String designation, String emailId, String fatherName, String firstName, String gender, boolean isActive, boolean isZeroId, 
			String landlineNo, String languagePreference, String lastName, String licId, String maritalStatus, String memberAdditionId, 
			String memberPan, String memberStatus, String membershipNumber, String middleName, String mobileNo, String modifiedBy, 
			String modifiedOn, String policyIds, String spouseName, String typeOfMemebership, String annuityOption, String batchId, 
			String category, int employeeContribution, int employerContribution, String frequency, String mphCode, String mphName, 
			String pan, String phone, String policyNo, String policyStatus, String product, String quotationId, String quotationType, 
			String refLicId, String role, String serviceId, String serviceNumber, String serviceStatus, int totalContribution, 
			int totalInterestedAccured, String unitCode, int voluntaryContribution, String memberShipId) {
				
		POLICY_SRV_MBR memberData = new POLICY_SRV_MBR();
		memberData.setMemberId(memberId);
		memberData.setAadharNumber(aadharNumber);
		memberData.setCategoryNo(categoryNo);
		memberData.setCommunicationPreference(communicationPreference);
		memberData.setCreatedBy(createdBy);
		memberData.setCreatedOn(createdOn);
		memberData.setDateOfBirth(dateOfBirth);
		memberData.setDateOf