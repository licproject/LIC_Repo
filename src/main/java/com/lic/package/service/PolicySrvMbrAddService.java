package com.lic.package.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.entity.PolicySrvMbrAdd;
import com.lic.package.repository.PolicySrvMbrAddRepository;

@Service
public class PolicySrvMbrAddService {

    @Autowired
    PolicySrvMbrAddRepository policySrvMbrAddRepository;

    // Method to save member address
    public PolicySrvMbrAdd saveMemberAddress(Long memberAdditionId, String createdBy, String modifiedBy,
            String lineOfBusiness, String policyMbrNo, String policyNumber, String product,
            String serviceId, String serviceNumber, String serviceStatus, float employeeContribution,
            float employerContribution, float totalContribution, float voluntaryContribution, int noOfCategory,
            String mphCode, String mphName, String policyStatus, String rejectionReasonCode,
            String rejectionRemarks, boolean isActive, String memberAdditionStatus) {

        PolicySrvMbrAdd policySrvMbrAdd = new PolicySrvMbrAdd();
        policySrvMbrAdd.setMemberAdditionId(memberAdditionId);
        policySrvMbrAdd.setCreatedBy(createdBy);
        policySrvMbrAdd.setModifiedBy(modifiedBy);
        policySrvMbrAdd.setLineOfBusiness(lineOfBusiness);
        policySrvMbrAdd.setPolicyMbrNo(policyMbrNo);
        policySrvMbrAdd.setPolicyNumber(policyNumber);
        policySrvMbrAdd.setProduct(product);
        policySrvMbrAdd.setServiceId(serviceId);
        policySrvMbrAdd.setServiceNumber(serviceNumber);
        policySrvMbrAdd.setServiceStatus(serviceStatus);
        policySrvMbrAdd.setEmployeeContribution(employeeContribution);
        policySrvMbrAdd.setEmployerContribution(employerContribution);
        policySrvMbrAdd.setTotalContribution(totalContribution);
        policySrvMbrAdd.setVoluntaryContribution(voluntaryContribution);
        policySrvMbrAdd.setNoOfCategory(noOfCategory);
        policySrvMbrAdd.setMphCode(mphCode);
        policySrvMbrAdd.setMphName(mphName);
        policySrvMbrAdd.setPolicyStatus(policyStatus);
        policySrvMbrAdd.setRejectionReasoncode(rejectionReasonCode);
        policySrvMbrAdd.setRejectionRemarks(rejectionRemarks);
        policySrvMbrAdd.setIsActive(isActive);
        policySrvMbrAdd.setMemberAdditionStatus(memberAdditionStatus);
        return policySrvMbrAddRepository.save(policySrvMbrAdd);
    }

    // Method to update member address
    public PolicySrvMbrAdd updateMemberAddress(Long memberAdditionId, String modifiedBy,
            String lineOfBusiness, String policyMbrNo, String policyNumber, String product,
            String serviceId, String serviceNumber, String serviceStatus, float employeeContribution,
            float employerContribution, float totalContribution, float voluntaryContribution, int noOfCategory,
            String mphCode, String mphName, String policyStatus, String rejectionReasonCode,
            String rejectionRemarks, boolean isActive, String memberAdditionStatus) {

        PolicySrvMbrAdd policySrvMbrAdd = policySrvMbrAddRepository.findById(memberAdditionId).get();
        policySrvMbrAdd.setModifiedBy(modifiedBy);
        policySrvMbrAdd.setLineOfBusiness(lineOfBusiness);
        policySrvMbrAdd.setPolicyMbrNo(policyMbrNo);
        policySrvMbrAdd.setPolicyNumber(policyNumber);
        policySrvMbrAdd.setProduct(product);
        policySrvMbrAdd.setServiceId(serviceId);
        policySrvMbrAdd.setServiceNumber(serviceNumber);
        policySrv