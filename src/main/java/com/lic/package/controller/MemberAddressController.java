package com.lic.package.controller;

import com.lic.package.repository.MemberAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberAddressController {
    
    @Autowired
    private MemberAddressRepository memberAddressRepository;

    @PutMapping("/updateMemberAddress")
    public int updateMemberAddress(@RequestParam Long memberAdditionId,
                                   @RequestParam Double employeeContribution,
                                   @RequestParam Double employerContribution,
                                   @RequestParam Boolean isActive,
                                   @RequestParam String lineOfBusiness,
                                   @RequestParam String modifiedBy,
                                   @RequestParam String modifiedOn,
                                   @RequestParam Integer noOfCategory,
                                   @RequestParam String policyMbrNo,
                                   @RequestParam String policyStatus,
                                   @RequestParam String product,
                                   @RequestParam Integer rejectionReasonCode,
                                   @RequestParam String rejectionRemarks,
                                   @RequestParam String serviceId,
                                   @RequestParam String serviceNumber,
                                   @RequestParam String serviceStatus,
                                   @RequestParam Double totalContribution,
                                   @RequestParam String unitCode,
                                   @RequestParam Double voluntaryContribution){
        return memberAddressRepository.updateMemberAddress(memberAdditionId, employeeContribution, employerContribution,
                isActive, lineOfBusiness, modifiedBy, modifiedOn, noOfCategory, policyMbrNo, policyStatus,
                product, rejectionReasonCode, rejectionRemarks, serviceId, serviceNumber, serviceStatus,
                totalContribution, unitCode, voluntaryContribution);
    }
    
    @PutMapping("/saveMemberAddress")
    public void saveMemberAddress(@RequestParam String createdBy,
                                  @RequestParam String modifiedBy,
                                  @RequestParam Double employeeContribution,
                                  @RequestParam Double employerContribution,
                                  @RequestParam Boolean isActive,
                                  @RequestParam String lineOfBusiness,
                                  @RequestParam String memberAdditionStatus,
                                  @RequestParam String mphCode,
                                  @RequestParam String mphName,
                                  @RequestParam Long policyId,
                                  @RequestParam String policyMbrNo,
                                  @RequestParam String policyNumber,
                                  @RequestParam String policyStatus,
                                  @RequestParam String product,
                                  @RequestParam Integer rejectionReasonCode,
                                  @RequestParam String rejectionRemarks,
                                  @RequestParam String serviceId,
                                  @RequestParam String serviceNumber,
                                  @RequestParam String serviceStatus,
                                  @RequestParam Double totalContribution,
                                  @RequestParam String unitCode,
                                  @RequestParam Double voluntaryContribution,
                                  @RequestParam Integer noOfCategory){
        POLICY_SRV_MBR_ADD policySrvMbrAdd = new POLICY_SRV_MBR_ADD();
        policySrvMbrAdd.setCreatedBy(createdBy);
        policySrvMbrAdd.setModifiedBy(modifiedBy);
        policySrvMbrAdd.setEmployeeContribution(employeeContribution);
        policySrvMbrAdd.setEmployerContribution(employerContribution);
        policySrvMbrAdd.setIsActive(isActive);
        policySrvMbrAdd.setLineOfBusiness(lineOfBusiness);
        policySrvMbrAdd.setMemberAdditionStatus(memberAdditionStatus);
        policySrvMbrAdd.setMphCode(mphCode);
        policySrvMbrAdd.setMphName(mphName);
        policySrvMbrAdd.setPolicyId(policyId);
        policySrvMbrAdd.setPolicyMbrNo(policyMbrNo);
        policySrvMbrAdd.setPolicyNumber(policyNumber);
        policySrvMbrAdd.setPolicyStatus(policyStatus);
        policySrvMbrAdd.setProduct(product);
        policySrvMbrAdd.setRejectionReasonCode(rejectionReasonCode);
        policySrvMbrAdd.setRejection