package com.lic.package.repository;

import com.lic.package.dto.MphMasterDto;
import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.entity.MphMasterTempEntity;
import com.lic.package.service.PolicyCommonServiceImpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface PolicyRepository extends JpaRepository<MphMasterTempEntity, Long> {

    @Query("SELECT m FROM MphMasterTempEntity m WHERE m.quotationId = :quotationId AND m.active = 1")
    MphMasterTempEntity findByQuotationId(@Param("quotationId") Long quotationId);

    void save(MphMasterTempEntity mphTempEntity);

    void save(MphMasterDto mphDto);

    void save(PolicyFrequencyDetailsDto frequencyDetailsDto);

    MphMasterDto convertOldRequestToNewRequest(PolicyDto policyDto);

    Date[] getFrequencyDates(PolicyFrequencyDetailsDto frequencyDetailsDto);

}