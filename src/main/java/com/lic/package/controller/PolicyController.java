package com.lic.package.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.Policy;
import com.lic.package.service.PolicyService;

@RestController
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @GetMapping("/searchPolicies")
    public List<Policy> searchPolicies(@RequestParam String policyNumber, @RequestParam String schemeType, @RequestParam String mphName, @RequestParam String mphCode, @RequestParam String policyStatus) {
        return policyService.searchPolicies(policyNumber, schemeType, mphName, mphCode, policyStatus);
    }

}