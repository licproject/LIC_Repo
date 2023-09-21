package com.lic.package.service;

import java.sql.Timestamp;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.repository.PolicySrvMbrRepository;
import com.lic.package.model.PolicySrvMbr;

@Service
public class PolicySrvMbrService {

    @Autowired
    PolicySrvMbrRepository policySrvMbrRepository;

    public Optional<PolicySrvMbr> findByMemberId(Long memberId) {
        return policySrvMbrRepository.findByMemberId(memberId);
    }

    public Optional<PolicySrvMbr> findByAadharNumber(Long aadharNumber) {
        return policySrvMbrRepository.findByAadharNumber(aadharNumber);
    }

    public Optional<PolicySrvMbr> findByCategoryNo(Long categoryNo) {
        return policySrvMbrRepository.findByCategoryNo(categoryNo);
    }

    public Optional<PolicySrvMbr> findByCommunicationPreference(String communicationPreference) {
        return policySrvMbrRepository.findByCommunicationPreference(communicationPreference);
    }

    public Optional<PolicySrvMbr> findByCreatedBy(String createdBy) {
        return policySrvMbrRepository.findByCreatedBy(createdBy);
    }

    public Optional<PolicySrvMbr> findByCreatedOn(Timestamp createdOn) {
        return policySrvMbrRepository.findByCreatedOn(createdOn);
    }

    public Optional<PolicySrvMbr> findByDateOfBirth(Timestamp dateOfBirth) {
        return policySrvMbrRepository.findByDateOfBirth(dateOfBirth);
    }

    public Optional<PolicySrvMbr> findByDateOfJoining(Timestamp dateOfJoining) {
        return policySrvMbrRepository.findByDateOfJoining(dateOfJoining);
    }

    public Optional<PolicySrvMbr> findByDateOfJoiningScheme(Timestamp dateOfJoiningScheme) {
        return policySrvMbrRepository.findByDateOfJoiningScheme(dateOfJoiningScheme);
    }

    public Optional<PolicySrvMbr> findByDateOfRetirement(Timestamp dateOfRetirement) {
        return policySrvMbrRepository.findByDateOfRetirement(dateOfRetirement);
    }

    public Optional<PolicySrvMbr> findByDesignation(String designation) {
        return policySrvMbrRepository.findByDesignation(designation);
    }

    public Optional<PolicySrvMbr> findByEmailId(String emailId) {
        return policySrvMbrRepository.findByEmailId(emailId);
    }

    public Optional<PolicySrvMbr> findByFatherName(String fatherName) {
        return policySrvMbrRepository.findByFatherName(fatherName);
    }

    public Optional<PolicySrvMbr> findByFirstName(String firstName) {
        return policySrvMbrRepository.findByFirstName(firstName);
    }

    public Optional<PolicySrvMbr> findByGender(String gender) {
        return policySrvMbrRepository.findByGender(gender);
    }

    public Optional<PolicySrvMbr> findByIsActive(Long isActive) {
        return policySrvMbrRepository.findByIsActive(isActive);
    }

    public Optional<PolicySrvMbr> findByIsZeroId(Long isZeroId) {
        return policySrvMbrRepository.findByIsZeroId(isZeroId);
    }

    public Optional<PolicySrvMbr> findByLandlineNo(Long landlineNo) {
        return policySrvMbrRepository.findByLandlineNo(landlineNo);
    }

    public Optional<PolicySrvMbr> findByLanguage