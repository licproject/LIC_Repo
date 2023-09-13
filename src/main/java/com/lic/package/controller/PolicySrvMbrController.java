package com.lic.package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.service.PolicySrvMbrService;

@RestController
@RequestMapping("/policy-srv-mbr")
public class PolicySrvMbrController {

    @Autowired
    PolicySrvMbrService policySrvMbrService;

    @RequestMapping(value = "/update-or-insert-member-data", method = RequestMethod.POST)
    public boolean updateOrInsertMemberData(
        @RequestParam(value = "memberId") Long memberId,
        @RequestParam(value = "aadharNumber") String aadharNumber,
        @RequestParam(value = "categoryNo") Integer categoryNo,
        @RequestParam(value = "communicationPreference") String communicationPreference,
        @RequestParam(value = "createdBy") Long createdBy,
        @RequestParam(value = "createdOn") Long createdOn,
        @RequestParam(value = "dateOfBirth") String dateOfBirth,
        @RequestParam(value = "dateOfJoining") String dateOfJoining,
        @RequestParam(value = "dateOfJoiningScheme") String dateOfJoiningScheme,
        @RequestParam(value = "dateOfRetriement") String dateOfRetriement,
        @RequestParam(value = "designation") String designation,
        @RequestParam(value = "emailId") String emailId,
        @RequestParam(value = "fatherName") String fatherName,
        @RequestParam(value = "firstName") String firstName,
        @RequestParam(value = "gender") String gender,
        @RequestParam(value = "isActive") Boolean isActive,
        @RequestParam(value = "isZeroId") Boolean isZeroId,
        @RequestParam(value = "landlineNo") String landlineNo,
        @RequestParam(value = "languagePreference") String languagePreference,
        @RequestParam(value = "lastName") String lastName,
        @RequestParam(value = "licId") String licId,
        @RequestParam(value = "maritalStatus") String maritalStatus,
        @RequestParam(value = "memberAdditionId") Long memberAdditionId,
        @RequestParam(value = "memberPan") String memberPan,
        @RequestParam(value = "memberStatus") String memberStatus,
        @RequestParam(value = "membershipNumber") String membershipNumber,
        @RequestParam(value = "middleName") String middleName,
        @RequestParam(value = "mobileNo") String mobileNo,
        @RequestParam(value = "modifiedBy") Long modifiedBy,
        @RequestParam(value = "modifiedOn") Long modifiedOn,
        @RequestParam(value = "policyId") Long policyId,
        @RequestParam(value = "spouseName") String spouseName,
        @RequestParam(value = "typeOfMembership") String typeOfMembership,
        @RequestParam(value = "annuityOption") String annuityOption,
        @RequestParam(value = "batchId") Long batchId,
        @RequestParam(value = "category") String category,
        @RequestParam(value = "employeeContribution") String employeeContribution,
        @RequestParam(value = "employerContribution") String employerContribution,
        @RequestParam(value = "frequency") String frequency,
        @RequestParam(value = "mphCode") String mphCode,
        @RequestParam(value = "mphName") String mphName,
        @RequestParam(value = "pan") String pan,
        @RequestParam(value = "phone") String phone,
        @RequestParam(value = "policyNo") String policyNo,
        @RequestParam(value = "policyStatus") String policyStatus,
        @RequestParam(value = "product") String product,
        @RequestParam(value = "quotationId") Long quotationId,
        @RequestParam(value = "quotationType") String quotationType,
        @RequestParam(