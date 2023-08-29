package com.lic.package.controller;

import com.lic.package.model.Policy;
import com.lic.package.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @GetMapping("/policies")
    public List<Policy> searchPolicies(@RequestParam(required = false) String policyNumber,
                                      @RequestParam(required = false) String schemeType,
                                      @RequestParam(required = false) String mphName,
                                      @RequestParam(required = false) String mphCode,
                                      @RequestParam(required = false) String policyStatus) {
        List<Policy> policies  = null;
        if(policyNumber != null) {
            policies = policyService.findByPolicyNumber(policyNumber);
        } else if(schemeType != null) {
            policies = policyService.findBySchemeType(schemeType);
        } else if(mphName != null) {
            policies = policyService.findByMphName(mphName);
        } else if(mphCode != null) {
            policies = policyService.findByMphCode(mphCode);
        } else if(policyStatus != null) {
            policies = policyService.findByPolicyStatus(policyStatus);
        }
        return policies;
    }

}