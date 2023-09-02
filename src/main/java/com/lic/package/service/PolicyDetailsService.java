package com.lic.package.service;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.PolicyDetails;
import com.lic.package.repository.PolicyDetailsRepository;

@Service
public class PolicyDetailsService {

    @Autowired
    private PolicyDetailsRepository policyDetailsRepository;

    public List<PolicyDetails> getPolicyDetails(String mphCode, String mphName, String accountNumber,
                                                String orderByMphName, String orderByBankName,
                                                String orderByBankBranch, String orderByAccountNumber,
                                                String orderByCityLocality, String orderByDistrict,
                                                int pageSize, int pageOffset) {

        return policyDetailsRepository.getPolicyDetails(mphCode, mphName, accountNumber, orderByMphName, 
                                                        orderByBankName, orderByBankBranch, orderByAccountNumber, 
                                                        orderByCityLocality, orderByDistrict, pageSize, pageOffset);
    }

    public Optional<PolicyDetails> getPolicyDetailsById(Long id) {
        return policyDetailsRepository.findById(id);
    }

    public PolicyDetails savePolicyDetails(PolicyDetails policyDetails) {
        return policyDetailsRepository.save(policyDetails);
    }

    public void deletePolicyDetailsById(Long id) {
        policyDetailsRepository.deleteById(id);
    }
}