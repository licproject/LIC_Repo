package com.lic.package.controller;

import com.lic.package.model.Policy;
import com.lic.package.repository.PolicyRepository;
import com.lic.package.service.PolicyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/policy")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @Autowired
    private PolicyRepository policyRepository;

    @GetMapping("/search")
    public List<Policy> searchPolicies(@RequestParam(name = "policyNumber", required = false) String policyNumber,
            @RequestParam(name = "schemeType", required = false) String schemeType,
            @RequestParam(name = "mphName", required = false) String mphName,
            @RequestParam(name = "mphCode", required = false) String mphCode,
            @RequestParam(name = "policyStatus", required = false) String policyStatus) {
        List<Policy> policies = null;
        if (policyNumber != null) {
            policies = policyService.findByPolicyNumber(policyNumber);
        } else if (schemeType != null) {
            policies = policyService.findBySchemeType(schemeType);
        } else if (mphName != null) {
            policies = policyService.findByMphName(mphName);
        } else if (mphCode != null) {
            policies = policyService.findByMphCode(mphCode);
        } else if (policyStatus != null) {
            policies = policyService.findByPolicyStatus(policyStatus);
        } else {
            policies = policyService.getAllPolicies();
        }
        return policies;
    }
}