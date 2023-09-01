package com.lic.package.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.package.model.PolicyDetails;

public interface PolicyDetailsRepository extends JpaRepository<PolicyDetails, Long> {

    @Query(value = "SELECT mph.mph_code, mph.mph_name, bank.bank_name, bank.bank_branch, bank.account_number, mphAdr.city_locality, mphAdr.district, COUNT(*) OVER() AS total_count, CEIL(COUNT(*) OVER() / 10) AS no_of_pages FROM PMST_MPH mph 
    LEFT JOIN PMST_MPH_BANK bank ON mph.mph_code = bank.mph_code 
    LEFT JOIN PMST_MPH_ADDRESS mphAdr ON mph.mph_code = mphAdr.mph_code 
    LEFT JOIN PMST_MPH_REPRESENTATIVES rep ON mph.mph_code = rep.mph_code 
    WHERE (?1 IS NULL OR mph.mph_code = ?1) 
    AND (?2 IS NULL OR mph.mph_name = ?2) 
    AND (?3 IS NULL OR bank.account_number = ?3) 
    ORDER BY 
    CASE WHEN ?4 = true THEN mph.mph_name END ASC, 
    CASE WHEN ?5 = true THEN mph.mph_name END DESC, 
    CASE WHEN ?6 = true THEN bank.bank_name END ASC, 
    CASE WHEN ?7 = true THEN bank.bank_name END DESC, 
    CASE WHEN ?8 = true THEN bank.bank_branch END ASC, 
    CASE WHEN ?9 = true THEN bank.bank_branch END DESC, 
    CASE WHEN ?10 = true THEN bank.account_number END ASC, 
    CASE WHEN ?11 = true THEN bank.account_number END DESC, 
    CASE WHEN ?12 = true THEN mphAdr.city_locality END ASC, 
    CASE WHEN ?13 = true THEN mphAdr.city_locality END DESC, 
    CASE WHEN ?14 = true THEN mphAdr.district END ASC, 
    CASE WHEN ?15 = true THEN mphAdr.district END DESC 
    LIMIT 10 OFFSET (?16 * 10)", 
    nativeQuery = true)
    List<PolicyDetails> getPolicyDetails(String mphCode, String mphName, String accountNumber, boolean sortByMphNameAsc, boolean sortByMphNameDesc, boolean sortByBankNameAsc, boolean sortByBankNameDesc, boolean sortByBankBranchAsc, boolean sortByBankBranchDesc, boolean sortByAccountNumberAsc, boolean sortByAccountNumberDesc, boolean sortByCityLocalityAsc, boolean sortByCityLocalityDesc, boolean sortByDistrictAsc, boolean sortByDistrictDesc, int pageNumber);
}