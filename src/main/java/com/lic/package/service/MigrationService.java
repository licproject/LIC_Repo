tables.

package com.lic.package.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.package.repository.MigrationRepository;

@Service
@Transactional
public class MigrationService {

    @Autowired
    private MigrationRepository migrationRepository;

    // Method to transfer data from MPH_MASTER to MPH_TEMP_Master
    public void transferMasterData() {
        // Query to get all data from MPH_MASTER
        List<Object> masterData = migrationRepository.findAll();
        if (masterData.isEmpty()) {
            return;
        }
        // looping through the data to insert into MPH_TEMP_MASTER
        masterData.forEach(data -> {
            // creating an object with the data from MPH_MASTER
            Object tempMasterData = new Object();
            // setting the data in the object
            tempMasterData.setData(data.getData());
            // setting the timestamp
            tempMasterData.setCreatedOn(new Timestamp(System.currentTimeMillis()));
            tempMasterData.setModifiedOn(new Timestamp(System.currentTimeMillis()));
            // saving the data in MPH_TEMP_MASTER
            migrationRepository.save(tempMasterData);
        });
    }

    // Method to transfer data from MPH_BANK to MPH_TEMP_BANK
    public void transferBankData() {
        // Query to get all data from MPH_BANK
        List<Object> bankData = migrationRepository.findAll();
        if (bankData.isEmpty()) {
            return;
        }
        // looping through the data to insert into MPH_TEMP_BANK
        bankData.forEach(data -> {
            // creating an object with the data from MPH_BANK
            Object tempBankData = new Object();
            // setting the data in the object
            tempBankData.setData(data.getData());
            // setting the timestamp
            tempBankData.setCreatedOn(new Timestamp(System.currentTimeMillis()));
            tempBankData.setModifiedOn(new Timestamp(System.currentTimeMillis()));
            // saving the data in MPH_TEMP_BANK
            migrationRepository.save(tempBankData);
        });
    }

    // Method to transfer data from MPH_REPRESENTATIVES to MPH_TEMP_REPRESENTATIVES
    public void transferRepresentativesData() {
        // Query to get all data from MPH_REPRESENTATIVES
        List<Object> representativesData = migrationRepository.findAll();
        if (representativesData.isEmpty()) {
            return;
        }
        // looping through the data to insert into MPH_TEMP_REPRESENTATIVES
        representativesData.forEach(data -> {
            // creating an object with the data from MPH_REPRESENTATIVES
            Object tempRepresentativesData = new Object();
            // setting the data in the object
            tempRepresentativesData.setData(data.getData());
            // setting the timestamp
            tempRepresentativesData.setCreatedOn(new Timestamp(System.currentTimeMillis()));
            tempRepresentativesData.setModifiedOn(new Timestamp(System.currentTimeMillis()));
            // saving the data in MPH_TEMP_REPRESENTATIVES
            migrationRepository.save(tempRepresentativesData);
        });
    }

    // Method to transfer data from MPH_ADDRESS to MPH_TEMP_ADDRESS
    public void transferAddressData() {
        // Query to get all data from MPH_ADDRESS
        List<Object> addressData = migrationRepository.findAll();
        if (addressData.isEmpty()) {
            return;
        }
        // looping through the data to insert into MPH_TEMP_ADDRESS
        addressData.forEach(data -> {
            // creating an object with the data from MPH_ADDRESS
            Object tempAddressData = new Object();
            // setting the data in the object
            tempAddressData.setData(data.getData());
            // setting the timestamp
           