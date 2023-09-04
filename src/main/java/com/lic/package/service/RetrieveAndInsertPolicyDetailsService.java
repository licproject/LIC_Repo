and processing.

package com.lic.package.service;

import org.springframework.stereotype.Service;
import com.lic.package.repository.RetrieveAndInsertPolicyDetailsRepository;

@Service
public class RetrieveAndInsertPolicyDetailsService {
    private RetrieveAndInsertPolicyDetailsRepository repository;
    
    public RetrieveAndInsertPolicyDetailsService(RetrieveAndInsertPolicyDetailsRepository repository) {
        this.repository = repository;
    }
    
    // Scenario 1: Creating Temporary Tables
    public void createTemporaryTables() {
        repository.createTemporaryTables();
    }
    
    // Scenario 2: Inserting Policy Details
    public void insertPolicyDetails(String policyId) {
        repository.insertPolicyDetails(policyId);
    }
}