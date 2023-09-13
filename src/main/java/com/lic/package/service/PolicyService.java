package com.lic.package.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.repository.PolicyServiceRepository;

@Service
public class PolicyService {

    @Autowired
    PolicyServiceRepository policyServiceRepository;

    // Save data in the POLICY_SRV_MBR table
    public void saveMemberData(Object data) {
        policyServiceRepository.saveMemberData(data);
    }

    // Save data in the POLICY_SRV_MBR_ADRS table
    public void saveMemberAddressData(Object data) {
        policyServiceRepository.saveMemberAddressData(data);
    }

    // Save data in the POLICY_SRV_MBR_BANK table
    public void saveMemberBankData(Object data) {
        policyServiceRepository.saveMemberBankData(data);
    }

    // Save data in the POLICY_SRV_MBR_NOMI table
    public void saveMemberNomiData(Object data) {
        policyServiceRepository.saveMemberNomiData(data);
    }

    // Update data in the POLICY_SRV_MBR table
    public void updateMemberData(Object data) {
        policyServiceRepository.updateMemberData(data);
    }

    // Update data in the POLICY_SRV_MBR_ADRS table
    public void updateMemberAddressData(Object data) {
        policyServiceRepository.updateMemberAddressData(data);
    }

    // Update data in the POLICY_SRV_MBR_BANK table
    public void updateMemberBankData(Object data) {
        policyServiceRepository.updateMemberBankData(data);
    }

    // Update data in the POLICY_SRV_MBR_NOMI table
    public void updateMemberNomiData(Object data) {
        policyServiceRepository.updateMemberNomiData(data);
    }

}