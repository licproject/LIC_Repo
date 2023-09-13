import org.springframework.data.jpa.repository.JpaRepository;

public interface POLICY_SRV_MBR_ADDRepository extends JpaRepository<POLICY_SRV_MBR_ADD, Long> {
    POLICY_SRV_MBR_ADD findByMEMBER_ADDITION_ID(Long memberAdditionId);
    List<POLICY_SRV_MBR_ADD> findByCREATED_BY(String createdBy);
    List<POLICY_SRV_MBR_ADD> findByCREATED_ON(Timestamp createdOn);
    List<POLICY_SRV_MBR_ADD> findByEMPLOYEE_CONTRIBUTION(Double employeeContribution);
    List<POLICY_SRV_MBR_ADD> findByEMPLOYER_CONTRIBUTION(Double employerContribution);
    List<POLICY_SRV_MBR_ADD> findByIS_ACTIVE(Boolean isActive);
    List<POLICY_SRV_MBR_ADD> findByLINE_OF_BUSINESS(String lineOfBusiness);
    List<POLICY_SRV_MBR_ADD> findByMEMBER_ADDITION_STATUS(String memberAdditionStatus);
    List<POLICY_SRV_MBR_ADD> findByMODIFIED_BY(String modifiedBy);
    List<POLICY_SRV_MBR_ADD> findByMODIFIED_ON(Timestamp modifiedOn);
    List<POLICY_SRV_MBR_ADD> findByMPH_CODE(String mphCode);
    List<POLICY_SRV_MBR_ADD> findByMPH_NAME(String mphName);
    List<POLICY_SRV_MBR_ADD> findByPOLICY_ID(Long policyId);
    List<POLICY_SRV_MBR_ADD> findByPOLICY_MBR_NO(Long policyMbrNo);
    List<POLICY_SRV_MBR_ADD> findByPOLICY_NUMBER(String policyNumber);
    List<POLICY_SRV_MBR_ADD> findByPOLICY_STATUS(String policyStatus);
    List<POLICY_SRV_MBR_ADD> findByPRODUCT(String product);
    List<POLICY_SRV_MBR_ADD> findByREJECTION_REASON_CODE(String rejectionReasonCode);
    List<POLICY_SRV_MBR_ADD> findByREJECTION_REMARKS(String rejectionRemarks);
    List<POLICY_SRV_MBR_ADD> findBySERVICE_ID(Long serviceId);
    List<POLICY_SRV_MBR_ADD> findBySERVICE_NUMBER(String serviceNumber);
    List<POLICY_SRV_MBR_ADD> findBySERVICE_STATUS(String serviceStatus);
    List<POLICY_SRV_MBR_ADD> findByTOTAL_CONTRIBUTION(Double totalContribution);
    List<POLICY_SRV_MBR_ADD> findByUNIT_CODE(String unitCode);
    List<POLICY_SRV_MBR_ADD> findByVOLUNTARY_CONTRIBUTION(Double voluntaryContribution);
    List<POLICY_SRV_MBR_ADD> findByNO_OF_CATEGORY(Integer noOfCategory);

    void updateMemberDetails(Long memberAdditionId, String createdBy, Timestamp createdOn, Double employeeContribution,
            Double employerContribution, Boolean isActive, String lineOfBusiness,
            String memberAdditionStatus, String modifiedBy, Timestamp modifiedOn,
            String mphCode, String mphName, Long policyId, Long policyMbrNo,
            String policyNumber, String policyStatus, String product,
            String rejectionReasonCode, String rejectionRemarks, Long serviceId,
            String serviceNumber, String serviceStatus, Double totalContribution,
            String unitCode, Double voluntaryContribution, Integer noOfCategory);
}