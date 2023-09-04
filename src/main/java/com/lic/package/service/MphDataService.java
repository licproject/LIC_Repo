package com.lic.package.service; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

import com.lic.package.repository.MphDataRepository; 

@Service 
public class MphDataService { 
   
    @Autowired 
    private MphDataRepository mphDataRepository; 
   
    // Service method to call repository methods to fetch policy details from the MPH_MASTER table and insert them into the MPH_TEMP_Master table
    public void insertMphMasterDataToMphTempMaster(){ 
        mphDataRepository.insertMphMasterDataToMphTempMaster(); 
    } 
    
    // Service method to call repository methods to fetch bank-related data from the MPH_BANK table and insert it into the MPH_TEMP_BANK table
    public void insertMphBankDataToMphTempBank(){ 
        mphDataRepository.insertMphBankDataToMphTempBank(); 
    } 
    
    // Service method to call repository methods to fetch representative information from the MPH_REPRESENTATIVES table and insert it into the MPH_TEMP_REPRESENTATIVES table
    public void insertMphRepresentativesDataToMphTempRepresentatives(){ 
        mphDataRepository.insertMphRepresentativesDataToMphTempRepresentatives(); 
    } 
    
    // Service method to call repository methods to retrieve address data from the MPH_ADDRESS table and insert it into the MPH_TEMP_ADDRESS table
    public void insertMphAddressDataToMphTempAddress(){ 
        mphDataRepository.insertMphAddressDataToMphTempAddress(); 
    } 
    
    // Service method to call repository methods to execute SQL script to perform the data migration
    public void executeSqlScriptForDataMigration(){ 
        mphDataRepository.executeSqlScriptForDataMigration(); 
    } 
}