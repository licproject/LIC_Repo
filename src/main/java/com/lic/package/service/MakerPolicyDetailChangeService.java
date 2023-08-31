package com.lic.package.service;

import com.lic.package.dao.MakerPolicyDetailChangeRepository;
import com.lic.package.model.Policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MakerPolicyDetailChangeService {

    @Autowired
    private MakerPolicyDetailChangeRepository makerPolicyDetailChangeRepository;

    public List<Policy> findBySearchCriteria(String searchCriteria) {
        return makerPolicyDetailChangeRepository.findBySearchCriteria(searchCriteria);
    }

    public Policy findByPolicyNumber(int policyNumber) {
        return makerPolicyDetailChangeRepository.findByPolicyNumber(policyNumber);
    }

    public void updateBasicDetailsByPolicyNumber(int policyNumber, String basicDetails) {
        makerPolicyDetailChangeRepository.updateBasicDetailsByPolicyNumber(policyNumber, basicDetails);
    }

    public void updateBankDetailsByPolicyNumber(int policyNumber, String bankDetails) {
        makerPolicyDetailChangeRepository.updateBankDetailsByPolicyNumber(policyNumber, bankDetails);
    }

    public void updateAddressDetailsByPolicyNumber(int policyNumber, String addressDetails) {
        makerPolicyDetailChangeRepository.updateAddressDetailsByPolicyNumber(policyNumber, addressDetails);
    }

    public void updateContactPersonDetailsByPolicyNumber(int policyNumber, String contactPersonDetails) {
        makerPolicyDetailChangeRepository.updateContactPersonDetailsByPolicyNumber(policyNumber, contactPersonDetails);
    }

    public List<Policy> findInProgressRecords() {
        return makerPolicyDetailChangeRepository.findInProgressRecords();
    }

    public void sendRecordToChecker(int policyNumber) {
        makerPolicyDetailChangeRepository.grantAccessToRecordForChecker(policyNumber);
    }

}