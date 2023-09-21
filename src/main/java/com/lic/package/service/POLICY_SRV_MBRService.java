Contribution(Long employerContribution);
    
    POLICY_SRV_MBR findByFrequency(Long frequency);
    
    POLICY_SRV_MBR findByMphCode(String mphCode);
    
    POLICY_SRV_MBR findByMphName(String mphName);
    
    POLICY_SRV_MBR findByPan(String pan);
    
    POLICY_SRV_MBR findByPhone(Long phone);
    
    POLICY_SRV_MBR findByPolicyNo(String policyNo);
    
    POLICY_SRV_MBR findByPolicyStatus(String policyStatus);
    
    POLICY_SRV_MBR findByProduct(String product);
    
    POLICY_SRV_MBR findByQuotationId(Long quotationId);
    
    POLICY_SRV_MBR findByQuotationType(String quotationType);
    
    POLICY_SRV_MBR findByRefLicId(String refLicId);
    
    POLICY_SRV_MBR findByRole(String role);
    
    POLICY_SRV_MBR findByServiceId(Long serviceId);
    
    POLICY_SRV_MBR findByServiceNumber(String serviceNumber);
    
    POLICY_SRV_MBR findByServiceStatus(String serviceStatus);
    
    POLICY_SRV_MBR findByTotalContribution(Long totalContribution);
    
    POLICY_SRV_MBR findByTotalInterestAccured(Long totalInterestAccured);
    
    POLICY_SRV_MBR findByUnitCode(String unitCode);
    
    POLICY_SRV_MBR findByVoluntaryContribution(Long voluntaryContribution);
    
    POLICY_SRV_MBR findByMembershipId(Long membershipId);
}

package com.lic.package.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.POLICY_SRV_MBR;
import com.lic.package.repository.POLICY_SRV_MBRRepository;

@Service
public class POLICY_SRV_MBRService {
    
    @Autowired
    private POLICY_SRV_MBRRepository policy_srv_mbrRepository;
    
    public POLICY_SRV_MBR save(POLICY_SRV_MBR member) {
        return policy_srv_mbrRepository.save(member);
    }
    
    public POLICY_SRV_MBR update(POLICY_SRV_MBR member) {
        return policy_srv_mbrRepository.save(member);
    }
    
    public void deleteByMemberId(Long memberId) {
        policy_srv_mbrRepository.deleteByMemberId(memberId);
    }
    
    public POLICY_SRV_MBR findByMemberId(Long memberId) {
        return policy_srv_mbrRepository.findByMemberId(memberId);
    }
    
    public POLICY_SRV_MBR findByAadharNumber(Long aadharNumber) {
        return policy_srv_mbrRepository.findByAadharNumber(aadharNumber);
    }
    
    public POLICY_SRV_MBR findByCategoryNo (Long categoryNo) {
        return policy_srv_mbrRepository.findByCategoryNo(categoryNo);
    }
    
    public POLICY_SRV_MBR findByCommunicationPreference(String communicationPreference) {
        return policy_srv_mbrRepository.findByCommunicationPreference(communicationPreference);
    }
    
    public POLICY_SRV_MBR findByCreatedBy(String createdBy) {
        return policy_srv_mbrRepository.findByCreatedBy(createdBy);
    }
    
    public POLICY_SRV_MBR findByCreatedOn(String createdOn) {
        return policy_srv_mbrRepository.