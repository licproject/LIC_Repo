package com.lic.package.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.package.repository.PolicySrvMbrRepository;

@Service
public class PolicySrvMbrService {
  
    private PolicySrvMbrRepository policySrvMbrRepository;
    
    public PolicySrvMbrService(PolicySrvMbrRepository policySrvMbrRepository) {
        this.policySrvMbrRepository = policySrvMbrRepository;
    }
    
    @Transactional
    public boolean updateOrInsertMemberData(Long memberId, String aadharNumber, Integer categoryNo, String communicationPreference, 
                                           Long createdBy, Long createdOn, String dateOfBirth, String dateOfJoining, String dateOfJoiningScheme,
                                           String dateOfRetriement, String designation, String emailId, String fatherName, String firstName, 
                                           String gender, Boolean isActive, Boolean isZeroId, String landlineNo,
                                           String languagePreference, String lastName, String licId, String maritalStatus,
                                           Long memberAdditionId, String memberPan, String memberStatus, String membershipNumber, 
                                           String middleName, String mobileNo, Long modifiedBy, Long modifiedOn, Long policyId, 
                                           String spouseName, String typeOfMembership, String annuityOption, Long batchId, 
                                           String category, String employeeContribution, String employerContribution, String frequency, 
                                           String mphCode, String mphName, String pan, String phone, String policyNo,
                                           String policyStatus, String product, Long quotationId, String quotationType,
                                           String refLicId, String role, Long serviceId, String serviceNumber, String serviceStatus, 
                                           String totalContribution, String totalInterestedAccured, String unitCode,
                                           String voluntaryContribution, Long memberShipId) {
        
        try {
            int updatedRows = policySrvMbrRepository.updateOrInsertMemberData(memberId, aadharNumber, categoryNo, 
                                                                             communicationPreference, createdBy, createdOn, 
                                                                             dateOfBirth, dateOfJoining, dateOfJoiningScheme, 
                                                                             dateOfRetriement, designation, emailId, 
                                                                             fatherName, firstName, gender, isActive, isZeroId, 
                                                                             landlineNo, languagePreference, lastName, licId, 
                                                                             maritalStatus, memberAdditionId, memberPan, memberStatus, 
                                                                             membershipNumber, middleName, mobileNo, modifiedBy, 
                                                                             modifiedOn, policyId, spouseName, typeOfMembership, 
                                                                             annuityOption, batchId, category, employeeContribution, 
                                                                             employerContribution, frequency, mphCode, mphName, pan, 
                                                                             phone, policyNo, policyStatus, product, quotationId, 
                                                                             quotationType, refLicId, role, serviceId, serviceNumber, 
                                                                             serviceStatus, totalContribution, totalInterestedAccured, 
                                                                             unitCode, voluntaryContribution, memberShipId);
            return updatedRows > 0;
        } catch (Exception ex) {
            // Log the exception
            return false;
        }
    }
}