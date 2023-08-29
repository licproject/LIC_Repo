package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.package.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
 
    Policy findByPolicyNumber(String policyNumber);
 
    Policy findBySchemeType(String schemeType);
 
    Policy findByMphName(String mphName);
 
    Policy findByMphCode(String mphCode);
 
    Policy findByPolicyStatus(String policyStatus);

}