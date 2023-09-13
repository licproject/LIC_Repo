Father Name, memberDetails.getGender(), memberDetails.getIsActive(), memberDetails.getIsZeroId(), memberDetails.getLandlineNo(), memberDetails.getLanguagePreference(),
                memberDetails.getLastName(), memberDetails.getLicId(), memberDetails.getMaritalStatus(), memberDetails.getMemberPan(), memberDetails.getMemberStatus(),
                memberDetails.getMembershipNumber(), memberDetails.getMiddleName(), memberDetails.getMobileNo(), memberDetails.getPolicyId(), memberDetails.getSpouseName(), 
                memberDetails.getTypeOfMembership());
    }

    //Updating Member Details
    public int updateMemberDetails(MemberDetails memberDetails) {
        return memberDetailsRepository.updateMemberDetails(memberDetails.getAadharNumber(), memberDetails.getCategoryNo(), memberDetails.getCommunicationPreference(),
                memberDetails.getCreatedBy(), memberDetails.getDateOfBirth(), memberDetails.getDateOfJoining(), memberDetails.getDateOfJoiningScheme(), 
                memberDetails.getDateOfRetirement(), memberDetails.getDesignation(), memberDetails.getEmailId(), memberDetails.getFatherName(), 
                memberDetails.getFirstName(), memberDetails.getGender(), memberDetails.getIsActive(), memberDetails.getIsZeroId(), memberDetails.getLandlineNo(), 
                memberDetails.getLanguagePreference(), memberDetails.getLastName(), memberDetails.getLicId(), memberDetails.getMaritalStatus(), memberDetails.getMemberPan(), 
                memberDetails.getMemberStatus(), memberDetails.getMembershipNumber(), memberDetails.getMiddleName(), memberDetails.getMobileNo(), memberDetails.getPolicyId(), 
                memberDetails.getSpouseName(), memberDetails.getTypeOfMembership(), memberDetails.getModifiedBy(), memberDetails.getMemberId());
    }

}

package com.lic.package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lic.package.service.MemberDetailsService;
import com.lic.package.entity.MemberDetails;

@RestController
public class MemberDetailsController {

    @Autowired
    private MemberDetailsService memberDetailsService;

    //Saving Member Details
    @PostMapping("/member-details")
    public int saveMemberDetails(@RequestBody MemberDetails memberDetails) {
        return memberDetailsService.saveMemberDetails(memberDetails);
    }

    //Updating Member Details
    @PutMapping("/member-details")
    public int updateMemberDetails(@RequestBody MemberDetails memberDetails) {
        return memberDetailsService.updateMemberDetails(memberDetails);
    }

}