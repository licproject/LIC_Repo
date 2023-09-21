package com.lic.package.service;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.package.repository.POLICY_SRV_MBR_ADD;
import com.lic.package.repository.POLICY_SRV_MBR_ADDRepository;

@Service
public class POLICY_SRV_MBR_ADDService {

    @Autowired
    private POLICY_SRV_MBR_ADDRepository policySrvMbrAddRepository;

    public void saveMemberAddressDetails(String createdBy, double employeeContribution, double employerContribution, boolean isActive, String lineOfBusiness, String memberAdditionStatus, String mphCode, String mphName, long policyId, long policyMbrNo, String policyNumber, String policyStatus, String product, String rejectionReasonCode, String rejectionRemarks, long serviceId, String serviceNumber, String serviceStatus, double totalContribution, String unitCode, double voluntaryContribution, int noOfCategory) {
        policySrvMbrAddRepository.saveMemberAddressDetails(createdBy, new Date().toString(), employeeContribution, employerContribution, isActive, lineOfBusiness, memberAdditionStatus, createdBy, new Date().toString(), mphCode, mphName, policyId, policyMbrNo, policyNumber, policyStatus, product, rejectionReasonCode, rejectionRemarks, serviceId, serviceNumber, serviceStatus, totalContribution, unitCode, voluntaryContribution, noOfCategory);
    }

    public void updateMemberAddressDetails(String createdBy, double employeeContribution, double employerContribution, boolean isActive, String lineOfBusiness, String memberAdditionStatus, String mphCode, String mphName, long policyId, long policyMbrNo, String policyNumber, String policyStatus, String product, String rejectionReasonCode, String rejectionRemarks, long serviceId, String serviceNumber, String serviceStatus, double totalContribution, String unitCode, double voluntaryContribution, int noOfCategory, long memberAdditionId) {
        policySrvMbrAddRepository.updateMemberAddressDetails(createdBy, new Date().toString(), employeeContribution, employerContribution, isActive, lineOfBusiness, memberAdditionStatus, createdBy, new Date().toString(), mphCode, mphName, policyId, policyMbrNo, policyNumber, policyStatus, product, rejectionReasonCode, rejectionRemarks, serviceId, serviceNumber, serviceStatus, totalContribution, unitCode, voluntaryContribution, noOfCategory, memberAdditionId);
    }
}