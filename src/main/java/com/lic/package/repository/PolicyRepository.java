package com.lic.package.repository;

import com.lic.package.dto.MphMasterDto;
import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.dto.PolicyResponseDto;
import com.lic.package.entity.MphMasterTempEntity;
import com.lic.package.entity.QuotationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PolicyRepository extends JpaRepository<MphMasterTempEntity, Long> {

    @Query("SELECT * FROM QuotationEntity WHERE quotationId = :quotationId AND status = :status AND isActive = true")
    QuotationEntity findByQuotationId(String quotationId, String status);

    MphMasterTempEntity save(MphMasterDto mphMasterDto);

    PolicyFrequencyDetailsDto getFrequencyDates(PolicyFrequencyDetailsDto policyFrequencyDetailsDto);

    PolicyResponseDto savePolicyDetails(PolicyDto policyDto);

}