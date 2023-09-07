package com.lic.package.repository;

import com.lic.package.dto.MphMasterDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.entity.MphMasterTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<MphMasterTempEntity, Long> {
    @Query("SELECT mpm FROM MphMasterTempEntity mpm WHERE mpm.quotationId = :quotationId")
    MphMasterTempEntity findByQuotationId(@Param("quotationId") Long quotationId);

    @Query("SELECT mpm FROM MphMasterTempEntity mpm WHERE mpm.policyId = :policyId")
    MphMasterTempEntity findByPolicyId(@Param("policyId") Long policyId);

    @Modifying
    @Query("UPDATE MphMasterTempEntity mpm SET mpm.mphId = :mphId WHERE mpm.policyId = :policyId")
    int updateMphId(@Param("mphId") Long mphId, @Param("policyId") Long policyId);

    @Modifying
    @Query("UPDATE MphMasterTempEntity mpm SET mpm.frequency = :frequency WHERE mpm.policyId = :policyId")
    int updateFrequency(@Param("frequency") String frequency, @Param("policyId") Long policyId);

    @Query("SELECT pfd FROM PolicyFrequencyDetailsDto pfd WHERE pfd.policyId = :policyId")
    List<PolicyFrequencyDetailsDto> getFrequencyDetails(@Param("policyId") Long policyId);
}