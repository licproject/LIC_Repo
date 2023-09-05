@Repository
public interface CheckerPolicyDetailChangeRepository {

    // API to fetch policy details based on the criteria
    public List<PolicyDetails> fetchPolicyDetails(String policyNumber);
    
    // API to fetch Trustee/MPH Details from the TEMP Table
    public List<TrusteeMPHDetails> fetchTrusteeMPHDetails();
    
    // API to move data from the TEMP Table to the Master Table
    public void moveTemptoMasterTable();
    
    // API to discard data from the TEMP Table
    public void discardFromTempTable();
    
    // API to retain data in the TEMP Table
    public void retainInTempTable();
    
    // API to display a success message for the transaction
    public void showSuccessMessage();
}