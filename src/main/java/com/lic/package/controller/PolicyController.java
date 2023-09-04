package com.lic.package.controller;

import com.lic.package.entity.PolicyEntity;
import com.lic.package.repository.PolicyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PolicyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyController.class);
    private static final String DEFAULT_MEMBER_STATUS = "Active";
    private static final String DEFAULT_CATEGORY_NO = "";
    private static final boolean DEFAULT_ACTIVE_STATUS = true;
    private static final boolean DEFAULT_ZERO_ID_STATUS = false;

    private PolicyRepository policyRepository;

    @Autowired
    public PolicyController(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    @GetMapping("/policy/findByMphCode")
    public void findByMphCode(@RequestParam String mphCode) {
        Optional<PolicyEntity> policyEntity = policyRepository.findByMphCode(mphCode);
        policyEntity.ifPresentOrElse(
                entity -> insertMemberFromPolicy(mphCode, entity.getLicId(), entity.getPolicyId()),
                () -> LOGGER.info("No matching policy found for MPH code {}", mphCode));
    }

    @GetMapping("/policy/update")
    public void updateMemberFromPolicy(@RequestParam long licId, @RequestParam long policyId) {
        policyRepository.updateMemberFromPolicy(licId, policyId, DEFAULT_MEMBER_STATUS, DEFAULT_CATEGORY_NO, DEFAULT_ACTIVE_STATUS, DEFAULT_ZERO_ID_STATUS);
        LOGGER.info("Record successfully updated in Members table. LIC ID: {}, Policy ID: {}", licId, policyId);
    }

    @Transactional
    private void insertMemberFromPolicy(String mphCode, long licId, long policyId) {
        policyRepository.insertMemberFromPolicy(mphCode, DEFAULT_MEMBER_STATUS, DEFAULT_CATEGORY_NO, DEFAULT_ACTIVE_STATUS, DEFAULT_ZERO_ID_STATUS);
        LOGGER.info("Record successfully inserted into Members table. MPH Code: {}, LIC ID: {}, Policy ID: {}", mphCode, licId, policyId);
    }

}