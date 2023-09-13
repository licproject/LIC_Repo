package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PolicyServiceRepository extends JpaRepository<Object, Long> {
    
    // Insert data into the POLICY_SRV_MBR table
    @Query(value = "insert into POLICY_SRV_MBR (columns) values (values)", nativeQuery = true)
    @Transactional
    @Modifying
    void saveMemberData(Object data);

    // Insert data into the POLICY_SRV_MBR_ADRS table
    @Query(value = "insert into POLICY_SRV_MBR_ADRS (columns) values (values)", nativeQuery = true)
    @Transactional
    @Modifying
    void saveMemberAddressData(Object data);

    // Insert data into the POLICY_SRV_MBR_BANK table
    @Query(value = "insert into POLICY_SRV_MBR_BANK (columns) values (values)", nativeQuery = true)
    @Transactional
    @Modifying
    void saveMemberBankData(Object data);

    // Insert data into the POLICY_SRV_MBR_NOMI table
    @Query(value = "insert into POLICY_SRV_MBR_NOMI (columns) values (values)", nativeQuery = true)
    @Transactional
    @Modifying
    void saveMemberNomiData(Object data);

    // Update data in the POLICY_SRV_MBR table
    @Query(value = "update POLICY_SRV_MBR set (columns) = (values) where (conditions)", nativeQuery = true)
    @Transactional
    @Modifying
    void updateMemberData(Object data);

    // Update data in the POLICY_SRV_MBR_ADRS table
    @Query(value = "update POLICY_SRV_MBR_ADRS set (columns) = (values) where (conditions)", nativeQuery = true)
    @Transactional
    @Modifying
    void updateMemberAddressData(Object data);

    // Update data in the POLICY_SRV_MBR_BANK table
    @Query(value = "update POLICY_SRV_MBR_BANK set (columns) = (values) where (conditions)", nativeQuery = true)
    @Transactional
    @Modifying
    void updateMemberBankData(Object data);

    // Update data in the POLICY_SRV_MBR_NOMI table
    @Query(value = "update POLICY_SRV_MBR_NOMI set (columns) = (values) where (conditions)", nativeQuery = true)
    @Transactional
    @Modifying
    void updateMemberNomiData(Object data);
}