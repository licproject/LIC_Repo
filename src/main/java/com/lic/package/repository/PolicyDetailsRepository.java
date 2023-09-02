package com.lic.package.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.package.model.PolicyDetails;

@Repository
public interface PolicyDetailsRepository extends JpaRepository<PolicyDetails, Long> {

    @Query(value = "SELECT mph.*, bank.*, mphAdr.*, rep.* " + 
    "FROM PMST_MPH mph " + 
    "LEFT JOIN PMST_MPH_BANK bank ON mph.mph_code = bank.mph_code " + 
    "LEFT JOIN PMST_MPH_ADDRESS mphAdr ON mph.mph_code = mphAdr.mph_code " + 
    "LEFT JOIN PMST_MPH_REPRESENTATIVES rep ON mph.mph_code = rep.mph_code " + 
    "WHERE mph.mph_code = COALESCE(:mphCode, mph.mph_code) " + 
    "AND mph.mph_name = COALESCE(:mphName, mph.mph_name) " + 
    "AND bank.account_number = COALESCE(:accountNumber, bank.account_number) " + 
    "ORDER BY " + 
    "CASE WHEN :orderByMphName = 'asc' THEN mph.mph_name END ASC, " + 
    "CASE WHEN :orderByMphName = 'desc' THEN mph.mph_name END DESC, " + 
    "CASE WHEN :orderByBankName = 'asc' THEN bank.bank_name END ASC, " + 
    "CASE WHEN :orderByBankName = 'desc' THEN bank.bank_name END DESC, " + 
    "CASE WHEN :orderByBankBranch = 'asc' THEN bank.bank_branch END ASC, " + 
    "CASE WHEN :orderByBankBranch = 'desc' THEN bank.bank_branch END DESC, " + 
    "CASE WHEN :orderByAccountNumber = 'asc' THEN bank.account_number END ASC, " + 
    "CASE WHEN :orderByAccountNumber = 'desc' THEN bank.account_number END DESC, " + 
    "CASE WHEN :orderByCityLocality = 'asc' THEN mphAdr.city_locality END ASC, " + 
    "CASE WHEN :orderByCityLocality = 'desc' THEN mphAdr.city_locality END DESC, " + 
    "CASE WHEN :orderByDistrict = 'asc' THEN mphAdr.district END ASC, " + 
    "CASE WHEN :orderByDistrict = 'desc' THEN mphAdr.district END DESC " + 
    "LIMIT :pageSize OFFSET :pageOffset", nativeQuery = true)
    List<PolicyDetails> getPolicyDetails(@Param("mphCode") String mphCode,
                                        @Param("mphName") String mphName,
                                        @Param("accountNumber") String accountNumber,
                                        @Param("orderByMphName") String orderByMphName,
                                        @Param("orderByBankName") String orderByBankName,
                                        @Param("orderByBankBranch") String orderByBankBranch,
                                        @Param("orderByAccountNumber") String orderByAccountNumber,
                                        @Param("orderByCityLocality") String orderByCityLocality,
                                        @Param("orderByDistrict") String orderByDistrict,
                                        @Param("pageSize") int pageSize,
                                        @Param("pageOffset") int pageOffset);
}