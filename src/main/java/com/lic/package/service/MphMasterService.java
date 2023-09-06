package com.lic.package.service;

import java.text.ParseException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.package.constants.PolicyConstants;
import com.lic.package.dto.FrequencyDetails;
import com.lic.package.dto.MemberDetails;
import com.lic.package.dto.MphMasterDto;
import com.lic.package.entity.MphMasterTempEntity;
import com.lic.package.repository.MphMasterRepository;
import com.lic.package.repository.QuotationRepository;

public class MphMasterService {
    
    private final MphMasterRepository mphMasterRepository;
    private final QuotationRepository quotationRepository;
    
    public MphMasterService(MphMasterRepository mphMasterRepository, QuotationRepository quotationRepository) {
        this.mphMasterRepository = mphMasterRepository;
        this.quotationRepository = quotationRepository;
    }
    
    public MphMasterDto savePolicyDetails(MphMasterDto policyDto) throws ParseException {
        if (policyDto.getQuotationId() == null) {
            policyDto.setTransactionMessage(PolicyConstants.QUOTATION_NUMBER_EMPTY);
            policyDto.setTransactionStatus(PolicyConstants.FAIL);
            return policyDto;
        }
        
        if (quotationRepository.findByQuotationIdAndStatusAndActive(policyDto.getQuotationId(), PolicyConstants.QUOTATION_STATUS, PolicyConstants.ACTIVE) == null) {
            policyDto.setTransactionMessage(PolicyConstants.QUOTATION_INVALID);
            policyDto.setTransactionStatus(PolicyConstants.FAIL);
            return policyDto;
        }
        
        MphMasterTempEntity mphTempEntity = new MphMasterTempEntity();
        mphTempEntity.setQuotationId(policyDto.getQuotationId());
        
        if (policyDto.getPolicyId() == null) {
            // convert old request to new and save the resulting MphMasterTempEntity into the repository
            mphMasterRepository.save(mphTempEntity);
        } else {
            // fetch existing policy and member details and save the edited MphMasterTempEntity
            mphTempEntity = mphMasterRepository.findByPolicyId(policyDto.getPolicyId());
            mphMasterRepository.updateMemberDetails(policyDto.getMemberDetails(), policyDto.getPolicyId());
        }
        
        // convert and save the quotation member details into the policy member details
        mphTempEntity.setMemberDetails(policyDto.getMemberDetails());
        
        // for each PolicyMasterTempEntity, populate a new PolicyFrequencyDetailsDto and call getFrequencyDates() method for each
        mphTempEntity.setFrequencyDates(policyDto.getFrequencyDates());
        mphMasterRepository.save(mphTempEntity);
        
        // populate response.setMphId(mphTempEntity.getMphId());
        policyDto.setMphId(mphTempEntity.getMphId());
        policyDto.setTransactionMessage(PolicyConstants.SAVEMESSAGE);
        policyDto.setTransactionStatus(PolicyConstants.SUCCESS);
        
        return policyDto;
    }
}