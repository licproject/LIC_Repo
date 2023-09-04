and processing.

package com.lic.package.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.service.RetrieveAndInsertPolicyDetailsService;
 
@RestController
public class RetrieveAndInsertPolicyDetailsController {
 
    @Autowired
    private RetrieveAndInsertPolicyDetailsService service;
 
    @PostMapping("/createTemporaryTables")
    public void createTemporaryTables() {
        service.createTemporaryTables();
    }
 
    @PostMapping("/insertPolicyDetails")
    public void insertPolicyDetails(@RequestParam String policyId) {
        service.insertPolicyDetails(policyId);
    }
 
}