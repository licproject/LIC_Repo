package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lic.package.entity.PMST_MPH;
import com.lic.package.entity.Members;

@Repository
public interface PMST_MPHRepository extends JpaRepository<PMST_MPH, Long>{

	@Query("SELECT p FROM PMST_MPH p WHERE p.mph_code = :mphCode")
	public PMST_MPH findByMphCode(String mphCode);

	@Modifying
	@Transactional
	@Query("INSERT INTO Members (licId, policyId, memberStatus, fatherName, firstName, lastName, categoryNo, isActive, isZeroId) VALUES (:licId, :policyId, :memberStatus, :fatherName, :firstName, :lastName, :categoryNo, :isActive, :isZeroId)")
	public void insertIntoMembers(String licId, String policyId, String memberStatus, String fatherName, String firstName, String lastName, int categoryNo, boolean isActive, boolean isZeroId);
	
}