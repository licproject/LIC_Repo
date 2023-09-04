package com.lic.package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.PMST_MPH;
import com.lic.package.repository.PolicyRepository;
import com.lic.package.service.PolicyService;

@RestController
@RequestMapping("/api/v1/policy")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @Autowired
    private PolicyRepository policyRepository;

    @GetMapping("/get/{mphCode}")
    public PMST_MPH getPolicyByMphCode(@PathVariable String mphCode) {
        return policyService.findByMphCode(mphCode);
    }

    @PostMapping("/insert")
    public void insertIntoMembers(@RequestBody PMST_MPH mph) {
      String licId = mph.getLicId();
      String policyId = mph.getPolicyId();
      String fatherName = mph.getFatherName();
      String firstName = mph.getName();
      String lastName = mph.getMphCode();
      String categoryNo = mph.getCategoryNo();
      boolean isActive = mph.isActive();
      boolean isZeroId = mph.isZeroId();

      policyService.insertIntoMembers(licId, policyId, fatherName, firstName, lastName, categoryNo, isActive, isZeroId);
    }
}