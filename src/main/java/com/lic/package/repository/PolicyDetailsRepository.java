package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PolicyDetailsRepository extends JpaRepository<PolicyDetails, Long> {
	
	@Query(value = 
		"SELECT mph.*, bank.*, mphAdr.*, rep.* " +
		"FROM PMST_MPH mph " +
		"LEFT JOIN PMST_MPH_BANK bank ON mph.mph_code = bank.mph_code " +
		"LEFT JOIN PMST_MPH_ADDRESS mphAdr ON mph.mph_code = mphAdr.mph_code " +
		"LEFT JOIN PMST_MPH_REPRESENTATIVES rep ON mph.mph_code = rep.mph_code " +
		"WHERE " +
		"(:mph_code IS NULL OR mph.mph_code = :mph_code) " +
		"AND (:mph_name IS NULL OR mph.mph_name = :mph_name) " +
		"AND (:account_number IS NULL OR bank.account_number = :account_number) " +
		"ORDER BY " +
		"(CASE WHEN :sort_1 = 'asc' THEN mph.mph_name END) ASC, " +
		"(CASE WHEN :sort_1 = 'desc' THEN mph.mph_name END) DESC, " +
		"(CASE WHEN :sort_2 = 'asc' THEN bank.bank_name END) ASC, " +
		"(CASE WHEN :sort_2 = 'desc' THEN bank.bank_name END) DESC, " +
		"(CASE WHEN :sort_3 = 'asc' THEN bank.bank_branch END) ASC, " +
		"(CASE WHEN :sort_3 = 'desc' THEN bank.bank_branch END) DESC, " +
		"(CASE WHEN :sort_4 = 'asc' THEN bank.account_number END) ASC, " +
		"(CASE WHEN :sort_4 = 'desc' THEN bank.account_number END) DESC, " +
		"(CASE WHEN :sort_5 = 'asc' THEN mphAdr.city_locality END) ASC, " +
		"(CASE WHEN :sort_5 = 'desc' THEN mphAdr.city_locality END) DESC, " +
		"(CASE WHEN :sort_6 = 'asc' THEN mphAdr.district END) ASC, " +
		"(CASE WHEN :sort_6 = 'desc' THEN mphAdr.district END) DESC " +
		"LIMIT 10 OFFSET :page_no * 10",
		nativeQuery = true)
	List<PolicyDetails> findPolicyDetails(
		@Param("mph_code") String mph_code, 
		@Param("mph_name") String mph_name, 
		@Param("account_number") String account_number, 
		@Param("sort_1") String sort_1,
		@Param("sort_2") String sort_2, 
		@Param("sort_3") String sort_3,
		@Param("sort_4") String sort_4, 
		@Param("sort_5") String sort_5,
		@Param("sort_6") String sort_6,
		@Param("page_no") Integer page_no);
	
	@Query(value = 
		"SELECT COUNT(*) " +
		"FROM PMST_MPH mph " +
		"LEFT JOIN PMST_MPH_BANK bank ON mph.mph_code = bank.mph_code " +
		"LEFT JOIN PMST_MPH_ADDRESS mphAdr ON mph.mph_code = mphAdr.mph_code " +
		"LEFT JOIN PMST_MPH_REPRESENTATIVES rep ON mph.mph_code = rep.mph_code " +
		"WHERE " +
		"(:mph_code IS NULL OR mph.mph_code = :mph_code) "