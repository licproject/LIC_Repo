package com.lic.package.controller;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.PolicyDetails;
import com.lic.package.repository.PolicyDetailsRepository;
import com.lic.package.service.PolicyDetailsService;

@RestController
public class PolicyDetailsController {

    @Autowired
    private PolicyDetailsService policyDetailsService;

    @GetMapping("/policy-details")
    public List<PolicyDetails> getPolicyDetails(@RequestParam(value = "mphCode", required = false) String mphCode,
                                                @RequestParam(value = "mphName", required = false) String mphName,
                                                @RequestParam(value = "accountNumber", required = false) String accountNumber,
                                                @RequestParam(value = "orderByMphName", required = false) String orderByMphName,
                                                @RequestParam(value = "orderByBankName", required = false) String orderByBankName,
                                                @RequestParam(value = "orderByBankBranch", required = false) String orderByBankBranch,
                                                @RequestParam(value = "orderByAccountNumber", required = false) String orderByAccountNumber,
                                                @RequestParam(value = "orderByCityLocality", required = false) String orderByCityLocality,
                                                @RequestParam(value = "orderByDistrict", required = false) String orderByDistrict,
                                                @RequestParam(value = "pageSize", required = false) int pageSize,
                                                @RequestParam(value = "pageOffset", required = false) int pageOffset) {
        return policyDetailsService.getPolicyDetails(mphCode, mphName, accountNumber, orderByMphName, 
                                                    orderByBankName, orderByBankBranch, orderByAccountNumber, 
                                                    orderByCityLocality, orderByDistrict, pageSize, pageOffset);
    }

    @GetMapping("/policy-details/{id}")
    public Optional<PolicyDetails> getPolicyDetailsById(@PathVariable("id") Long id) {
        return policyDetailsService.getPolicyDetailsById(id);
    }

    @PostMapping("/policy-details")
    public PolicyDetails savePolicyDetails(@RequestBody PolicyDetails policyDetails) {
        return policyDetailsService.savePolicyDetails(policyDetails);
    }

    @DeleteMapping("/policy-details/{id}")
    public void deletePolicyDetailsById(@PathVariable("id") Long id) {
        policyDetailsService.deletePolicyDetailsById(id);
    }
}