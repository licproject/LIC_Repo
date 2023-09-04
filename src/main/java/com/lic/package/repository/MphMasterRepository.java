package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.package.model.MphMaster;

@Repository
public interface MphMasterRepository extends JpaRepository<MphMaster, Long> {
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.mphId = ?1")
    MphMaster findByMphId(Long mphId);
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.alternatePAN = ?1")
    MphMaster findByAlternatePAN(String alternatePAN);
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.cin = ?1")
    MphMaster findByCin(String cin);
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.countryCode = ?1")
    MphMaster findByCountryCode(String countryCode);
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.mphId NOT IN (SELECT mphTemp.mphId FROM MphTempMaster mphTemp)")
    MphMaster findMphIdNotInTempMaster();
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.mphId NOT IN (SELECT mphTemp.mphId FROM MphTempBank mphTemp)")
    MphMaster findMphIdNotInTempBank();
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.mphId NOT IN (SELECT mphTemp.mphId FROM MphTempRepresentatives mphTemp)")
    MphMaster findMphIdNotInTempRepresentatives();
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.mphId NOT IN (SELECT mphTemp.mphId FROM MphTempAddress mphTemp)")
    MphMaster findMphIdNotInTempAddress();
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.mphId IN (SELECT mphTemp.mphId FROM MphTempMaster mphTemp)")
    MphMaster findMphIdInTempMaster();
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.mphId IN (SELECT mphTemp.mphId FROM MphTempBank mphTemp)")
    MphMaster findMphIdInTempBank();
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.mphId IN (SELECT mphTemp.mphId FROM MphTempRepresentatives mphTemp)")
    MphMaster findMphIdInTempRepresentatives();
 
    @Query("SELECT mph FROM MphMaster mph WHERE mph.mphId IN (SELECT mphTemp.mphId FROM MphTempAddress mphTemp)")
    MphMaster findMphIdInTempAddress();
}