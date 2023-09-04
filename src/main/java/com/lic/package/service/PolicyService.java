package com.lic.package.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.repository.PolicyRepository;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Policy findByMphCode(String mphCode) {
        return policyRepository.findByMphCode(mphCode);
    }

    public void saveAndInsertIntoMembers(String licId, String policyId, String fatherName, String firstName, String lastName, int categoryNo, int isActive, int isZeroId) {
        String queryString = "INSERT INTO Members (licId, policyId, memberStatus, fatherName, firstName, lastName, categoryNo, isActive, isZeroId) VALUES (?1, ?2, 'Active', ?3, ?4, ?5, ?6, ?7, ?8)";
        Query query = entityManager.createNativeQuery(queryString);
        query.setParameter(1, licId);
        query.setParameter(2, policyId);
        query.setParameter(3, fatherName);
        query.setParameter(4, firstName);
        query.setParameter(5, lastName);
        query.setParameter(6, categoryNo);
        query.setParameter(7, isActive);
        query.setParameter(8, isZeroId);
        query.executeUpdate();
    }

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Optional<Policy> getPolicyById(String policyId) {
        return policyRepository.findById(policyId);
    }

    public void deletePolicyById(String policyId) {
        policyRepository.deleteById(policyId);
    }

    public Policy createPolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    public Policy updatePolicy(Policy policy) {
        return policyRepository.save(policy);
    }
}