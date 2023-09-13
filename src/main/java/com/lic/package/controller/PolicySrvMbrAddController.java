package com.lic.package.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.entity.PolicySrvMbrAdd;
import com.lic.package.service.PolicySrvMbrAddService;

@RestController
public class PolicySrvMbrAddController {

	@Autowired
	private PolicySrvMbrAddService policySrvMbrAddService;

	@PostMapping("/saveMemberAddress")
	public int saveMemberAddress(@RequestBody PolicySrvMbrAdd policySrvMbrAdd) {
		return policySrvMbrAddService.saveMemberAddress(policySrvMbrAdd.getCreatedBy(), policySrvMbrAdd.getCreatedOn(),
				policySrvMbrAdd.getEmployeeContribution(), policySrvMbrAdd.getEmployerContribution(),
				policySrvMbrAdd.getIsActive(), policySrvMbrAdd.getLineOfBusiness(),
				policySrvMbrAdd.getMemberAdditionStatus(), policySrvMbrAdd.getModifiedBy(),
				policySrvMbrAdd.getModifiedOn(), policySrvMbrAdd.getMphCode(), policySrvMbrAdd.getMphName(),
				policySrvMbrAdd.getPolicyId(), policySrvMbrAdd.getPolicyMbrNo(), policySrvMbrAdd.getPolicyNumber(),
				policySrvMbrAdd.getPolicyStatus(), policySrvMbrAdd.getProduct(), policySrvMbrAdd.getRejectionReasonCode(),
				policySrvMbrAdd.getRejectionRemarks(), policySrvMbrAdd.getServiceId(),
				policySrvMbrAdd.getServiceNumber(), policySrvMbrAdd.getServiceStatus(),
				policySrvMbrAdd.getTotalContribution(), policySrvMbrAdd.getUnitCode(),
				policySrvMbrAdd.getVoluntaryContribution(), policySrvMbrAdd.getNoOfCategory());
	}

	@PutMapping("/updateMemberAddress")
	public int updateMemberAddress(@RequestBody PolicySrvMbrAdd policySrvMbrAdd) {
		return policySrvMbrAddService.updateMemberAddress(policySrvMbrAdd.getMemberAdditionId(),
				policySrvMbrAdd.getEmployeeContribution(), policySrvMbrAdd.getEmployerContribution(),
				policySrvMbrAdd.getIsActive(), policySrvMbrAdd.getLineOfBusiness(),
				policySrvMbrAdd.getMemberAdditionStatus(), policySrvMbrAdd.getModifiedBy(),
				policySrvMbrAdd.getModifiedOn(), policySrvMbrAdd.getMphCode(), policySrvMbrAdd.getMphName(),
				policySrvMbrAdd.getPolicyId(), policySrvMbrAdd.getPolicyMbrNo(), policySrvMbrAdd.getPolicyNumber(),
				policySrvMbrAdd.getPolicyStatus(), policySrvMbrAdd.getProduct(), policySrvMbrAdd.getRejectionReasonCode(),
				policySrvMbrAdd.getRejectionRemarks(), policySrvMbrAdd.getServiceId(),
				policySrvMbrAdd.getServiceNumber(), policySrvMbrAdd.getServiceStatus(),
				policySrvMbrAdd.getTotalContribution(), policySrvMbrAdd.getUnitCode(),
				policySrvMbrAdd.getVoluntaryContribution(),