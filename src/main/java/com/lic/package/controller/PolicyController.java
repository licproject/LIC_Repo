package com.lic.package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.service.PolicyService;

@RestController
public class PolicyController {

    @Autowired
    PolicyService policyService;

    // Save data in the POLICY_SRV_MBR table
    @PostMapping("/saveMemberData")
    public void saveMemberData(@RequestBody Object data) {
        policyService.saveMemberData(data);
    }

    // Save data in the POLICY_SRV_MBR_ADRS table
    @PostMapping("/saveMemberAddressData")
    public void saveMemberAddressData(@RequestBody Object data) {
        policyService.saveMemberAddressData(data);
    }

    // Save data in the POLICY_SRV_MBR_BANK table
    @PostMapping("/saveMemberBankData")
    public void saveMemberBankData(@RequestBody Object data) {
        policyService.saveMemberBankData(data);
    }

    // Save data in the POLICY_SRV_MBR_NOMI table
    @PostMapping("/saveMemberNomiData")
    public void saveMemberNomiData(@RequestBody Object data) {
        policyService.saveMemberNomiData(data);
    }

    // Update data in the POLICY_SRV_MBR table
    @PutMapping("/updateMemberData")
    public void updateMemberData(@RequestBody Object data) {
        policyService.updateMemberData(data);
    }

    // Update data in the POLICY_SRV_MBR_ADRS table
    @PutMapping("/updateMemberAddressData")
    public void updateMemberAddressData(@RequestBody Object data) {
        policyService.updateMemberAddressData(data);
    }

    // Update data in the POLICY_SRV_MBR_BANK table
    @PutMapping("/updateMemberBankData")
    public void updateMemberBankData(@RequestBody Object data) {
        policyService.updateMemberBankData(data);
    }

    // Update data in the POLICY_SRV_MBR_NOMI table
    @PutMapping("/updateMemberNomiData")
    public void updateMemberNomiData(@RequestBody Object data) {
        policyService.updateMemberNomiData(data);
    }

}