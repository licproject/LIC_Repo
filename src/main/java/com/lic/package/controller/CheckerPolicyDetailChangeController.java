package com.lic.package.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.PolicyDetails;
import com.lic.package.model.TrusteeMPHDetails;
import com.lic.package.repository.CheckerPolicyDetailChangeRepository;
import com.lic.package.service.CheckerPolicyDetailChangeService;

@RestController
public class CheckerPolicyDetailChangeController {

    @Autowired
    private CheckerPolicyDetailChangeService checkerPolicyDetailChangeService;

    @Autowired
    private CheckerPolicyDetailChangeRepository checkerPolicyDetailChangeRepository;

    @GetMapping("/fetchPolicyDetails")
    public List<PolicyDetails> fetchPolicyDetails(@RequestParam String policyNumber) {
        return checkerPolicyDetailChangeService.fetchPolicyDetails(policyNumber);
    }

    @GetMapping("/fetchTrusteeMPHDetails")
    public List<TrusteeMPHDetails> fetchTrusteeMPHDetails() {
        return checkerPolicyDetailChangeService.fetchTrusteeMPHDetails();
    }

    @PostMapping("/moveTemptoMasterTable")
    public void moveTemptoMasterTable() {
        checkerPolicyDetailChangeService.moveTemptoMasterTable();
    }

    @PostMapping("/discardFromTempTable")
    public void discardFromTempTable() {
        checkerPolicyDetailChangeService.discardFromTempTable();
    }

    @PostMapping("/retainInTempTable")
    public void retainInTempTable() {
        checkerPolicyDetailChangeService.retainInTempTable();
    }

    @PostMapping("/showSuccessMessage")
    public void showSuccessMessage() {
        checkerPolicyDetailChangeService.showSuccessMessage();
    }

}