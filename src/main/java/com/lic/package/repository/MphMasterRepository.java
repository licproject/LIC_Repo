@Repository
public interface MphMasterRepository extends JpaRepository<MphMasterTempEntity, Long> {

    MphMasterTempEntity findByQuotationId(String quotationId);

    MphMasterTempEntity save(MphMasterTempEntity mphTempEntity);

    @Transactional
    @Modifying
    @Query("UPDATE MphMasterTempEntity m SET m.mphId = :mphId WHERE m.quotationId = :quotationId")
    int updateMphId(@Param("mphId") Long mphId, @Param("quotationId") String quotationId);

    @Query("SELECT m FROM MphMasterTempEntity m WHERE m.policyId = :policyId")
    MphMasterTempEntity findByPolicyId(@Param("policyId") String policyId);

    @Transactional
    @Modifying
    @Query("UPDATE MphMasterTempEntity m SET m.memberDetails = :memberDetails WHERE m.policyId = :policyId")
    int updateMemberDetails(@Param("memberDetails") List<MemberDetails> memberDetails, @Param("policyId") String policyId);

    @Transactional
    @Modifying
    @Query("UPDATE MphMasterTempEntity m SET m.frequencyDates = :frequencyDates WHERE m.policyId = :policyId")
    int updateFrequencyDates(@Param("frequencyDates") List<FrequencyDetails> frequencyDates, @Param("policyId") String policyId);
}