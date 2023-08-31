Display of Policy Details:User Action: Click on the Policy number to view Policy details.Technical Steps:Implement a GET API to fetch policy details of the selected policy.Bind the fetched policy details to the frontend for display in read-only mode.

@Repository
public interface PolicySearchRepository extends JpaRepository<PolicySearch, Long> {

    // Fetching policy details based on policy number
    List<PolicySearch> findByPolicyNumber(String policyNumber);
    
    // Fetching policy details based on customer name
    List<PolicySearch> findByCustomerName(String customerName);
    
    // Fetching policy details based on intermediary name
    List<PolicySearch> findByIntermediaryName(String intermediaryName);
    
    // Fetching policy details based on line of business
    List<PolicySearch> findByLineOfBusiness(String lineOfBusiness);
    
    // Fetching policy details based on product name
    List<PolicySearch> findByProductName(String productName);
    
    // Fetching policy details based on product variant
    List<PolicySearch> findByProductVariant(String productVariant);
    
    // Fetching policy details based on unit office
    List<PolicySearch> findByUnitOffice(String unitOffice);
    
    // Fetching policy details based on policy status
    List<PolicySearch> findByPolicyStatus(String policyStatus);
    
    // Fetching policy details based on policy start date
    List<PolicySearch> findByPolicyStartDate(LocalDate policyStartDate);
    
    // Fetching policy details based on policy end date
    List<PolicySearch> findByPolicyEndDate(LocalDate policyEndDate);
    
}