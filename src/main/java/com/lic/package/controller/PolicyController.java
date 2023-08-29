package com.lic.package.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.Policy;
import com.lic.package.service.PolicyService;

@RestController
@RequestMapping("/policies")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @GetMapping("/all")
    public List<Policy> getAllPolicies(){
        return policyService.getAllPolicies();
    }

    @GetMapping("/{policyNumber}")
    public Policy getPolicyByNumber(@PathVariable String policyNumber){
        return policyService.getPolicyByNumber(policyNumber);
    }

    @GetMapping("/scheme-type/{schemeType}")
    public List<Policy> getPoliciesBySchemeType(@PathVariable String schemeType){
        return policyService.getPoliciesBySchemeType(schemeType);
    }

    @GetMapping("/mph-name/{mphName}")
    public List<Policy> getPoliciesByMphName(@PathVariable String mphName){
        return policyService.getPoliciesByMphName(mphName);
    }

    @GetMapping("/mph-code/{mphCode}")
    public List<Policy> getPoliciesByMphCode(@PathVariable String mphCode){
        return policyService.getPoliciesByMphCode(mphCode);
    }

    @GetMapping("/status/{policyStatus}")
    public List<Policy> getPoliciesByStatus(@PathVariable String policyStatus){
        return policyService.getPoliciesByStatus(policyStatus);
    }
}