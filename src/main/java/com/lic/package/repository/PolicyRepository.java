package com.lic.package.repository;

import com.lic.package.dto.MphMasterDto;
import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.dto.PolicyResponseDto;
import com.lic.package.entity.MphMasterTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<MphMasterTempEntity, Long> {

    PolicyResponseDto savePolicyDetails(PolicyDto policyDto);

    PolicyResponseDto convertQutationMemberToPolicyMember(long mphId, PolicyDto policyDto, String variantType);

    PolicyFrequencyDetailsDto getFrequencyDates(PolicyFrequencyDetailsDto policyFrequencyDetailsDto);
}