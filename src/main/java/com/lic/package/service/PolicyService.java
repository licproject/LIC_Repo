package com.lic.package.service;

import com.lic.package.entity.PolicyEntity;
import com.lic.package.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PolicyService {

    private static final String DEFAULT_MEMBER_STATUS = "Active";
    private static final String DEFAULT_CATEGORY_NO = "";
    private static final boolean DEFAULT_ACTIVE_STATUS = true;
    private static final boolean DEFAULT_ZERO_ID_STATUS = false;

    private PolicyRepository policyRepository;

    @Autowired
    public PolicyService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    public Optional<PolicyEntity> findByMphCode(String mphCode) {
        return policyRepository.findByMphCode(mphCode);
    }

    @Transactional
    public void insertMemberFromPolicy(String mphCode) {
        Optional<PolicyEntity> policyEntity = policyRepository.findByMphCode(mphCode);
        policyEntity.ifPresent(entity -> {
            policyRepository.insertMemberFromPolicy(mphCode, DEFAULT_MEMBER_STATUS, DEFAULT_CATEGORY_NO, DEFAULT_ACTIVE_STATUS, DEFAULT_ZERO_ID_STATUS);
            System.out.println("Record successfully inserted into Members table.");
        });
    }

    @Transactional
    public void updateMemberFromPolicy(long licId, long policyId) {
        policyRepository.updateMemberFromPolicy(licId, policyId, DEFAULT_MEMBER_STATUS, DEFAULT_CATEGORY_NO, DEFAULT_ACTIVE_STATUS, DEFAULT_ZERO_ID_STATUS);
        System.out.println("Record successfully updated in Members table.");
    }
}