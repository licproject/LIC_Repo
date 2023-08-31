package com.lic.package.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.dao.MakerPolicyDetailChangeRepository;
import com.lic.package.model.Policy;
import com.lic.package.service.MakerPolicyDetailChangeService;

@RestController
@RequestMapping("/api")
public class MakerPolicyDetailChangeController {
    
    @Autowired
    private MakerPolicyDetailChangeService makerPolicyDetailChangeService;

    @Autowired
    private MakerPolicyDetailChangeRepository makerPolicyDetailChangeRepository;

    @GetMapping("/policydetailchange/{searchCriteria}")
    public List<Policy> findBySearchCriteria(@PathVariable String searchCriteria) {
        return makerPolicyDetailChangeService.findBySearchCriteria(searchCriteria);
    }

    @GetMapping("/policydetailchange/{policyNumber}")
    public Policy findByPolicyNumber(@PathVariable int policyNumber) {
        return makerPolicyDetailChangeService.findByPolicyNumber(policyNumber);
    }

    @PutMapping("/policydetailchange/basicdetails/{policyNumber}")
    public void updateBasicDetailsByPolicyNumber(@PathVariable int policyNumber, @RequestBody String basicDetails) {
        makerPolicyDetailChangeService.updateBasicDetailsByPolicyNumber(policyNumber, basicDetails);
    }

    @PutMapping("/policydetailchange/bankdetails/{policyNumber}")
    public void updateBankDetailsByPolicyNumber(@PathVariable int policyNumber, @RequestBody String bankDetails) {
        makerPolicyDetailChangeService.updateBankDetailsByPolicyNumber(policyNumber, bankDetails);
    }

    @PutMapping("/policydetailchange/addressdetails/{policyNumber}")
    public void updateAddressDetailsByPolicyNumber(@PathVariable int policyNumber, @RequestBody String addressDetails) {
        makerPolicyDetailChangeService.updateAddressDetailsByPolicyNumber(policyNumber, addressDetails);
    }

    @PutMapping("/policydetailchange/contactperson/{policyNumber}")
    public void updateContactPersonDetailsByPolicyNumber(@PathVariable int policyNumber, @RequestBody String contactPersonDetails) {
        makerPolicyDetailChangeService.updateContactPersonDetailsByPolicyNumber(policyNumber, contactPersonDetails);
    }

    @GetMapping("/policydetailchange/inprogressrecords")
    public List<Policy> findInProgressRecords() {
        return makerPolicyDetailChangeService.findInProgressRecords();
    }

    @PostMapping("/policydetailchange/sendrecord/{policyNumber}")
    public void sendRecordToChecker(@PathVariable int policyNumber) {
        makerPolicyDetailChangeService.sendRecordToChecker(policyNumber);
    }
}