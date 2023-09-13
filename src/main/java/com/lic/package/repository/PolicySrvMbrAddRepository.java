Package name: com.lic.package.repository

import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicySrvMbrAddRepository extends JpaRepository<POLICY_SRV_MBR_ADD, Long> {

    List<POLICY_SRV_MBR_ADD> findByMemberAdditionId(Long memberAdditionId);

    List<POLICY_SRV_MBR_ADD> findByCreatedBy(String createdBy);

    List<POLICY_SRV_MBR_ADD> findByCreatedOn(Timestamp createdOn);

    List<POLICY_SRV_MBR_ADD> findByEmployeeContribution(Integer employeeContribution);

    List<POLICY_SRV_MBR_ADD> findByEmployerContribution(Integer employerContribution);

    List<POLICY_SRV_MBR_ADD> findByIsActive(String isActive);

    List<POLICY_SRV_MBR_ADD> findByLineOfBusiness(String lineOfBusiness);

    List<POLICY_SRV_MBR_ADD> findByMemberAdditionStatus(String memberAdditionStatus);

    List<POLICY_SRV_MBR_ADD> findByModifiedBy(String modifiedBy);

    List<POLICY_SRV_MBR_ADD> findByModifiedOn(Timestamp modifiedOn);

    List<POLICY_SRV_MBR_ADD> findByMphCode(String mphCode);

    List<POLICY_SRV_MBR_ADD> findByMphName(String mphName);

    List<POLICY_SRV_MBR_ADD> findByPolicyId(Long policyId);

    List<POLICY_SRV_MBR_ADD> findByPolicyMbrNo(String policyMbrNo);

    List<POLICY_SRV_MBR_ADD> findByPolicyNumber(String policyNumber);

    List<POLICY_SRV_MBR_ADD> findByPolicyStatus(String policyStatus);

    List<POLICY_SRV_MBR_ADD> findByProduct(String product);

    List<POLICY_SRV_MBR_ADD> findByRejectionReasonCode(String rejectionReasonCode);

    List<POLICY_SRV_MBR_ADD> findByRejectionRemarks(String rejectionRemarks);

    List<POLICY_SRV_MBR_ADD> findByServiceId(Long serviceId);

    List<POLICY_SRV_MBR_ADD> findByServiceNumber(String serviceNumber);

    List<POLICY_SRV_MBR_ADD> findByServiceStatus(String serviceStatus);

    List<POLICY_SRV_MBR_ADD> findByTotalContribution(Integer totalContribution);

    List<POLICY_SRV_MBR_ADD> findByUnitCode(String unitCode);

    List<POLICY_SRV_MBR_ADD> findByVoluntaryContribution(Integer voluntaryContribution);

    List<POLICY_SRV_MBR_ADD> findByNoOfCategory(Integer noOfCategory);

    void save(POLICY_SRV_MBR_ADD policySrvMbrAdd);

    void update(POLICY_SRV_MBR_ADD policySrvMbrAdd);

}