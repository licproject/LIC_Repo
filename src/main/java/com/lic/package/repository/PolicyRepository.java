package com.lic.package.repository;

import com.lic.package.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {

    @Query("SELECT p FROM Policy p WHERE p.policyNumber = :policyNumber")
    List<Policy> findByPolicyNumber(String policyNumber);

    List<Policy> findBySchemeType(String schemeType);

    List<Policy> findByMphName(String mphName);

    List<Policy> findByMphCode(String mphCode);

    List<Policy> findByPolicyStatus(String policyStatus);

}