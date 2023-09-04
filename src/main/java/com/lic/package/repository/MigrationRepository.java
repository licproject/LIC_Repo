tables.

package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MigrationRepository extends JpaRepository<Object, Long> {

    // Method to transfer data from MPH_MASTER to MPH_TEMP_Master
    void transferMasterData();

    // Method to transfer data from MPH_BANK to MPH_TEMP_BANK
    void transferBankData();

    // Method to transfer data from MPH_REPRESENTATIVES to MPH_TEMP_REPRESENTATIVES
    void transferRepresentativesData();

    // Method to transfer data from MPH_ADDRESS to MPH_TEMP_ADDRESS
    void transferAddressData();

    // Method to verify data integrity after migration
    void verifyDataIntegrity();

}