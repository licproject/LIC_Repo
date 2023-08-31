package com.lic.package.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.package.model.PMST_MPH;

@Repository
public interface PolicyRepository extends JpaRepository<PMST_MPH, Long> {
 
    @Query("SELECT mph, bank, add, rep FROM PMST_MPH mph INNER JOIN PMST_MPH_BANK bank on mph.mph_id = bank.mph_id INNER JOIN PMST_MPH_ADDRESS add on mph.mph_id = add.mph_id INNER JOIN PMST_MPH_REPRESENTATIVES rep on mph.mph_id = rep.mph_id WHERE mph.mph_id = :mph_id")
    List<Object[]> findPolicyDetailsByMphId(@Param("mph_id") Long mph_id); 
 
    @Query("SELECT mph, bank, add, rep FROM PMST_MPH mph INNER JOIN PMST_MPH_BANK bank on mph.mph_id = bank.mph_id INNER JOIN PMST_MPH_ADDRESS add on mph.mph_id = add.mph_id INNER JOIN PMST_MPH_REPRESENTATIVES rep on mph.mph_id = rep.mph_id WHERE mph.mph_id in :mph_ids")
    List<Object[]> findPolicyDetailsByMphIds(@Param("mph_ids") List<Long> mph_ids);
 
    @Query("SELECT mph, bank, add, rep FROM PMST_MPH mph INNER JOIN PMST_MPH_BANK bank on mph.mph_id = bank.mph_id INNER JOIN PMST_MPH_ADDRESS add on mph.mph_id = add.mph_id INNER JOIN PMST_MPH_REPRESENTATIVES rep on mph.mph_id = rep.mph_id WHERE mph.policy_number = :policy_number")
    List<Object[]> findPolicyDetailsByPolicyNumber(@Param("policy_number") String policy_number);
 
    @Query("SELECT mph, bank, add, rep FROM PMST_MPH mph INNER JOIN PMST_MPH_BANK bank on mph.mph_id = bank.mph_id INNER JOIN PMST_MPH_ADDRESS add on mph.mph_id = add.mph_id INNER JOIN PMST_MPH_REPRESENTATIVES rep on mph.mph_id = rep.mph_id WHERE mph.start_date >= :start_date AND mph.end_date <= :end_date")
    List<Object[]> findPolicyDetailsByDateRange(@Param("start_date") Date start_date, @Param("end_date") Date end_date);
 
}

@Service
@Transactional
public class PolicyService {

    private final PolicyRepository policyRepository;

    public PolicyService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    public List<Object[]> getPolicyDetailsByMphId(Long mph_id) {
        return policyRepository.findPolicyDetailsByMphId(mph_id);
    }

    public List<Object[]> getPolicyDetailsByMphIds(List<Long> mph_ids) {
        return policyRepository.findPolicyDetailsByMphIds(mph_ids);
    }

    public List<Object[]> getPolicyDetailsByPolicyNumber(String policy_number) {
        return policyRepository.findPolicyDetailsByPolicyNumber(policy_number);
    }

    public List<Object[]> getPolicyDetailsByDateRange(Date start_date, Date end_date) {
        return policyRepository.findPolicyDetailsByDateRange(start_date, end_date);
    }
}