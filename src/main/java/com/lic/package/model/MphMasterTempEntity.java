@Entity
@Table(name = "mph_master_temp")
public class MphMasterTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mph_id")
    private Long mphId;

    @Column(name = "quotation_id")
    private String quotationId;

    @Column(name = "policy_id")
    private String policyId;

    @Column(name = "member_details")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MemberDetails> memberDetails;

    @Column(name = "frequency_dates")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FrequencyDetails> frequencyDates;

    // getters and setters
}