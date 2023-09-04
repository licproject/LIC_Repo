package com.lic.package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.service.DataMigrationService;

@RestController
@RequestMapping("/migrate-data")
public class DataMigrationController {
    
    @Autowired
    private DataMigrationService dataMigrationService;
    
    @PostMapping
    public void migrateData() {
        dataMigrationService.createTemporaryTables();
        dataMigrationService.fetchAndInsertPolicyDetails();
    }
}