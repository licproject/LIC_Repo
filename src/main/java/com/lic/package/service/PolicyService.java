package com.lic.package.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.package.repository.PMST_MPH;
import com.lic.package.repository.Members;
import com.lic.package.repository.PolicyRepository;

import java.util.Optional;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    @Transactional
    public void insertDataIntoMembers(String mphCode) {
        Optional<PMST_MPH> pmstMph = policyRepository.getByMphCode(mphCode);
        if (pmstMph.isPresent()) {
            policyRepository.insertPolicyDataIntoMembers(mphCode);
        }
    }
}