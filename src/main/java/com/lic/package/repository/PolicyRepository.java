@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
   
   List<Policy> findByPolicyNumber(String policyNumber);
   
   List<Policy> findBySchemeType(String schemeType);
   
   List<Policy> findByMphName(String mphName);
   
   List<Policy> findByMphCode(String mphCode);
   
   List<Policy> findByPolicyStatus(String policyStatus);
   
}