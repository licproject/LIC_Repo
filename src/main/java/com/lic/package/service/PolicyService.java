package com.lic.package.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.package.model.PMST_MPH;
import com.lic.package.repository.PolicyRepository;

@Service
public class PolicyService {

    private final PolicyRepository policyRepository;

    public PolicyService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    public PMST_MPH findByMphCode(String mphCode) {
        return policyRepository.findByMphCode(mphCode);
    }

    @Transactional
    public void insertIntoMembers(String licId, String policyId, String fatherName, String firstName, String lastName, String categoryNo, boolean isActive, boolean isZeroId) {
        policyRepository.insertIntoMembers(licId, policyId, "Active", fatherName, firstName, lastName, categoryNo, isActive, isZeroId);
    }

}