@Entity
@Table(name = "policy_search")
public class PolicySearch {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "policy_number")
    private String policyNumber;
    
    @Column(name = "customer_name")
    private String customerName;
    
    @Column(name = "intermediary_name")
    private String intermediaryName;
    
    @Column(name = "line_of_business")
    private String lineOfBusiness;
    
    @Column(name = "product_name")
    private String productName;
    
    @Column(name = "product_variant")
    private String productVariant;
    
    @Column(name = "unit_office")
    private String unitOffice;
    
    @Column(name = "policy_status")
    private String policyStatus;
    
    @Column(name = "policy_start_date")
    private LocalDate policyStartDate;
    
    @Column(name = "policy_end_date")
    private LocalDate policyEndDate;
    
    // getters and setters

}