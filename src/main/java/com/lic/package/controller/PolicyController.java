package com.lic.package.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lic.package.model.Policy;
import com.lic.package.repository.PolicyRepository;
import com.lic.package.service.PolicyService;

@Controller
@RequestMapping("/policy")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @Autowired
    private PolicyRepository policyRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/search/{mphCode}")
    public ResponseEntity<Policy> searchByMphCode(@PathVariable String mphCode) {
        Policy policy = policyService.findByMphCode(mphCode);
        if (policy != null) {
            return new ResponseEntity<>(policy, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/insert/")
    public ResponseEntity<Policy> insertIntoMembers(@RequestBody Policy policy) {
        String queryString = "INSERT INTO Members (licId, policyId, memberStatus, fatherName, firstName, lastName, categoryNo, isActive, isZeroId) VALUES (?1, ?2, 'Active', ?3, ?4, ?5, ?6, ?7, ?8)";
        Query query = entityManager.createNativeQuery(queryString);
        query.setParameter(1, policy.getLicId());
        query.setParameter(2, policy.getPolicyId());
        query.setParameter(3, policy.getFatherName());
        query.setParameter(4, policy.getFirstName());
        query.setParameter(5, policy.getLastName());
        query.setParameter(6, policy.getCategoryNo());
        query.setParameter(7, policy.getIsActive());
        query.setParameter(8, policy.getIsZeroId());

        try {
            query.executeUpdate();
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Policy>> getAllPolicies() {
        List<Policy> policies = policyService.getAllPolicies();
        if (policies != null) {
            return new ResponseEntity<>(policies, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{policyId}")
    public ResponseEntity<Policy> getPolicyById(@PathVariable String policyId) {
        Optional<Policy> policy = policyService.getPolicyById(policyId);
        if (policy.isPresent()) {
            return new ResponseEntity<>(policy.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/create")
    public ResponseEntity<Policy> createPolicy(@RequestBody Policy policy) {
        Policy createdPolicy = policyService.createPolicy(policy);
        if (createdPolicy != null) {
            return new ResponseEntity<>(createdPolicy, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/update")
    public ResponseEntity<Policy> updatePolicy