and processing.

@Repository
public interface RetrieveAndInsertPolicyDetailsRepository {
    //Scenario 1: Creating Temporary Tables
    void createTemporaryTables();
    
    //Scenario 2: Inserting Policy Details
    void insertPolicyDetails(String policyId);
}