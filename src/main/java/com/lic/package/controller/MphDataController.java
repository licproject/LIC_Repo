package com.lic.package.controller; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 

import com.lic.package.service.MphDataService; 

@RestController 
public class MphDataController { 
   
    @Autowired 
    private MphDataService mphDataService; 
   
    @GetMapping("/migrateData") 
    public void migrateData(){ 
        mphDataService.insertMphMasterDataToMphTempMaster(); 
        mphDataService.insertMphBankDataToMphTempBank(); 
        mphDataService.insertMphRepresentativesDataToMphTempRepresentatives(); 
        mphDataService.insertMphAddressDataToMphTempAddress(); 
        mphDataService.executeSqlScriptForDataMigration(); 
    } 
}