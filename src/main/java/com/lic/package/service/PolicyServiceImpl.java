package com.lic.package.service;

import com.lic.package.dto.MphMasterDto;
import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.dto.ResponseDto;
import com.lic.package.entity.MphMasterTempEntity;
import com.lic.package.repository.PolicyRepository;
import com.lic.package.util.Constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PolicyServiceImpl {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyServiceImpl.class);

    @Autowired
    private PolicyRepository policyRepository;

    @Autowired
    private PolicyCommonServiceImpl policyCommonServiceImpl;

    public ResponseDto saveOrUpdatePolicyDetails(PolicyDto policyDto) {
        ResponseDto responseDto = new ResponseDto();
        try {
            MphMasterTempEntity mphTempEntity = null;
            //Validate Quotation ID
            Long quotationId = policyDto.getQuotationId();
            if (quotationId != null) {
                mphTempEntity = policyRepository.findByQuotationId(quotationId);
                if (mphTempEntity == null || mphTempEntity.getActive() != 1) {
                    responseDto.setTransactionMessage(Constants.QUOTATION_INVALID);
                    responseDto.setTransactionStatus(Constants.FAIL);
                    LOGGER.info("Quotation ID is invalid");
                    return responseDto;
                }
            } else {
                responseDto.setTransactionMessage(Constants.QUOTATION_NUMBER_EMPTY);
                responseDto.setTransactionStatus(Constants.FAIL);
                LOGGER.info("Quotation ID is empty");
                return responseDto;
            }

            //Handle Policy ID
            Long policyId = policyDto.getPolicyId();
            if (policyId == null) {
                MphMasterDto mphDto = policyCommonServiceImpl.convertOldRequestToNewRequest(policyDto);
                mphTempEntity = new MphMasterTempEntity();
                mphTempEntity.setMphDto(mphDto);
                policyRepository.save(mphTempEntity);
            } else {
                mphTempEntity.setMphDto(policyCommonServiceImpl.createMphDtoWithExistingDetails(policyDto));
                policyRepository.save(mphTempEntity);
            }

            //Convert Quotation Members to Policy Members
            if (policyId == null) {
                policyCommonServiceImpl.convertQutationMemberToPolicyMember(mphTempEntity.getMphId(), policyDto);
            }

            //Handle Policy Frequency Details
            for (MphMasterTempEntity tempEntity : mphTempEntity.getPolicyMaster()) {
                PolicyFrequencyDetailsDto frequencyDetailsDto = new PolicyFrequencyDetailsDto();
                frequencyDetailsDto.setPolicyId(tempEntity.getMphId());
                frequencyDetailsDto.setFrequency(tempEntity.getFrequency());
                Date[] frequencyDates = getFrequencyDates(frequencyDetailsDto);
                tempEntity.setFrequencyDates(frequencyDates);
                policyRepository.save(tempEntity);
            }

            //Form Response
            responseDto.setMphId(mphTempEntity.getMphId());
            responseDto.setTransactionMessage(Constants.SAVEMESSAGE);
            responseDto.setTransactionStatus(Constants.SUCCESS);
            LOGGER.info("Policy details saved/updated successfully");

        } catch (Exception ex) {
            LOGGER.error("Exception occurred while saving/updating policy details", ex);
            responseDto.setTransactionMessage(Constants.EXCEPTION_OCCURRED);
            responseDto.setTransactionStatus(Constants.FAIL);
        }
        return responseDto;
    }

    private Date[] getFrequencyDates(PolicyFrequencyDetailsDto frequencyDetailsDto