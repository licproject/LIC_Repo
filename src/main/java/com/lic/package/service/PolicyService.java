package com.lic.package.service;

import com.lic.package.dto.MphMasterDto;
import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.dto.PolicyResponseDto;
import com.lic.package.entity.MphMasterTempEntity;
import com.lic.package.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    @Autowired
    PolicyRepository policyRepository;

    public PolicyResponseDto savePolicyDetails(PolicyDto policyDto) {
        PolicyResponseDto responseDto = new PolicyResponseDto();
        if (policyDto.getQuotationId() == null) {
            responseDto.setMessage("Quotation number is empty");
            responseDto.setStatus("Fail");
            return responseDto;
        }
        // Check if valid quotation exists
        // ...

        // Process Policy Details
        if (policyDto.getPolicyId() == null) {
            // Create MphMasterDto from PolicyDto
            MphMasterDto mphMasterDto = new MphMasterDto();
            // ...

            // Save MphMasterTempEntity
            MphMasterTempEntity mphMasterTempEntity = policyRepository.save(mphMasterDto);
            Long mphId = mphMasterTempEntity.getMphId();

            // Call convertQutationMemberToPolicyMember
            responseDto = policyRepository.convertQutationMemberToPolicyMember(mphId, policyDto, "variantType");
        } else {
            // Retrieve Contributions, Summaries, and Member Data
            // ...

            // Create MphMasterDto
            MphMasterDto mphMasterDto = new MphMasterDto();
            // ...

            // Save MphMasterTempEntity
            MphMasterTempEntity mphMasterTempEntity = policyRepository.save(mphMasterDto);
            Long mphId = mphMasterTempEntity.getMphId();

            // Create PolicyFrequencyDetailsDto
            PolicyFrequencyDetailsDto policyFrequencyDetailsDto = new PolicyFrequencyDetailsDto();
            // ...

            // Get Frequency Dates
            policyFrequencyDetailsDto = policyRepository.getFrequencyDates(policyFrequencyDetailsDto);

            // Set response
            responseDto.setMphId(mphId);
            responseDto.setMessage("Policy details saved successfully");
            responseDto.setStatus("Success");
        }

        return responseDto;
    }

}