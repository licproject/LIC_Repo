// PolicyController.java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/policies")
public class PolicyController { 

    private final PolicyService policyService;

    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @GetMapping
    public List<Policy> searchPolicies(@RequestParam(value = "policyNumber", required = false) String policyNumber,
                              @RequestParam(value = "schemeType", required = false) String schemeType,
                              @RequestParam(value = "mphName", required = false) String mphName,
                              @RequestParam(value = "mphCode", required = false) String mphCode,
                              @RequestParam(value = "policyStatus", required = false) String policyStatus) {
        return policyService.searchPolicies(policyNumber, schemeType, mphName, mphCode, policyStatus);
    }
}

// PolicyService.java
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    private final PolicyRepository policyRepository;

    public PolicyService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    public List<Policy> searchPolicies(String policyNumber,
                                      String schemeType,
                                      String mphName,
                                      String mphCode,
                                      String policyStatus) {
        return policyRepository.searchPolicies(policyNumber, schemeType, mphName, mphCode, policyStatus);
    }

}

// PolicyRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {

    List<Policy> searchPolicies(String policyNumber,
                               String schemeType,
                               String mphName,
                               String mphCode,
                               String policyStatus);

}

// Policy.java
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyNumber;
    private String schemeType;
    private String mphName;
    private String mphCode;
    private String policyStatus;

    // getters and setters

}