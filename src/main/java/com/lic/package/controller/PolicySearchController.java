User Action: Click on the Policy Number to view Policy details.Technical Steps: Implement a GET API to fetch policy details of the selected policy.Bind the fetched policy details to the frontend for display in read-only mode.

package com.lic.package.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.PolicySearch;
import com.lic.package.service.PolicySearchService;

@RestController
@RequestMapping("/policies")
public class PolicySearchController {

    @Autowired
    private PolicySearchService policySearchService;

    @GetMapping("/findByPolicyNumber/{policyNumber}")
    public List<PolicySearch> findByPolicyNumber(@PathVariable String policyNumber) {
        return policySearchService.findByPolicyNumber(policyNumber);
    }

    @GetMapping("/findByCustomerName")
    public List<PolicySearch> findByCustomerName(@RequestParam String customerName) {
        return policySearchService.findByCustomerName(customerName);
    }

    @GetMapping("/findByIntermediaryName")
    public List<PolicySearch> findByIntermediaryName(@RequestParam String intermediaryName) {
        return policySearchService.findByIntermediaryName(intermediaryName);
    }

    @GetMapping("/findByLineOfBusiness")
    public List<PolicySearch> findByLineOfBusiness(@RequestParam String lineOfBusiness) {
        return policySearchService.findByLineOfBusiness(lineOfBusiness);
    }

    @GetMapping("/findByProductName")
    public List<PolicySearch> findByProductName(@RequestParam String productName) {
        return policySearchService.findByProductName(productName);
    }

    @GetMapping("/findByProductVariant")
    public List<PolicySearch> findByProductVariant(@RequestParam String productVariant) {
        return policySearchService.findByProductVariant(productVariant);
    }

    @GetMapping("/findByUnitOffice")
    public List<PolicySearch> findByUnitOffice(@RequestParam String unitOffice) {
        return policySearchService.findByUnitOffice(unitOffice);
    }

    @GetMapping("/findByPolicyStatus")
    public List<PolicySearch> findByPolicyStatus(@RequestParam String policyStatus) {
        return policySearchService.findByPolicyStatus(policyStatus);
    }

    @GetMapping("/findByPolicyStartDate")
    public List<PolicySearch> findByPolicyStartDate(@RequestParam LocalDate policyStartDate) {
        return policySearchService.findByPolicyStartDate(policyStartDate);
    }

    @GetMapping("/findByPolicyEndDate")
    public List<PolicySearch> findByPolicyEndDate(@RequestParam LocalDate policyEndDate) {
        return policySearchService.findByPolicyEndDate(policyEndDate);
    }

}