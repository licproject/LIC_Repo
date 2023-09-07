package com.lic.package.controller;

import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.dto.ResponseDto;
import com.lic.package.service.PolicyCommonServiceImpl;
import com.lic.package.service.PolicyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policies")
public class PolicyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyController.class);

    @Autowired
    PolicyService policyService;

    @Autowired
    PolicyCommonServiceImpl policyCommonServiceImpl;

    @PostMapping
    public ResponseEntity<ResponseDto> saveOrUpdatePolicyDetails(@RequestBody PolicyDto policyDto) {
        ResponseDto responseDto = new ResponseDto();
        try {
            responseDto = policyService.saveOrUpdatePolicyDetails(policyDto);
        } catch (Exception e) {
            LOGGER.error("Error in saving or updating policy details : " + e.getMessage(), e);
            responseDto.setTransactionMessage("SAVE_ERROR");
            responseDto.setTransactionStatus("FAIL");
        }
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/{policyId}")
    public ResponseEntity<List<PolicyFrequencyDetailsDto>> getFrequencyDetails(@PathVariable Long policyId) {
        List<PolicyFrequencyDetailsDto> policyFrequencyDetailsDtoList = null;
        try {
            policyFrequencyDetailsDtoList = policyService.getFrequencyDetails(policyId);
        } catch (Exception e) {
            LOGGER.error("Error in getting frequency details : " + e.getMessage(), e);
        }
        return ResponseEntity.ok(policyFrequencyDetailsDtoList);
    }
}