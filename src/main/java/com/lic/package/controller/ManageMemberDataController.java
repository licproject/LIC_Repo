package com.lic.package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.POLICY_SRV_MBR;
import com.lic.package.repository.ManageMemberDataRepository;
import com.lic.package.service.ManageMemberDataService;

@RestController
public class ManageMemberDataController {

	@Autowired
	private ManageMemberDataService service;

	@PostMapping("/saveMemberData")
	public void saveMemberData(@RequestParam long memberId, @RequestParam String aadharNumber, @RequestParam int categoryNo,
			@RequestParam String communicationPreference, @RequestParam String createdBy, @RequestParam String createdOn,
			@RequestParam String dateOfBirth, @RequestParam String dateOfJoining, @RequestParam String dateOfJoiningScheme,
			@RequestParam String dateOfRetirement, @RequestParam String designation, @RequestParam String emailId,
			@RequestParam String fatherName, @RequestParam String firstName, @RequestParam String gender,
			@RequestParam boolean isActive, @RequestParam boolean isZeroId, @RequestParam String landlineNo,
			@RequestParam String languagePreference, @RequestParam String lastName, @RequestParam String licId,
			@RequestParam String maritalStatus, @RequestParam String memberAdditionId, @RequestParam String memberPan,
			@RequestParam String memberStatus, @RequestParam String membershipNumber, @RequestParam String middleName,
			@RequestParam String mobileNo, @RequestParam String modifiedBy, @RequestParam String modifiedOn,
			@RequestParam String policyIds, @RequestParam String spouseName, @RequestParam String typeOfMemebership,
			@RequestParam String annuityOption, @RequestParam String batchId, @RequestParam String category,
			@RequestParam int employeeContribution, @RequestParam int employerContribution,
			@RequestParam String frequency, @RequestParam String mphCode, @RequestParam String mphName,
			@RequestParam String pan, @RequestParam String phone, @RequestParam String policyNo,
			@RequestParam String policyStatus, @RequestParam String product, @RequestParam String quotationId,
			@RequestParam String quotationType, @RequestParam String refLicId, @RequestParam String role,
			@RequestParam String serviceId, @RequestParam String serviceNumber, @RequestParam String serviceStatus,
			@RequestParam int totalContribution, @RequestParam int totalInterestedAccured, @RequestParam String unitCode,
			@RequestParam int voluntaryContribution, @RequestParam String memberShipId) {
		service.saveMemberData(memberId, aadharNumber, categoryNo, communicationPreference, createdBy, createdOn, dateOfBirth,
				dateOfJoining, dateOfJoiningScheme, dateOfRetirement, designation, emailId, fatherName, firstName, gender,
				isActive, isZeroId, landlineNo, languagePreference, lastName, licId, maritalStatus, memberAdditionId,
				memberPan, memberStatus, membershipNumber, middleName, mobileNo, modifiedBy, modifiedOn, policyIds, spouseName,
				typeOfMemebership, annuityOption, batchId, category, employeeContribution, employerContribution, frequency,
				mphCode, mphName, pan, phone, policyNo, policyStatus, product, quotationId, quotationType, refLicId, role,
				serviceId, serviceNumber, serviceStatus, totalContribution, totalInterestedAccured, unitCode,
				voluntaryContribution, memberShipId);
	}
}