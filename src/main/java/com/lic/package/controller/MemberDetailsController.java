o   The “modified by” and “modified on” fields must be updated when changes are made.

package com.lic.package.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.lic.package.model.POLICY_SRV_MBR;
import com.lic.package.repository.MemberDetailsRepository;
import com.lic.package.service.MemberDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberDetailsController {
    @Autowired
    MemberDetailsService memberDetailsService;

    @Autowired
    MemberDetailsRepository memberDetailsRepository;

    @GetMapping("/member/findByMemberId")
    public Optional<POLICY_SRV_MBR> findByMemberId(@RequestParam Long memberId){
        return memberDetailsService.findByMemberId(memberId);
    }

    @GetMapping("/member/findByAadharNumber")
    public Optional<POLICY_SRV_MBR> findByAadharNumber(@RequestParam String aadharNumber){
        return memberDetailsService.findByAadharNumber(aadharNumber);
    }

    @PostMapping("/member/save")
    public POLICY_SRV_MBR saveMemberDetails(@RequestBody POLICY_SRV_MBR memberDetails){
        return memberDetailsRepository.save(memberDetails);
    }

    @PutMapping("/member/update")
    public POLICY_SRV_MBR updateMemberDetails(@RequestBody POLICY_SRV_MBR memberDetails){
        return memberDetailsRepository.save(memberDetails);
    }

    @GetMapping("/member/findByCategoryNumberAndCommunicationPreferenceAndCreatedByAndCreatedOnAndDateOfBirthAndDateOfJoiningAndDateOfJoiningSchemeAndDateOfRetirementAndDesignationAndEmailAddressAndFathersNameAndFirstNameAndGenderAndIsActiveAndIsZeroIdAndLandlineNumberAndLanguagePreferenceAndLastNameAndLICIdAndMaritalStatusAndMemberAdditionIdAndMemberPANAndMemberStatusAndMembershipNumberAndMiddleNameAndMobileNumberAndModifiedByAndModifiedOnAndPolicyIdAndSpouseNameAndTypeOfMembershipAndAnnuityOptionAndBatchIdAndCategoryAndEmployeeContributionAndEmployerContributionAndFrequencyAndMPHCodeAndMPHNameAndPANAndPhoneNumberAndPolicyNumberAndPolicyStatusAndProductAndQuotationIdAndQuotationTypeAndReferenceLICIdAndRoleAndServiceIdAndServiceNumberAndServiceStatusAndTotalContributionAndTotalInterestedAccruedAndUnitCodeAndVoluntaryContributionAndMembershipId")
    public List<POLICY_SRV_MBR> findByCategoryNumberAndCommunicationPreferenceAndCreatedByAndCreatedOnAndDateOfBirthAndDateOfJoiningAndDateOfJoiningSchemeAndDateOfRetirementAndDesignationAndEmailAddressAndFathersNameAndFirstNameAndGenderAndIsActiveAndIsZeroIdAndLandlineNumberAndLanguagePreferenceAndLastNameAndLICIdAndMaritalStatusAndMemberAdditionIdAndMemberPANAndMemberStatusAndMembershipNumberAndMiddleNameAndMobileNumberAndModifiedByAndModifiedOnAndPolicyIdAndSpouseNameAndTypeOfMembershipAndAnnuityOptionAndBatchIdAndCategoryAndEmployeeContributionAndEmployerContributionAndFrequencyAndMPHCodeAndMPHNameAndPANAndPhoneNumberAndPolicyNumberAndPolicyStatusAndProductAndQuotationIdAndQuotationTypeAndReferenceLICIdAndRoleAndServiceIdAndServiceNumberAndServiceStatusAndTotalContributionAndTotalInterestedAccruedAndUnitCodeAndVoluntaryContributionAndMembershipId(@RequestParam String categoryNumber,
        @RequestParam String communicationPreference, 
        @RequestParam String createdBy, 
        @RequestParam Date createdOn, 
        @RequestParam Date dateOfBirth, 