package com.lic.package.controller;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.Members;
import com.lic.package.service.MembersService;

@RestController
@RequestMapping("/members")
public class MembersController {
    
    @Autowired
    private MembersService membersService;

    @GetMapping("/")
    public List<Members> getMembersByPolicyId(@RequestParam(value="policyId") Long policyId,
                                             @RequestParam(value="orderBy", defaultValue="0") @Min(value=0) @Max(value=18) Integer orderBy,
                                             @RequestParam(value="rowNo", defaultValue="0") @Min(value=0) @Max(value=200) Integer rowNo) {
        return membersService.getMembersByPolicyId(policyId, orderBy, rowNo);
    }

    @GetMapping("/total")
    public Integer getTotalMembersByPolicyId(@RequestParam(value="policyId") Long policyId) {
        return membersService.getTotalMembersByPolicyId(policyId);
    }

}