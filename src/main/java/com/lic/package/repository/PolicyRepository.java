@Repository
public interface PolicyRepository extends JpaRepository<PolicyEntity, Long> {
 
    Optional<PolicyEntity> findByMphCode(String mphCode);
 
    @Modifying
    @Transactional
    @Query("INSERT INTO Members (licId, policyId, memberStatus, fatherName, firstName, lastName, categoryNo, isActive, isZeroId) " +
            "SELECT p.licId, p.policyId, :memberStatus, p.fatherName, p.mphName, p.mphCode, :categoryNo, :isActive, :isZeroId " +
            "FROM PMST_MPH p WHERE p.mphCode = :mphCode")
    void insertMemberFromPolicy(@Param("mphCode") String mphCode,
                               @Param("memberStatus") String memberStatus,
                               @Param("categoryNo") String categoryNo,
                               @Param("isActive") boolean isActive,
                               @Param("isZeroId") boolean isZeroId);
 
    @Modifying
    @Transactional
    @Query("UPDATE Members SET memberStatus = :memberStatus, categoryNo = :categoryNo, isActive = :isActive, isZeroId = :isZeroId " +
            "WHERE licId = :licId AND policyId = :policyId")
    void updateMemberFromPolicy(@Param("licId") long licId,
                               @Param("policyId") long policyId,
                               @Param("memberStatus") String memberStatus,
                               @Param("categoryNo") String categoryNo,
                               @Param("isActive") boolean isActive,
                               @Param("isZeroId") boolean isZeroId);
   
}