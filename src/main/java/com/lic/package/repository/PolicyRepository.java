import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<policy, String> {

    public Policy findByMphCode(String mphCode);

    public void saveAndInsertIntoMembers(String licId, String policyId, String fatherName, String firstName, String lastName, int categoryNo, int isActive, int isZeroId);

}