o   The modified_by and modified_on fields must be updated with the user who made the changes and the timestamp when the changes were made.

package com.lic.package.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.repository.PolicySrvMbrAddRepository;
import com.lic.package.model.POLICY_SRV_MBR_ADD;

@Service
public class PolicySrvMbrAddService {

    @Autowired
    private PolicySrvMbrAddRepository policySrvMbrAddRepository;

    public List<POLICY_SRV_MBR_ADD> findByMemberAdditionId(Long memberAdditionId) {
        return policySrvMbrAddRepository.findByMemberAdditionId(memberAdditionId);
    }

    public List<POLICY_SRV_MBR_ADD> findByCreatedBy(String createdBy) {
        return policySrvMbrAddRepository.findByCreatedBy(createdBy);
    }

    public List<POLICY_SRV_MBR_ADD> findByCreatedOn(Timestamp createdOn) {
        return policySrvMbrAddRepository.findByCreatedOn(createdOn);
    }

    public List<POLICY_SRV_MBR_ADD> findByEmployeeContribution(Integer employeeContribution) {
        return policySrvMbrAddRepository.findByEmployeeContribution(employeeContribution);
    }

    public List<POLICY_SRV_MBR_ADD> findByEmployerContribution(Integer employerContribution) {
        return policySrvMbrAddRepository.findByEmployerContribution(employerContribution);
    }

    public List<POLICY_SRV_MBR_ADD> findByIsActive(String isActive) {
        return policySrvMbrAddRepository.findByIsActive(isActive);
    }

    public List<POLICY_SRV_MBR_ADD> findByLineOfBusiness(String lineOfBusiness) {
        return policySrvMbrAddRepository.findByLineOfBusiness(lineOfBusiness);
    }

    public List<POLICY_SRV_MBR_ADD> findByMemberAdditionStatus(String memberAdditionStatus) {
        return policySrvMbrAddRepository.findByMemberAdditionStatus(memberAdditionStatus);
    }

    public List<POLICY_SRV_MBR_ADD> findByModifiedBy(String modifiedBy) {
        return policySrvMbrAddRepository.findByModifiedBy(modifiedBy);
    }

    public List<POLICY_SRV_MBR_ADD> findByModifiedOn(Timestamp modifiedOn) {
        return policySrvMbrAddRepository.findByModifiedOn(modifiedOn);
    }

    public List<POLICY_SRV_MBR_ADD> findByMphCode(String mphCode) {
        return policySrvMbrAddRepository.findByMphCode(mphCode);
    }

    public List<POLICY_SRV_MBR_ADD> findByMphName(String mphName) {
        return policySrvMbrAddRepository.findByMphName(mphName);
    }

    public List<POLICY_SRV_MBR_ADD> findByPolicyId(Long policyId) {
        return policySrvMbrAddRepository.findByPolicyId(policyId);
    }

    public List<POLICY_SRV_MBR_ADD> findByPolicyMbrNo(String policyMbrNo) {
        return policySrvMbrAddRepository.findByPolicyMbrNo(policyMbrNo);
    }

    public List<POLICY_SRV_MBR_ADD> findByPolicyNumber(String policyNumber) {
        return policySrvMbrAddRepository.findByPolicyNumber(policyNumber);
    }

    public List<POLICY_SRV_MBR_ADD> findByPolicyStatus(String policyStatus)