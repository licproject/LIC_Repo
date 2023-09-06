package com.lic.package.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.constants.PolicyConstants;
import com.lic.package.dto.MphMasterDto;
import com.lic.package.service.MphMasterService;

@RestController
public class MphMasterController {
    
    @Autowired
    private MphMasterService mphMasterService;
    
    @PostMapping("/save-policy-details")
    @Transactional
    @Modifying
    public ResponseEntity<MphMasterDto> savePolicyDetails(@RequestBody MphMasterDto policyDto) {
        try {
            policyDto = mphMasterService.savePolicyDetails(policyDto);
            return ResponseEntity.ok(policyDto);
        } catch (ParseException e) {
            policyDto.setTransactionMessage(PolicyConstants.FAIL);
            policyDto.setTransactionStatus(PolicyConstants.EXCEPTION);
            return ResponseEntity.ok(policyDto);
        }
    }
}