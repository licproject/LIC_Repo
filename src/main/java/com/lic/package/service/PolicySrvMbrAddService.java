Re:

package com.lic.package.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.entity.PolicySrvMbrAdd;
import com.lic.package.repository.PolicySrvMbrAddRepository;

@Service
public class PolicySrvMbrAddService {

	@Autowired
	private PolicySrvMbrAddRepository policySrvMbrAddRepository;

	public int saveMemberAddress(String createdBy, Timestamp createdOn, int employeeContribution,
			int employerContribution, int isActive, String lineOfBusiness, String memberAdditionStatus,
			String modifiedBy, Timestamp modifiedOn, String mphCode, String mphName, long policyId, String policyMbrNo,
			String policyNumber, String policyStatus, String product, String rejectionReasonCode,
			String rejectionRemarks, long serviceId, String serviceNumber, String serviceStatus, int totalContribution,
			String unitCode, int voluntaryContribution, int noOfCategory) {
		return policySrvMbrAddRepository.saveMemberAddress(createdBy, createdOn, employeeContribution,
				employerContribution, isActive, lineOfBusiness, memberAdditionStatus, modifiedBy, modifiedOn, mphCode,
				mphName, policyId, policyMbrNo, policyNumber, policyStatus, product, rejectionReasonCode,
				rejectionRemarks, serviceId, serviceNumber, serviceStatus, totalContribution, unitCode,
				voluntaryContribution, noOfCategory);
	}

	public int updateMemberAddress(long memberAdditionId, int employeeContribution, int employerContribution,
			int isActive, String lineOfBusiness, String memberAdditionStatus, String modifiedBy, Timestamp modifiedOn,
			String mphCode, String mphName, long policyId, String policyMbrNo, String policyNumber, String policyStatus,
			String product, String rejectionReasonCode, String rejectionRemarks, long serviceId, String serviceNumber,
			String serviceStatus, int totalContribution, String unitCode, int voluntaryContribution,
			int noOfCategory) {
		PolicySrvMbrAdd policySrvMbrAdd = policySrvMbrAddRepository.getOne(memberAdditionId);
		policySrvMbrAdd.setEmployeeContribution(employeeContribution);
		policySrvMbrAdd.setEmployerContribution(employerContribution);
		policySrvMbrAdd.setIsActive(isActive);
		policySrvMbrAdd.setLineOfBusiness(lineOfBusiness);
		policySrvMbrAdd.setMemberAdditionStatus(memberAdditionStatus);
		policySrvMbrAdd.setModifiedBy(modifiedBy);
		policySrvMbrAdd.setModifiedOn(modifiedOn);
		policySrvMbrAdd.setMphCode(mphCode);
		policySrvMbrAdd.setMphName(mphName);
		policySrvMbrAdd.setPolicyId(policyId);
		policySrvMbrAdd.setPolicyMbrNo(policyMbrNo);
		policySrvMbrAdd.setPolicyNumber(policyNumber);
		policySrvMbrAdd.setPolicyStatus(policyStatus);
		policySrvMbrAdd.setProduct(product);
		policySrvMbrAdd.setRejectionReasonCode(rejectionReasonCode);
		policySrvMbrAdd.setRejectionRemarks(rejectionRemarks);
		policySrvMbrAdd.setServiceId(serviceId);
		policySrvMbrAdd.setServiceNumber(serviceNumber);
		policySrvMbrAdd.setServiceStatus(serviceStatus);
		policySrvMbrAdd.setTotalContribution(totalContribution);
		policySrvMbrAdd.setUnitCode(unitCode);
		policySrvMbrAdd.setVoluntaryContribution(voluntaryContribution);
		policyS