package com.lic.package.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.package.repository.DataMigrationRepository;

@Service
public class DataMigrationService {
    
    @Autowired
    private DataMigrationRepository dataMigrationRepository;
    
    @Transactional
    public void createTemporaryTables() {
        dataMigrationRepository.createTemporaryTables();
    }
    
    @Transactional
    public void fetchAndInsertPolicyDetails() {
        dataMigrationRepository.fetchAndInsertPolicyDetails();
    }
}