return policySrvMbrAddRepository.findByPOLICY_MBR_NO(policyMbrNo);
    }

    public List<POLICY_SRV_MBR_ADD> findByPOLICY_NUMBER(String policyNumber) {
        return policySrvMbrAddRepository.findByPOLICY_NUMBER(policyNumber);
    }

    public List<POLICY_SRV_MBR_ADD> findByPOLICY_STATUS(String policyStatus) {
        return policySrvMbrAddRepository.findByPOLICY_STATUS(policyStatus);
    }

    public List<POLICY_SRV_MBR_ADD> findByPRODUCT(String product) {
        return policySrvMbrAddRepository.findByPRODUCT(product);
    }

    public List<POLICY_SRV_MBR_ADD> findByREJECTION_REASON_CODE(String rejectionReasonCode) {
        return policySrvMbrAddRepository.findByREJECTION_REASON_CODE(rejectionReasonCode);
    }

    public List<POLICY_SRV_MBR_ADD> findByREJECTION_REMARKS(String rejectionRemarks) {
        return policySrvMbrAddRepository.findByREJECTION_REMARKS(rejectionRemarks);
    }

    public List<POLICY_SRV_MBR_ADD> findBySERVICE_ID(Long serviceId) {
        return policySrvMbrAddRepository.findBySERVICE_ID(serviceId);
    }

    public List<POLICY_SRV_MBR_ADD> findBySERVICE_NUMBER(String serviceNumber) {
        return policySrvMbrAddRepository.findBySERVICE_NUMBER(serviceNumber);
    }

    public List<POLICY_SRV_MBR_ADD> findBySERVICE_STATUS(String serviceStatus) {
        return policySrvMbrAddRepository.findBySERVICE_STATUS(serviceStatus);
    }

    public List<POLICY_SRV_MBR_ADD> findByTOTAL_CONTRIBUTION(Double totalContribution) {
        return policySrvMbrAddRepository.findByTOTAL_CONTRIBUTION(totalContribution);
    }

    public List<POLICY_SRV_MBR_ADD> findByUNIT_CODE(String unitCode) {
        return policySrvMbrAddRepository.findByUNIT_CODE(unitCode);
    }

    public List<POLICY_SRV_MBR_ADD> findByVOLUNTARY_CONTRIBUTION(Double voluntaryContribution) {
        return policySrvMbrAddRepository.findByVOLUNTARY_CONTRIBUTION(voluntaryContribution);
    }

    public List<POLICY_SRV_MBR_ADD> findByNO_OF_CATEGORY(Integer noOfCategory) {
        return policySrvMbrAddRepository.findByNO_OF_CATEGORY(noOfCategory);
    }

    public POLICY_SRV_MBR_ADD save(POLICY_SRV_MBR_ADD policySrvMbrAdd) {
        return policySrvMbrAddRepository.save(policySrvMbrAdd);
    }
}

package com.lic.package.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.POLICY_SRV_MBR_ADD;
import com.lic.package.service.POLICY_SRV_MBR_ADDService;

@RestController
public class POLICY_SRV_MBR_ADDController {

   