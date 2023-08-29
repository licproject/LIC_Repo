// Policy Model/Entity
public class Policy {
  private String policyNumber;
  private String schemeType;
  private String mphName;
  private String mphCode;
  private String policyStatus;
  
  // Getters and Setters
  public String getPolicyNumber() {
    return policyNumber;
  }
  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  } 
  public String getSchemeType() {
    return schemeType;
  }
  public void setSchemeType(String schemeType) {
    this.schemeType = schemeType;
  } 
  public String getMphName() {
    return mphName;
  }
  public void setMphName(String mphName) {
    this.mphName = mphName;
  } 
  public String getMphCode() {
    return mphCode;
  }
  public void setMphCode(String mphCode) {
    this.mphCode = mphCode;
  } 
  public String getPolicyStatus() {
    return policyStatus;
  }
  public void setPolicyStatus(String policyStatus) {
    this.policyStatus = policyStatus;
  } 
}

// PolicyRepository
public interface PolicyRepository {
  List<Policy> findByPolicyNumber(String policyNumber);
  List<Policy> findByOtherCriteria(String otherCriteria);
}

// PolicyService
public class PolicyService {
  private PolicyRepository policyRepository;
  
  public PolicyService(PolicyRepository policyRepository) {
    this.policyRepository = policyRepository;
  }
  
  public List<Policy> searchPolicies(String policyNumber, String otherCriteria) {
    List<Policy> policies = new ArrayList<>();
    
    if (policyNumber != null && !policyNumber.isEmpty()) {
      policies = policyRepository.findByPolicyNumber(policyNumber);
    }
    
    if (otherCriteria != null && !otherCriteria.isEmpty()) {
      policies = policyRepository.findByOtherCriteria(otherCriteria);
    }
    
    return policies;
  }
}

// PolicyController
@RestController
public class PolicyController {

  private PolicyService policyService;
  
  public PolicyController(PolicyService policyService) {
    this.policyService = policyService;
  }
  
  @GetMapping("/policies")
  public List<Policy> searchPolicies(@RequestParam(required = false) String policyNumber,
      @RequestParam(required = false) String otherCriteria) {
    return policyService.searchPolicies(policyNumber, otherCriteria);
  }
}