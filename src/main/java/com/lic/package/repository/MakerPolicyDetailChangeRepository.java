@Repository
public interface MakerPolicyDetailChangeRepository {
  
    // To search the existing policies with search criteria option to search the customer’s Policy details
    public List<Policy> findBySearchCriteria(String searchCriteria);
    
    // To display the Policy details against the defined Policy number and display Policy details in Policy grid
    public Policy findByPolicyNumber(int policyNumber);

    // To update the values in the TEMP Table for Basic Details
    public void updateBasicDetailsByPolicyNumber(int policyNumber, String basicDetails);

    // To update the values in the TEMP Table for Bank Details
    public void updateBankDetailsByPolicyNumber(int policyNumber, String bankDetails);

    // To update the values in the TEMP Table for Address Details
    public void updateAddressDetailsByPolicyNumber(int policyNumber, String addressDetails);

    // To update the values in the TEMP Table for Contact Person Details
    public void updateContactPersonDetailsByPolicyNumber(int policyNumber, String contactPersonDetails);

    // To search for in-progress records under Endorsements
    public List<Policy> findInProgressRecords();

}