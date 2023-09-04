package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface DataMigrationRepository extends JpaRepository<Object, Long> {

//Scenario 1: Creating Temporary Tables
@Transactional
@Modifying
@Query(value = "CREATE TABLE MPH_TEMP_Master LIKE MPH_MASTER;
               CREATE TABLE MPH_TEMP_BANK LIKE MPH_MASTER;
               CREATE TABLE MPH_TEMP_REPRESENTATIVES LIKE MPH_MASTER;
               CREATE TABLE MPH_TEMP_ADDRESS LIKE MPH_MASTER;", nativeQuery = true)
void createTemporaryTables();

//Scenario 2: Fetching and Inserting Policy Details
@Transactional
@Modifying
@Query(value = "INSERT INTO MPH_TEMP_Master (SELECT * FROM MPH_MASTER WHERE <conditions>)
                ON DUPLICATE KEY UPDATE MPH_ID = MPH_ID;
                INSERT INTO MPH_TEMP_BANK (SELECT * FROM MPH_MASTER WHERE <conditions>)
                ON DUPLICATE KEY UPDATE MPH_ID = MPH_ID;
                INSERT INTO MPH_TEMP_REPRESENTATIVES (SELECT * FROM MPH_MASTER WHERE <conditions>)
                ON DUPLICATE KEY UPDATE MPH_ID = MPH_ID;
                INSERT INTO MPH_TEMP_ADDRESS (SELECT * FROM MPH_MASTER WHERE <conditions>)
                ON DUPLICATE KEY UPDATE MPH_ID = MPH_ID;", nativeQuery = true)
void fetchAndInsertPolicyDetails();

}