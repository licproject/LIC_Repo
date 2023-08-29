package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.package.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {
	
	List<Policy> findByPolicyNumber(String policyNumber);
	
	List<Policy> findBySchemeType(String schemeType);
	
	List<Policy> findByMphName(String mphName);
	
	List<Policy> findByMphCode(String mphCode);
	
	List<Policy> findByPolicyStatus(String policyStatus);
	
	List<Policy> findByAll(String policyNumber, String schemeType, String mphName, String mphCode, String policyStatus);

}