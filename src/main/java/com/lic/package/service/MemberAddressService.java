package com.lic.package.service;

import com.lic.package.repository.MemberAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberAddressService {

    @Autowired
    private MemberAddressRepository memberAddressRepository;

    public int updateMemberAddress(Long memberAdditionId,
                                   Double employeeContribution,
                                   Double employerContribution,
                                   Boolean isActive,
                                   String lineOfBusiness,
                                   String modifiedBy,
                                   String modifiedOn,
                                   Integer noOfCategory,
                                   String policyMbrNo,
                                   String policyStatus,
                                   String product,
                                   Integer rejectionReasonCode,
                                   String rejectionRemarks,
                                   String serviceId,
                                   String serviceNumber,
                                   String serviceStatus,
                                   Double totalContribution,
                                   String unitCode,
                                   Double voluntaryContribution){
        return memberAddressRepository.updateMemberAddress(memberAdditionId, employeeContribution, employerContribution,
                isActive, lineOfBusiness, modifiedBy, modifiedOn, noOfCategory, policyMbrNo, policyStatus,
                product, rejectionReasonCode, rejectionRemarks, serviceId, serviceNumber, serviceStatus,
                totalContribution, unitCode, voluntaryContribution);
    }
    
    public void saveMemberAddress(String createdBy,
                                  String modifiedBy,
                                  Double employeeContribution,
                                  Double employerContribution,
                                  Boolean isActive,
                                  String lineOfBusiness,
                                  String memberAdditionStatus,
                                  String mphCode,
                                  String mphName,
                                  Long policyId,
                                  String policyMbrNo,
                                  String policyNumber,
                                  String policyStatus,
                                  String product,
                                  Integer rejectionReasonCode,
                                  String rejectionRemarks,
                                  String serviceId,
                                  String serviceNumber,
                                  String serviceStatus,
                                  Double totalContribution,
                                  String unitCode,
                                  Double voluntaryContribution,
                                  Integer noOfCategory){
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
        policySrvMbrAdd.setRejectionRemarks(rejectionRemarks);
        policySrvMbrAdd.setServiceId(serviceId);
        policySrvMbrAdd.setServiceNumber(serviceNumber);
        policySrvMbrAdd.setServiceStatus(serviceStatus);
        policySrvMbrAdd.setTotalContribution(totalContribution);
        policySrvMbrAdd.setUnitCode(unitCode);
        policySrvMbrAdd.setVoluntaryContribution(voluntaryContribution);
        policySrvMbrAdd.setNoOfCategory(noOfCategory);
        memberAddressRepository.save(policySrvMbrAdd);
    }

}