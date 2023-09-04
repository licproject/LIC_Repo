package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository; 

public interface MphDataRepository extends JpaRepository<MphData, Long> { 
   
    // Fetch policy details from the MPH_MASTER table and insert them into the MPH_TEMP_Master table
    public void insertMphMasterDataToMphTempMaster(); 
    
    // Fetch bank-related data from the MPH_BANK table and insert it into the MPH_TEMP_BANK table
    public void insertMphBankDataToMphTempBank(); 
    
    // Fetch representative information from the MPH_REPRESENTATIVES table and insert it into the MPH_TEMP_REPRESENTATIVES table
    public void insertMphRepresentativesDataToMphTempRepresentatives(); 
    
    // Retrieve address data from the MPH_ADDRESS table and insert it into the MPH_TEMP_ADDRESS table
    public void insertMphAddressDataToMphTempAddress(); 
    
    // Execute SQL script to perform the data migration
    public void executeSqlScriptForDataMigration(); 
}