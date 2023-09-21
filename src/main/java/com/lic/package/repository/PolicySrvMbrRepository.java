import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicySrvMbrRepository extends JpaRepository<PolicySrvMbr, Long> {
    Optional<PolicySrvMbr> findByMemberId(Long memberId);

    Optional<PolicySrvMbr> findByAadharNumber(Long aadharNumber);

    Optional<PolicySrvMbr> findByCategoryNo(Long categoryNo);

    Optional<PolicySrvMbr> findByCommunicationPreference(String communicationPreference);

    Optional<PolicySrvMbr> findByCreatedBy(String createdBy);

    Optional<PolicySrvMbr> findByCreatedOn(Timestamp createdOn);

    Optional<PolicySrvMbr> findByDateOfBirth(Timestamp dateOfBirth);

    Optional<PolicySrvMbr> findByDateOfJoining(Timestamp dateOfJoining);

    Optional<PolicySrvMbr> findByDateOfJoiningScheme(Timestamp dateOfJoiningScheme);

    Optional<PolicySrvMbr> findByDateOfRetirement(Timestamp dateOfRetirement);

    Optional<PolicySrvMbr> findByDesignation(String designation);

    Optional<PolicySrvMbr> findByEmailId(String emailId);

    Optional<PolicySrvMbr> findByFatherName(String fatherName);

    Optional<PolicySrvMbr> findByFirstName(String firstName);

    Optional<PolicySrvMbr> findByGender(String gender);

    Optional<PolicySrvMbr> findByIsActive(Long isActive);

    Optional<PolicySrvMbr> findByIsZeroId(Long isZeroId);

    Optional<PolicySrvMbr> findByLandlineNo(Long landlineNo);

    Optional<PolicySrvMbr> findByLanguagePreference(String languagePreference);

    Optional<PolicySrvMbr> findByLastName(String lastName);

    Optional<PolicySrvMbr> findByLicId(String licId);

    Optional<PolicySrvMbr> findByMaritalStatus(String maritalStatus);

    Optional<PolicySrvMbr> findByMemberAdditionId(Long memberAdditionId);

    Optional<PolicySrvMbr> findByMemberPan(String memberPan);

    Optional<PolicySrvMbr> findByMemberStatus(String memberStatus);

    Optional<PolicySrvMbr> findByMembershipNumber(String membershipNumber);

    Optional<PolicySrvMbr> findByMiddleName(String middleName);

    Optional<PolicySrvMbr> findByMobileNo(Long mobileNo);

    Optional<PolicySrvMbr> findByModifiedBy(String modifiedBy);

    Optional<PolicySrvMbr> findByModifiedOn(Timestamp modifiedOn);

    Optional<PolicySrvMbr> findByPolicyId(Long policyId);

    Optional<PolicySrvMbr> findBySpouseName(String spouseName);

    Optional<PolicySrvMbr> findByTypeOfMembership(String typeOfMembership);

    Optional<PolicySrvMbr> findByAnnuityOption(String annuityOption);

    Optional<PolicySrvMbr> findByBatchId(Long batchId);

    Optional<PolicySrvMbr> findByCategory(Long category);

    Optional<PolicySrvMbr> findByEmployeeContribution(Long employeeContribution);

    Optional<PolicySrvMbr> findByEmployerContribution(Long employerContribution);

    Optional<PolicySrvMbr> findByFrequency(Long frequency);

    Optional<PolicySrvMbr> findByMphCode(String mphCode);

    Optional<PolicySrvMbr> findByMphName(String mphName);

    Optional<PolicySrvMbr> findByPan(String pan);

    Optional<PolicySrvMbr> findByPhone(Long phone);

    Optional<PolicySrvMbr> findByPolicyNo(String policyNo);

    Optional<PolicySrvMbr> findByPolicyStatus(String policyStatus);

    Optional<PolicySrvMbr> findByProduct(String product);

    Optional<