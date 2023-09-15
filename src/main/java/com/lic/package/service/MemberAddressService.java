o   MODIFIED_BY and MODIFIED_ON fields must reflect the latest changes.BER = :SERVICE_NUMBER, SERVICE_STATUS = :SERVICE_STATUS, TOTAL_CONTRIBUTION = :TOTAL_CONTRIBUTION, UNIT_CODE = :UNIT_CODE, VOLUNTARY_CONTRIBUTION = :VOLUNTARY_CONTRIBUTION, NO_OF_CATEGORY = :NO_OF_CATEGORY WHERE MEMBER_ADDITION_ID = :MEMBER_ADDITION_ID", nativeQuery = true)
    void updateMemberAddress(@Param("MEMBER_ADDITION_ID") Long MEMBER_ADDITION_ID,@Param("CREATED_BY") String CREATED_BY,@Param("EMPLOYEE_CONTRIBUTION") String EMPLOYEE_CONTRIBUTION,@Param("EMPLOYER_CONTRIBUTION") String EMPLOYER_CONTRIBUTION,@Param("IS_ACTIVE") String IS_ACTIVE,@Param("LINE_OF_BUSINESS") String LINE_OF_BUSINESS,@Param("MEMBER_ADDITION_STATUS") String MEMBER_ADDITION_STATUS,@Param("MODIFIED_BY") String MODIFIED_BY,@Param("MPH_CODE") String MPH_CODE,@Param("MPH_NAME") String MPH_NAME,@Param("POLICY_ID") Long POLICY_ID,@Param("POLICY_MBR_NO") String POLICY_MBR_NO,@Param("POLICY_NUMBER") String POLICY_NUMBER,@Param("POLICY_STATUS") String POLICY_STATUS,@Param("PRODUCT") String PRODUCT,@Param("REJECTION_REASON_CODE") String REJECTION_REASON_CODE,@Param("REJECTION_REMARKS") String REJECTION_REMARKS,@Param("SERVICE_ID") Long SERVICE_ID,@Param("SERVICE_NUMBER") String SERVICE_NUMBER,@Param("SERVICE_STATUS") String SERVICE_STATUS,@Param("TOTAL_CONTRIBUTION") String TOTAL_CONTRIBUTION,@Param("UNIT_CODE") String UNIT_CODE,@Param("VOLUNTARY_CONTRIBUTION") String VOLUNTARY_CONTRIBUTION,@Param("NO_OF_CATEGORY") String NO_OF_CATEGORY);
}

package com.lic.package.service;

import com.lic.package.model.POLICY_SRV_MBR_ADD;
import com.lic.package.repository.MemberAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberAddressService {
    @Autowired
    private MemberAddressRepository memberAddressRepository;

    public List<POLICY_SRV_MBR_ADD> findByMEMBER_ADDITION_ID(Long MEMBER_ADDITION_ID) {
        return memberAddressRepository.findByMEMBER_ADDITION_ID(MEMBER_ADDITION_ID);
    }

    public List<POLICY_SRV_MBR_ADD> findByCREATED_BY(String CREATED_BY) {
        return memberAddressRepository.findByCREATED_BY(CREATED_BY);
    }

    public List<POLICY_SRV_MBR_ADD> findByIS_ACTIVE(String IS_ACTIVE) {
        return memberAddressRepository.findByIS_ACTIVE(IS_ACTIVE);
    }

    public List<POLICY_SRV_MBR_ADD> findByLINE_OF_BUSINESS(String LINE_OF_BUSINESS) {
        return memberAddressRepository.findByLINE_OF_BUSINESS(LINE_OF_BUSINESS);
    }

    public List<POLICY_SRV_MBR_ADD> findByMEMBER_ADDITION_STATUS(String MEMBER_ADDITION_STATUS) {
        return memberAddressRepository.findByMEMBER_ADDITION_STATUS(MEMBER_ADDITION_STATUS);
    }

    public List<POLICY_SRV_