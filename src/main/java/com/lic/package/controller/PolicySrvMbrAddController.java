V_MBR_ADD.setServiceStatus(serviceStatus);
        policySrvMbrAdd.setEmployeeContribution(employeeContribution);
        policySrvMbrAdd.setEmployerContribution(employerContribution);
        policySrvMbrAdd.setTotalContribution(totalContribution);
        policySrvMbrAdd.setVoluntaryContribution(voluntaryContribution);
        policySrvMbrAdd.setNoOfCategory(noOfCategory);
        policySrvMbrAdd.setMphCode(mphCode);
        policySrvMbrAdd.setMphName(mphName);
        policySrvMbrAdd.setPolicyStatus(policyStatus);
        policySrvMbrAdd.setRejectionReasoncode(rejectionReasonCode);
        policySrvMbrAdd.setRejectionRemarks(rejectionRemarks);
        policySrvMbrAdd.setIsActive(isActive);
        policySrvMbrAdd.setMemberAdditionStatus(memberAdditionStatus);
        return policySrvMbrAddRepository.save(policySrvMbrAdd);
    }

}

package com.lic.package.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.entity.PolicySrvMbrAdd;
import com.lic.package.service.PolicySrvMbrAddService;

@RestController
@RequestMapping("/policySrvMbrAdd")
public class PolicySrvMbrAddController {

    @Autowired
    PolicySrvMbrAddService policySrvMbrAddService;

    // Method to save member address
    @PostMapping("/saveMemberAddress")
    public PolicySrvMbrAdd saveMemberAddress(@RequestBody PolicySrvMbrAdd policySrvMbrAdd) {
        return policySrvMbrAddService.saveMemberAddress(policySrvMbrAdd.getMemberAdditionId(), policySrvMbrAdd.getCreatedBy(),
                policySrvMbrAdd.getModifiedBy(), policySrvMbrAdd.getLineOfBusiness(),
                policySrvMbrAdd.getPolicyMbrNo(), policySrvMbrAdd.getPolicyNumber(),
                policySrvMbrAdd.getProduct(), policySrvMbrAdd.getServiceId(),
                policySrvMbrAdd.getServiceNumber(), policySrvMbrAdd.getServiceStatus(),
                policySrvMbrAdd.getEmployeeContribution(), policySrvMbrAdd.getEmployerContribution(),
                policySrvMbrAdd.getTotalContribution(), policySrvMbrAdd.getVoluntaryContribution(),
                policySrvMbrAdd.getNoOfCategory(), policySrvMbrAdd.getMphCode(),
                policySrvMbrAdd.getMphName(), policySrvMbrAdd.getPolicyStatus(),
                policySrvMbrAdd.getRejectionReasoncode(), policySrvMbrAdd.getRejectionRemarks(),
                policySrvMbrAdd.getIsActive(), policySrvMbrAdd.getMemberAdditionStatus());
    }

    // Method to update member address
    @PostMapping("/updateMemberAddress")
    public PolicySrvMbrAdd updateMemberAddress(@RequestBody PolicySrvMbrAdd policySrvMbrAdd) {
        return policySrvMbrAddService.updateMemberAddress(policySrvMbrAdd.getMemberAdditionId(),
                policySrvMbrAdd.getModifiedBy(), policySrvMbrAdd.getLineOfBusiness(),
                policySrvMbrAdd.getPolicyMbrNo(), policySr