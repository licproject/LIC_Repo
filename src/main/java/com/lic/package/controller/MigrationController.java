tables.

tempAddressData.setCreatedOn(new Timestamp(System.currentTimeMillis()));
            tempAddressData.setModifiedOn(new Timestamp(System.currentTimeMillis()));
            // saving the data in MPH_TEMP_ADDRESS
            migrationRepository.save(tempAddressData);
        });
    }

}

package com.lic.package.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.repository.MigrationRepository;
import com.lic.package.service.MigrationService;

@RestController
public class MigrationController {

    @Autowired
    private MigrationService migrationService;

    @Autowired
    private MigrationRepository migrationRepository;

    // Method to transfer data from MPH_MASTER to MPH_TEMP_Master
    @GetMapping("/migrate/master")
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
    @GetMapping("/migrate/bank")
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
    @GetMapping("/migrate/representatives")
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

    // Method to transfer data from MPH_ADDRESS to MPH