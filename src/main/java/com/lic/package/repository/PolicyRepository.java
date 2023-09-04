package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<PMST_MPH, Integer> {

    // Retrieves policy details based on a given MPH code
    PMST_MPH findByMphCode(String mphCode);

    // Inserts policy details into the Members table
    void insertIntoMembers(String licId, String policyId, String memberStatus, String fatherName, String firstName, String lastName, String categoryNo, boolean isActive, boolean isZeroId);

}