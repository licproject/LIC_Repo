package com.lic.package.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lic.package.model.PolicyDetails;
import com.lic.package.model.TrusteeMPHDetails;
import com.lic.package.repository.CheckerPolicyDetailChangeRepository;

@Service
public class CheckerPolicyDetailChangeService {

    private CheckerPolicyDetailChangeRepository checkerPolicyDetailChangeRepository;

    public CheckerPolicyDetailChangeService(CheckerPolicyDetailChangeRepository checkerPolicyDetailChangeRepository) {
        this.checkerPolicyDetailChangeRepository = checkerPolicyDetailChangeRepository;
    }

    // API to fetch policy details based on the criteria
    public List<PolicyDetails> fetchPolicyDetails(String policyNumber) {
        return checkerPolicyDetailChangeRepository.fetchPolicyDetails(policyNumber);
    }

    // API to fetch Trustee/MPH Details from the TEMP Table
    public List<TrusteeMPHDetails> fetchTrusteeMPHDetails() {
        return checkerPolicyDetailChangeRepository.fetchTrusteeMPHDetails();
    }

    // API to move data from the TEMP Table to the Master Table
    public void moveTemptoMasterTable() {
        checkerPolicyDetailChangeRepository.moveTemptoMasterTable();
    }

    // API to discard data from the TEMP Table
    public void discardFromTempTable() {
        checkerPolicyDetailChangeRepository.discardFromTempTable();
    }

    // API to retain data in the TEMP Table
    public void retainInTempTable() {
        checkerPolicyDetailChangeRepository.retainInTempTable();
    }

    // API to display a success message for the transaction
    public void showSuccessMessage() {
        checkerPolicyDetailChangeRepository.showSuccessMessage();
    }

}