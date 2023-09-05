package com.lic.package.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.dto.PolicyResponseDto;
import com.lic.package.entity.MphMasterTempEntity;
import com.lic.package.entity.QuotationEntity;
import com.lic.package.repository.MphMasterTempRepository;
import com.lic.package.repository.PolicyRepository;
import com.lic.package.service.impl.PolicyCommonServiceImpl;

@Service
public class PolicyService {
	
	@Autowired
	private PolicyRepository policyRepository;
	
	@Autowired
	private MphMasterTempRepository mphMasterTempRepository;
	
	@Autowired
	private PolicyCommonServiceImpl policyCommonServiceImpl;
	
	private static final Logger logger = LoggerFactory.getLogger(PolicyService.class);
	
	public PolicyResponseDto savePolicyDetails(PolicyDto policyDto) {
		logger.info("Started processing save policy details for the policyDto={}", policyDto);
		
		PolicyResponseDto policyResponseDto = new PolicyResponseDto();
		
		String quotationId = policyDto.getQuotationId();
		if (quotationId == null) {
			policyResponseDto.setTransactionMessage("Quotation number is empty.");
			policyResponseDto.setTransactionStatus("Fail");
			return policyResponseDto;
		}
		
		QuotationEntity quotationEntity = policyRepository.findByQuotationIdAndStatusAndActiveTrue(quotationId,"Approved: No");
		if (quotationEntity == null) {
			policyResponseDto.setTransactionMessage("Quotation is invalid.");
			policyResponseDto.setTransactionStatus("Fail");
			return policyResponseDto;
		}
		
		if (policyDto.getPolicyId() == null) {
			MphMasterTempEntity mphMasterTempEntity = policyCommonServiceImpl.convertOldRequestToNewRequest(policyDto);
			mphMasterTempRepository.save(mphMasterTempEntity);
			Long mphId = mphMasterTempEntity.getMphId();
			if (mphId != null) {
				policyCommonServiceImpl.convertQutationMemberToPolicyMember(mphId, policyDto, mphMasterTempEntity.getVariantType());
			}
		} else {
			List<MphMasterTempEntity> mphMasterTempEntityList = mphMasterTempRepository
					.findByPolicyIdAndActiveTrueOrderByVariantTypeAsc(policyDto.getPolicyId());
			MphMasterTempEntity mphMasterTempEntity = policyCommonServiceImpl.convertEditRequestToNewRequest(mphMasterTempEntityList, policyDto);
			mphMasterTempRepository.save(mphMasterTempEntity);
			List<PolicyFrequencyDetailsDto> policyFrequencyDetailsDtoList = mphMasterTempEntity.getPolicyFrequencyDetails();
			policyFrequencyDetailsDtoList.forEach(policyFrequencyDetailsDto -> policyCommonServiceImpl.getFrequencyDates(policyFrequencyDetailsDto));
		}
		
		policyResponseDto.setMphId(mphMasterTempEntity.getMphId());
		policyResponseDto.setTransactionMessage("Policy details saved successfully.");
		policyResponseDto.setTransactionStatus("Success");
		
		return policyResponseDto;
	}
	
}