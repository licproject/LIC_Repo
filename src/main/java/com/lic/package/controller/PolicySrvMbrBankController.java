package com.lic.package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.entity.PolicySrvMbrBank;
import com.lic.package.service.PolicySrvMbrBankService;

@RestController
@RequestMapping("/api/v1/policySrvMbrBank")
public class PolicySrvMbrBankController {
    
    @Autowired
    private PolicySrvMbrBankService policySrvMbrBankService;

    @PostMapping
    public ResponseEntity<PolicySrvMbrBank> createBankInfo(@RequestBody PolicySrvMbrBank policySrvMbrBank) {
        PolicySrvMbrBank createdBankInfo = policySrvMbrBankService.createBankInfo(policySrvMbrBank);
        return ResponseEntity.ok(createdBankInfo);
    }

    @PutMapping
    public ResponseEntity<PolicySrvMbrBank> updateBankInfo(@RequestParam Long bankId, @RequestBody PolicySrvMbrBank policySrvMbrBank) {
        PolicySrvMbrBank updatedBankInfo = policySrvMbrBankService.updateBankInfo(bankId, policySrvMbrBank);
        return ResponseEntity.ok(updatedBankInfo);
    }

}