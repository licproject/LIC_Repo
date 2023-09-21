package com.lic.package.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.package.entity.PolicySrvMbrBank;
import com.lic.package.repository.PolicySrvMbrBankRepository;

@Service
public class PolicySrvMbrBankService {
    
    @Autowired
    private PolicySrvMbrBankRepository policySrvMbrBankRepository;

    @Transactional
    public PolicySrvMbrBank createBankInfo(PolicySrvMbrBank policySrvMbrBank) {
        return policySrvMbrBankRepository.save(policySrvMbrBank);
    }

    @Transactional
    public PolicySrvMbrBank updateBankInfo(Long bankId, PolicySrvMbrBank policySrvMbrBank) {
        PolicySrvMbrBank existingBankInfo = policySrvMbrBankRepository.findByBankId(bankId);
        existingBankInfo.setAccountNumber(policySrvMbrBank.getAccountNumber());
        existingBankInfo.setAccountType(policySrvMbrBank.getAccountType());
        existingBankInfo.setBankAddress(policySrvMbrBank.getBankAddress());
        existingBankInfo.setBankBranch(policySrvMbrBank.getBankBranch());
        existingBankInfo.setBankName(policySrvMbrBank.getBankName());
        existingBankInfo.setConfirmAccountNumber(policySrvMbrBank.getConfirmAccountNumber());
        existingBankInfo.setCountryCode(policySrvMbrBank.getCountryCode());
        existingBankInfo.setEmailId(policySrvMbrBank.getEmailId());
        existingBankInfo.setIfscCode(policySrvMbrBank.getIfscCode());
        existingBankInfo.setIfscCodeAvailable(policySrvMbrBank.getIfscCodeAvailable());
        existingBankInfo.setIsActive(policySrvMbrBank.getIsActive());
        existingBankInfo.setLandlineNumber(policySrvMbrBank.getLandlineNumber());
        existingBankInfo.setMemberId(policySrvMbrBank.getMemberId());
        existingBankInfo.setPolicyId(policySrvMbrBank.getPolicyId());
        existingBankInfo.setStdCode(policySrvMbrBank.getStdCode());
        existingBankInfo.setModifiedBy(policySrvMbrBank.getModifiedBy());

        return policySrvMbrBankRepository.save(existingBankInfo);
    }

    public PolicySrvMbrBank getBankInfo(Long bankId) {
        return policySrvMbrBankRepository.findByBankId(bankId);
    }
}