package com.lic.package.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.POLICY_SRV_MBR_ADD;
import com.lic.package.repository.PolicySrvMbrAddRepository;
import com.lic.package.service.PolicySrvMbrAddService;

@RestController
public class PolicySrvMbrAddController {

    @Autowired
    private PolicySrvMbrAddService policySrvMbrAddService;

    @Autowired
    private PolicySrvMbrAddRepository policySrvMbrAddRepository;

    // Save Member Details
    @PostMapping("/policysrvmbradd/save")
    public POLICY_SRV_MBR_ADD saveMemberDetails(@RequestBody POLICY_SRV_MBR_ADD policySrvMbrAdd) {
        policySrvMbrAdd.setCreatedOn(new Timestamp(System.currentTimeMillis()));
        policySrvMbrAdd.setModifiedOn(new Timestamp(System.currentTimeMillis()));
        return policySrvMbrAddService.save(policySrvMbrAdd);
    }

    // Update Member Details
    @PutMapping("/policysrvmbradd/update")
    public POLICY_SRV_MBR_ADD updateMemberDetails(@RequestBody POLICY_SRV_MBR_ADD policySrvMbrAdd) {
        POLICY_SRV_MBR_ADD policySrvMbrAddToUpdate = policySrvMbrAddRepository.findByMemberAdditionId(policySrvMbrAdd.getMemberAdditionId());
        policySrvMbrAddToUpdate.setCreatedBy(policySrvMbrAdd.getCreatedBy());
        policySrvMbrAddToUpdate.setEmployeeContribution(policySrvMbrAdd.getEmployeeContribution());
        policySrvMbrAddToUpdate.setEmployerContribution(policySrvMbrAdd.getEmployerContribution());
        policySrvMbrAddToUpdate.setIsActive(policySrvMbrAdd.getIsActive());
        policySrvMbrAddToUpdate.setLineOfBusiness(policySrvMbrAdd.getLineOfBusiness());
        policySrvMbrAddToUpdate.setMemberAdditionStatus(policySrvMbrAdd.getMemberAdditionStatus());
        policySrvMbrAddToUpdate.setModifiedBy(policySrvMbrAdd.getModifiedBy());
        policySrvMbrAddToUpdate.setMphCode(policySrvMbrAdd.getMphCode());
        policySrvMbrAddToUpdate.setMphName(policySrvMbrAdd.getMphName());
        policySrvMbrAddToUpdate.setPolicyId(policySrvMbrAdd.getPolicyId());
        policySrvMbrAddToUpdate.setPolicyMbrNo(policySrvMbrAdd.getPolicyMbrNo());
        policySrvMbrAddToUpdate.setPolicyNumber(policySrvMbrAdd.getPolicyNumber());
        policySrvMbrAddToUpdate.setPolicyStatus(policySrvMbrAdd.getPolicyStatus());
        policySrvMbrAddToUpdate.setProduct(policySrvMbrAdd.getProduct());
        policySrvMbrAddToUpdate.setRejectionReasonCode(policySrvMbrAdd.getRejectionReasonCode());
        policySrvMbrAddToUpdate.setRejectionRemarks(policySrvMbrAdd.getRejectionRemarks());
        policySrvMbrAddToUpdate.setServiceId(policySrvMbrAdd.getServiceId());
       