package com.lic.package.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.ResponseDto;
import com.lic.package.service.PolicyServiceImpl;

@RestController
@RequestMapping("/saveOrUpdatePolicy")
public class PolicyController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyController.class);

    @Autowired
    private PolicyServiceImpl policyServiceImpl;

    @PostMapping
    public ResponseEntity<ResponseDto> saveOrUpdatePolicyDetails(@RequestBody PolicyDto policyDto) {
        ResponseDto responseDto = policyServiceImpl.saveOrUpdatePolicyDetails(policyDto);
        LOGGER.info(" save or update policy details");
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

}