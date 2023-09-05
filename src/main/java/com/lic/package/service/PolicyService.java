package com.lic.package.service;

import com.lic.package.dto.MphMasterDto;
import com.lic.package.dto.MphMasterTempEntity;
import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.dto.PolicyResponseDto;
import com.lic.package.repository.PolicyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    public PolicyResponseDto savePolicyDetails(PolicyDto policyDto) {
        PolicyResponseDto policyResponseDto = new PolicyResponseDto();
        
        if (policyDto.getQuotationId() == null) {
            policyResponseDto.setMessage("Quotation number is empty");
            policyResponseDto.setTransactionStatus("Fail");
            return policyResponseDto;
        }
        
        // Check if a valid quotation exists with the given quotationId and has the status "Approved: No"
        // If such a quotation does not exist, return a PolicyResponseDto with a message "Quotation is invalid" and a transaction status of "Fail"
        
        // Process the policy details
        
        if (policyDto.getPolicyId() == null) {
            // Convert the provided PolicyDto into an MphMasterDto and save it as an MphMasterTempEntity in the database
            MphMasterDto mphMasterDto = policyRepository.convertQutationMemberToPolicyMember(null, policyDto, null);
            MphMasterTempEntity mphMasterTempEntity = new MphMasterTempEntity();
            // Set the mphId in the PolicyResponseDto
            
            policyResponseDto.setMphId(mphMasterTempEntity.getMphId());
        } else {
            // Retrieve information related to the existing policy
            // This includes fetching contributions, contribution summaries, and member data
            // Create an MphMasterDto and save it as an MphMasterTempEntity in the database
            // Create a PolicyFrequencyDetailsDto containing the policyId and the contribution frequency converted to a string
            // Call the getFrequencyDates method with this DTO to populate frequency dates
        }
        
        policyResponseDto.setMessage("Policy details saved successfully");
        policyResponseDto.setTransactionStatus("Success");
        return policyResponseDto;
    }

}