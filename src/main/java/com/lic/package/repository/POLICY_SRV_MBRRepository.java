package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.package.model.POLICY_SRV_MBR;

@Repository
public interface POLICY_SRV_MBRRepository extends JpaRepository<POLICY_SRV_MBR, Long> {
 
    POLICY_SRV_MBR findByMemberId(Long memberId);
    
    POLICY_SRV_MBR save(POLICY_SRV_MBR member);
    
    void deleteByMemberId(Long memberId);
    
    POLICY_SRV_MBR findByAadharNumber(Long aadharNumber);
    
    POLICY_SRV_MBR findByCategoryNo (Long categoryNo);
    
    POLICY_SRV_MBR findByCommunicationPreference(String communicationPreference);
    
    POLICY_SRV_MBR findByCreatedBy(String createdBy);
    
    POLICY_SRV_MBR findByCreatedOn(String createdOn);
    
    POLICY_SRV_MBR findByDateOfBirth(String dateOfBirth);
    
    POLICY_SRV_MBR findByDateOfJoining(String dateOfJoining);
    
    POLICY_SRV_MBR findByDateOfJoiningScheme(String dateOfJoiningScheme);
    
    POLICY_SRV_MBR findByDateOfRetirement(String dateOfRetirement);
    
    POLICY_SRV_MBR findByDesignation(String designation);
    
    POLICY_SRV_MBR findByEmailId(String emailId);
    
    POLICY_SRV_MBR findByFatherName(String fatherName);
    
    POLICY_SRV_MBR findByFirstName(String firstName);
    
    POLICY_SRV_MBR findByGender(String gender);
    
    POLICY_SRV_MBR findByIsActive(Long isActive);
    
    POLICY_SRV_MBR findByIsZeroId(Long isZeroId);
    
    POLICY_SRV_MBR findByLandlineNo(Long landlineNo);
    
    POLICY_SRV_MBR findByLanguagePreference(String languagePreference);
    
    POLICY_SRV_MBR findByLastName(String lastName);
    
    POLICY_SRV_MBR findByLicId(String licId);
    
    POLICY_SRV_MBR findByMaritalStatus(String maritalStatus);
    
    POLICY_SRV_MBR findByMemberAdditionId(Long memberAdditionId);
    
    POLICY_SRV_MBR findByMemberPan(String memberPan);
    
    POLICY_SRV_MBR findByMemberStatus(String memberStatus);
    
    POLICY_SRV_MBR findByMembershipNumber(String membershipNumber);
    
    POLICY_SRV_MBR findByMiddleName(String middleName);
    
    POLICY_SRV_MBR findByMobileNo(Long mobileNo);
    
    POLICY_SRV_MBR findByModifiedBy(String modifiedBy);
    
    POLICY_SRV_MBR findByModifiedOn(String modifiedOn);
    
    POLICY_SRV_MBR findByPolicyId(Long policyId);
    
    POLICY_SRV_MBR findBySpouseName(String spouseName);
    
    POLICY_SRV_MBR findByTypeOfMembership(String typeOfMembership);
    
    POLICY_SRV_MBR findByAnnuityOption(String annuityOption);
    
    POLICY_SRV_MBR findByBatchId(Long batchId);
    
    POLICY_SRV_MBR findByCategory(Long category);
    
    POLICY_SRV_MBR findByEmployeeContribution(Long employeeContribution);
    
    POLICY_SRV_MBR findByEmployer