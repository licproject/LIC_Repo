package com.lic.package.service;

import com.lic.package.model.Policy;
import com.lic.package.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    public List<Policy> findByPolicyNumber(String policyNumber) {
        return policyRepository.findByPolicyNumber(policyNumber);
    }

    public List<Policy> findBySchemeType(String schemeType) {
        return policyRepository.findBySchemeType(schemeType);
    }

    public List<Policy> findByMphName(String mphName) {
        return policyRepository.findByMphName(mphName);
    }

    public List<Policy> findByMphCode(String mphCode) {
        return policyRepository.findByMphCode(mphCode);
    }

    public List<Policy> findByPolicyStatus(String policyStatus) {
        return policyRepository.findByPolicyStatus(policyStatus);
    }
}