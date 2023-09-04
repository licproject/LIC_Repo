package com.lic.package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.service.PolicyService;

@RestController
@RequestMapping("/api/policy")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @PostMapping
    public ResponseEntity<?> insertDataIntoMembers(@RequestBody String mphCode) {
        try {
            policyService.insertDataIntoMembers(mphCode);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok().build();
    }
}