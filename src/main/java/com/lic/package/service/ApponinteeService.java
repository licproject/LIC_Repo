package com.lic.package.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.repository.ApponinteeRepository;

@Service
public class ApponinteeService {
    
    @Autowired
    private ApponinteeRepository apponinteeRepository;

    public void createNewAppointee(Long APPOINTEE_ID, String APPOINTEE_AADHAR_NUMBER, String APPOINTEE_ACCOUNT_NUMBER, String APPOINTEE_ACCOUNT_TYPE, String APPOINTEE_CODE, String APPOINTEE_NAME, String APPOINTEE_BANK_NAME, String CONTACT_NUMBER, Long CREATED_BY, String DATE_OF_BIRTH, String APPOINTEE_IFSC_CODE, Boolean IS_ACTIVE, Long MEMBER_ID, String APPOINTEE_PAN, String RELATIONSHIP) {
        apponinteeRepository.createNewAppointee(APPOINTEE_ID, APPOINTEE_AADHAR_NUMBER, APPOINTEE_ACCOUNT_NUMBER, APPOINTEE_ACCOUNT_TYPE, APPOINTEE_CODE, APPOINTEE_NAME, APPOINTEE_BANK_NAME, CONTACT_NUMBER, CREATED_BY, DATE_OF_BIRTH, APPOINTEE_IFSC_CODE, IS_ACTIVE, MEMBER_ID, APPOINTEE_PAN, RELATIONSHIP);
    }

    public void updateAppointee(Long APPOINTEE_ID, String APPOINTEE_AADHAR_NUMBER, String APPOINTEE_ACCOUNT_NUMBER, String APPOINTEE_ACCOUNT_TYPE, String APPOINTEE_CODE, String APPOINTEE_NAME, String APPOINTEE_BANK_NAME, String CONTACT_NUMBER, Long MODIFIED_BY, String DATE_OF_BIRTH, String APPOINTEE_IFSC_CODE, Boolean IS_ACTIVE, Long MEMBER_ID, String APPOINTEE_PAN, String RELATIONSHIP) {
        apponinteeRepository.updateAppointee(APPOINTEE_ID, APPOINTEE_AADHAR_NUMBER, APPOINTEE_ACCOUNT_NUMBER, APPOINTEE_ACCOUNT_TYPE, APPOINTEE_CODE, APPOINTEE_NAME, APPOINTEE_BANK_NAME, CONTACT_NUMBER, MODIFIED_BY, DATE_OF_BIRTH, APPOINTEE_IFSC_CODE, IS_ACTIVE, MEMBER_ID, APPOINTEE_PAN, RELATIONSHIP);
    }
    
    public List<Apponintee> getAllAppointees() {
        return apponinteeRepository.findAll();
    }
}