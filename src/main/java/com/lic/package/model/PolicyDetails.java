@Entity
@Table(name = "policy_details")
public class PolicyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "policy_id")
    private String policyId;
    
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getPolicyId() {
        return policyId;
    }
 
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }
}