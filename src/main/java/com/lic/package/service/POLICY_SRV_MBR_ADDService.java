package com.lic.package.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lic.package.model.POLICY_SRV_MBR_ADD;
import com.lic.package.repository.POLICY_SRV_MBR_ADDRepository;

@Service
public class POLICY_SRV_MBR_ADDService {
    private final POLICY_SRV_MBR_ADDRepository policySrvMbrAddRepository;
    
    public POLICY_SRV_MBR_ADDService(POLICY_SRV_MBR_ADDRepository policySrvMbrAddRepository) {
        this.policySrvMbrAddRepository = policySrvMbrAddRepository;
    }
    
    public POLICY_SRV_MBR_ADD findByMEMBER_ADDITION_ID(Long memberAdditionId) {
        return policySrvMbrAddRepository.findByMEMBER_ADDITION_ID(memberAdditionId);
    }

    public List<POLICY_SRV_MBR_ADD> findByCREATED_BY(String createdBy) {
        return policySrvMbrAddRepository.findByCREATED_BY(createdBy);
    }

    public List<POLICY_SRV_MBR_ADD> findByCREATED_ON(Timestamp createdOn) {
        return policySrvMbrAddRepository.findByCREATED_ON(createdOn);
    }

    public List<POLICY_SRV_MBR_ADD> findByEMPLOYEE_CONTRIBUTION(Double employeeContribution) {
        return policySrvMbrAddRepository.findByEMPLOYEE_CONTRIBUTION(employeeContribution);
    }

    public List<POLICY_SRV_MBR_ADD> findByEMPLOYER_CONTRIBUTION(Double employerContribution) {
        return policySrvMbrAddRepository.findByEMPLOYER_CONTRIBUTION(employerContribution);
    }

    public List<POLICY_SRV_MBR_ADD> findByIS_ACTIVE(Boolean isActive) {
        return policySrvMbrAddRepository.findByIS_ACTIVE(isActive);
    }

    public List<POLICY_SRV_MBR_ADD> findByLINE_OF_BUSINESS(String lineOfBusiness) {
        return policySrvMbrAddRepository.findByLINE_OF_BUSINESS(lineOfBusiness);
    }

    public List<POLICY_SRV_MBR_ADD> findByMEMBER_ADDITION_STATUS(String memberAdditionStatus) {
        return policySrvMbrAddRepository.findByMEMBER_ADDITION_STATUS(memberAdditionStatus);
    }

    public List<POLICY_SRV_MBR_ADD> findByMODIFIED_BY(String modifiedBy) {
        return policySrvMbrAddRepository.findByMODIFIED_BY(modifiedBy);
    }

    public List<POLICY_SRV_MBR_ADD> findByMODIFIED_ON(Timestamp modifiedOn) {
        return policySrvMbrAddRepository.findByMODIFIED_ON(modifiedOn);
    }

    public List<POLICY_SRV_MBR_ADD> findByMPH_CODE(String mphCode) {
        return policySrvMbrAddRepository.findByMPH_CODE(mphCode);
    }

    public List<POLICY_SRV_MBR_ADD> findByMPH_NAME(String mphName) {
        return policySrvMbrAddRepository.findByMPH_NAME(mphName);
    }

    public List<POLICY_SRV_MBR_ADD> findByPOLICY_ID(Long policyId) {
        return policySrvMbrAddRepository.findByPOLICY_ID(policyId);
    }

    public List<POLICY_SRV_MBR_ADD> findByPOLICY_MBR_NO(Long policyMbrNo) {
       