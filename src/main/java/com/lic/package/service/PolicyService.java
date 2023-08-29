package com.lic.package.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.Policy;
import com.lic.package.repository.PolicyRepository;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepo;

    public List<Policy> getAllPolicies(){
        return policyRepo.findAll();
    }
    
    public Policy getPolicyByNumber(String policyNumber){
        return policyRepo.findByPolicyNumber(policyNumber);
    }
    
    public List<Policy> getPoliciesBySchemeType(String schemeType){
        return policyRepo.findBySchemeType(schemeType);
    }
    
    public List<Policy> getPoliciesByMphName(String mphName){
        return policyRepo.findByMphName(mphName);
    }
    
    public List<Policy> getPoliciesByMphCode(String mphCode){
        return policyRepo.findByMphCode(mphCode);
    }
    
    public List<Policy> getPoliciesByStatus(String policyStatus){
        return policyRepo.findByPolicyStatus(policyStatus);
    }
}