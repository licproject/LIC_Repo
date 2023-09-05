package com.lic.package.controller;

import com.lic.package.dto.MphMasterDto;
import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.dto.PolicyResponseDto;
import com.lic.package.entity.MphMasterTempEntity;
import com.lic.package.entity.QuotationEntity;
import com.lic.package.repository.PolicyRepository;
import com.lic.package.service.PolicyCommonServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyController.class);
    private static final String VARIANT_TYPE = "LIC";

    @Autowired
    private PolicyRepository policyRepository;

    @Autowired
    private PolicyCommonServiceImpl policyCommonServiceImpl;

    @PostMapping("/savePolicyDetails")
    public PolicyResponseDto savePolicyDetails(@RequestBody PolicyDto policyDto) {
        LOGGER.info("Started savePolicyDetails process");
        PolicyResponseDto responseDto = new PolicyResponseDto();
        if (policyDto.getQuotationId() == null) {
            responseDto.setTransactionMessage("Quotation number is empty.");
            responseDto.setTransactionStatus("Fail");
            return responseDto;
        }
        QuotationEntity quotationEntity = policyRepository.findByQuotationId(policyDto.getQuotationId(), "Approved: No");
        if (quotationEntity == null) {
            responseDto.setTransactionMessage("Quotation is invalid.");
            responseDto.setTransactionStatus("Fail");
            return responseDto;
        }
        if (policyDto.getPolicyId() == null) {
            MphMasterDto mphMasterDto = policyCommonServiceImpl.convertOldRequestToNewRequest(policyDto);
            MphMasterTempEntity savedEntity = policyRepository.save(mphMasterDto);
            if (savedEntity.getMphId() != null) {
                policyCommonServiceImpl.convertQutationMemberToPolicyMember(savedEntity.getMphId(), policyDto, VARIANT_TYPE);
            }
        } else {
            // Retrieve relevant data from the respective tables
            MphMasterDto mphMasterDto = policyCommonServiceImpl.convertEditRequestToNewRequest(policyDto);
            MphMasterTempEntity savedEntity = policyRepository.save(mphMasterDto);
            // For each PolicyMasterTempEntity associated with the mphTempEntity
            PolicyFrequencyDetailsDto frequencyDetailsDto = new PolicyFrequencyDetailsDto();
            frequencyDetailsDto.setPolicyId(savedEntity.getPolicyId());
            frequencyDetailsDto.setFrequency(savedEntity.getContributionFrequency().toString());
            policyRepository.getFrequencyDates(frequencyDetailsDto);
        }
        responseDto.setMphId(savedEntity.getMphId());
        responseDto.setTransactionMessage("Policy details saved successfully.");
        responseDto.setTransactionStatus("Success");
        return responseDto;
    }
}