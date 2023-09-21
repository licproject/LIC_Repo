package com.lic.package.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.POLICY_SRV_MBR_ADD;
import com.lic.package.service.POLICY_SRV_MBR_ADDService;

@RestController
@RequestMapping("/api/policy_srv_mbr_add")
public class POLICY_SRV_MBR_ADDController {
   
    @Autowired
    private POLICY_SRV_MBR_ADDService policySrvMbrAddService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveMemberAddressDetails(@RequestBody POLICY_SRV_MBR_ADD policySrvMbrAdd) {
        policySrvMbrAddService.saveMemberAddressDetails(policySrvMbrAdd.getCreatedBy(),policySrvMbrAdd.getEmployeeContribution(), policySrvMbrAdd.getEmployerContribution(), policySrvMbrAdd.isActive(), policySrvMbrAdd.getLineOfBusiness(), policySrvMbrAdd.getMemberAdditionStatus(), policySrvMbrAdd.getMphCode(), policySrvMbrAdd.getMphName(), policySrvMbrAdd.getPolicyId(), policySrvMbrAdd.getPolicyMbrNo(), policySrvMbrAdd.getPolicyNumber(), policySrvMbrAdd.getPolicyStatus(), policySrvMbrAdd.getProduct(), policySrvMbrAdd.getRejectionReasonCode(), policySrvMbrAdd.getRejectionRemarks(), policySrvMbrAdd.getServiceId(), policySrvMbrAdd.getServiceNumber(), policySrvMbrAdd.getServiceStatus(), policySrvMbrAdd.getTotalContribution(), policySrvMbrAdd.getUnitCode(), policySrvMbrAdd.getVoluntaryContribution(), policySrvMbrAdd.getNoOfCategory());
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void updateMemberAddressDetails(@RequestBody POLICY_SRV_MBR_ADD policySrvMbrAdd) {
        policySrvMbrAddService.updateMemberAddressDetails(policySrvMbrAdd.getCreatedBy(), policySrvMbrAdd.getEmployeeContribution(), policySrvMbrAdd.getEmployerContribution(), policySrvMbrAdd.isActive(), policySrvMbrAdd.getLineOfBusiness(), policySrvMbrAdd.getMemberAdditionStatus(), policySrvMbrAdd.getMphCode(), policySrvMbrAdd.getMphName(), policySrvMbrAdd.getPolicyId(), policySrvMbrAdd.getPolicyMbrNo(), policySrvMbrAdd.getPolicyNumber(), policySrvMbrAdd.getPolicyStatus(), policySrvMbrAdd.getProduct(), policySrvMbrAdd.getRejectionReasonCode(), policySrvMbrAdd.getRejectionRemarks(), policySrvMbrAdd.getServiceId(), policySrvMbrAdd.getServiceNumber(), policySrvMbrAdd.getServiceStatus(), policySrvMbrAdd.getTotalContribution(), policySrvMbrAdd.getUnitCode(), policySrvMbrAdd.getVoluntaryContribution(), policySrvMbrAdd.getNoOfCategory(), policySrvMbrAdd.getMemberAdditionId());
    }

}