Solution: package com.lic.package.service;

import com.lic.package.dto.MphMasterDto;
import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.dto.ResponseDto;
import com.lic.package.entity.MphMasterTempEntity;
import com.lic.package.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PolicyService {

    @Autowired
    PolicyRepository policyRepository;

    @Autowired
    PolicyCommonServiceImpl policyCommonServiceImpl;

    public ResponseDto saveOrUpdatePolicyDetails(PolicyDto policyDto) {
        ResponseDto responseDto = new ResponseDto();

        // Validate Quotation ID
        if (policyDto.getQuotationId() == null) {
            responseDto.setTransactionMessage("QUOTATION_NUMBER_EMPTY");
            responseDto.setTransactionStatus("FAIL");
            return responseDto;
        }
        MphMasterTempEntity mphTempEntity = policyRepository.findByQuotationId(policyDto.getQuotationId());
        if (mphTempEntity == null) {
            responseDto.setTransactionMessage("QUOTATION_INVALID");
            responseDto.setTransactionStatus("FAIL");
            return responseDto;
        }

        // Handle Policy ID
        if (policyDto.getPolicyId() == null) { // Create a new MphMasterTempEntity
            MphMasterDto mphMasterDto = policyCommonServiceImpl.convertOldRequestToNewRequest(policyDto);
            mphTempEntity = policyRepository.save(new MphMasterTempEntity(mphMasterDto));
            if (mphTempEntity == null) {
                responseDto.setTransactionMessage("SAVE_ERROR");
                responseDto.setTransactionStatus("FAIL");
                return responseDto;
            }
            // Convert Quotation Members to Policy Members
            policyCommonServiceImpl.convertQutationMemberToPolicyMember(mphTempEntity.getMphId(), policyDto);
        } else { // Update existing MphMasterTempEntity
            mphTempEntity = policyRepository.findByPolicyId(policyDto.getPolicyId());
            MphMasterDto mphMasterDto = policyCommonServiceImpl.convertOldRequestToNewRequest(policyDto, mphTempEntity);
            mphTempEntity.setMphMasterDto(mphMasterDto);
            mphTempEntity = policyRepository.save(mphTempEntity);
            if (mphTempEntity == null) {
                responseDto.setTransactionMessage("UPDATE_ERROR");
                responseDto.setTransactionStatus("FAIL");
                return responseDto;
            }
        }

        // Handle Policy Frequency Details
        List<PolicyFrequencyDetailsDto> policyFrequencyDetailsDtoList = policyDto.getPolicyMaster();
        for (PolicyFrequencyDetailsDto pfd : policyFrequencyDetailsDtoList) {
            int updateStatus = policyRepository.updateFrequency(pfd.getFrequency(), mphTempEntity.getPolicyId());
            if (updateStatus == 0) {
                responseDto.setTransactionMessage("UPDATE_ERROR");
                responseDto.setTransactionStatus("FAIL");
                return responseDto;
            }
            List<String> frequencyDates = policyCommonServiceImpl.getFrequencyDates(pfd);
        }

        // Return Response
        responseDto.setMphId(mphTempEntity.getMphId());
        responseDto.setTransactionMessage("SAVE_MESSAGE");
        responseDto.setTransactionStatus("SUCCESS");
        return responseDto;
    }

    public List<PolicyFrequencyDetailsDto> getFrequencyDetails(Long policyId) {
        return policyRepository.getFrequencyDetails(policyId);
    }
}