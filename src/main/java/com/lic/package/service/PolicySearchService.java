User Action: Click on the Policy Number to view Policy details.Technical Steps:Implement a GET API to fetch policy details of the selected policy.Bind the fetched policy details to the frontend for display in read-only mode.

package com.lic.package.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.PolicySearch;
import com.lic.package.repository.PolicySearchRepository;

@Service
public class PolicySearchService {

    @Autowired
    private PolicySearchRepository policySearchRepository;

    public List<PolicySearch> findByPolicyNumber(String policyNumber) {
        return policySearchRepository.findByPolicyNumber(policyNumber);
    }

    public List<PolicySearch> findByCustomerName(String customerName) {
        return policySearchRepository.findByCustomerName(customerName);
    }

    public List<PolicySearch> findByIntermediaryName(String intermediaryName) {
        return policySearchRepository.findByIntermediaryName(intermediaryName);
    }

    public List<PolicySearch> findByLineOfBusiness(String lineOfBusiness) {
        return policySearchRepository.findByLineOfBusiness(lineOfBusiness);
    }

    public List<PolicySearch> findByProductName(String productName) {
        return policySearchRepository.findByProductName(productName);
    }

    public List<PolicySearch> findByProductVariant(String productVariant) {
        return policySearchRepository.findByProductVariant(productVariant);
    }

    public List<PolicySearch> findByUnitOffice(String unitOffice) {
        return policySearchRepository.findByUnitOffice(unitOffice);
    }

    public List<PolicySearch> findByPolicyStatus(String policyStatus) {
        return policySearchRepository.findByPolicyStatus(policyStatus);
    }

    public List<PolicySearch> findByPolicyStartDate(LocalDate policyStartDate) {
        return policySearchRepository.findByPolicyStartDate(policyStartDate);
    }

    public List<PolicySearch> findByPolicyEndDate(LocalDate policyEndDate) {
        return policySearchRepository.findByPolicyEndDate(policyEndDate);
    }

}