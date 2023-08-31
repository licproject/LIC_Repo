@Repository
@Transactional
public interface PolicyRepository extends JpaRepository<PMST_MPH, Long> {
 
    @Query("SELECT mph, bank, add, rep FROM PMST_MPH mph INNER JOIN PMST_MPH_BANK bank on mph.mph_id = bank.mph_id INNER JOIN PMST_MPH_ADDRESS add on mph.mph_id = add.mph_id INNER JOIN PMST_MPH_REPRESENTATIVES rep on mph.mph_id = rep.mph_id WHERE mph.mph_id = :mph_id")
    List<Object[]> findPolicyDetailsByMphId(@Param("mph_id") Long mph_id); 
 
    @Query("SELECT mph, bank, add, rep FROM PMST_MPH mph INNER JOIN PMST_MPH_BANK bank on mph.mph_id = bank.mph_id INNER JOIN PMST_MPH_ADDRESS add on mph.mph_id = add.mph_id INNER JOIN PMST_MPH_REPRESENTATIVES rep on mph.mph_id = rep.mph_id WHERE mph.mph_id in :mph_ids")
    List<Object[]> findPolicyDetailsByMphIds(@Param("mph_ids") List<Long> mph_ids);
 
    @Query("SELECT mph, bank, add, rep FROM PMST_MPH mph INNER JOIN PMST_MPH_BANK bank on mph.mph_id = bank.mph_id INNER JOIN PMST_MPH_ADDRESS add on mph.mph_id = add.mph_id INNER JOIN PMST_MPH_REPRESENTATIVES rep on mph.mph_id = rep.mph_id WHERE mph.policy_number = :policy_number")
    List<Object[]> findPolicyDetailsByPolicyNumber(@Param("policy_number") String policy_number);
 
    @Query("SELECT mph, bank, add, rep FROM PMST_MPH mph INNER JOIN PMST_MPH_BANK bank on mph.mph_id = bank.mph_id INNER JOIN PMST_MPH_ADDRESS add on mph.mph_id = add.mph_id INNER JOIN PMST_MPH_REPRESENTATIVES rep on mph.mph_id = rep.mph_id WHERE mph.start_date >= :start_date AND mph.end_date <= :end_date")
    List<Object[]> findPolicyDetailsByDateRange(@Param("start_date") Date start_date, @Param("end_date") Date end_date);
 
}