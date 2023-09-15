VICE_NUMBER, SERVICE_STATUS = :SERVICE_STATUS, TOTAL_CONTRIBUTION = :TOTAL_CONTRIBUTION, UNIT_CODE = :UNIT_CODE, VOLUNTARY_CONTRIBUTION = :VOLUNTARY_CONTRIBUTION, NO_OF_CATEGORY = :NO_OF_CATEGORY WHERE MEMBER_ADDITION_ID = :MEMBER_ADDITION_ID", nativeQuery = true)
    int updateMemberAddress(@Param("MEMBER_ADDITION_ID") Long MEMBER_ADDITION_ID,@Param("CREATED_BY") String CREATED_BY, @Param("EMPLOYEE_CONTRIBUTION") String EMPLOYEE_CONTRIBUTION, @Param("EMPLOYER_CONTRIBUTION") String EMPLOYER_CONTRIBUTION, @Param("IS_ACTIVE") String IS_ACTIVE, @Param("LINE_OF_BUSINESS") String LINE_OF_BUSINESS, @Param("MEMBER_ADDITION_STATUS") String MEMBER_ADDITION_STATUS, @Param("MODIFIED_BY") String MODIFIED_BY, @Param("MPH_CODE") String MPH_CODE, @Param("MPH_NAME") String MPH_NAME, @Param("POLICY_ID") Long POLICY_ID, @Param("POLICY_MBR_NO") String POLICY_MBR_NO, @Param("POLICY_NUMBER") String POLICY_NUMBER, @Param("POLICY_STATUS") String POLICY_STATUS, @Param("PRODUCT") String PRODUCT, @Param("REJECTION_REASON_CODE") String REJECTION_REASON_CODE, @Param("REJECTION_REMARKS") String REJECTION_REMARKS, @Param("SERVICE_ID") Long SERVICE_ID, @Param("SERVICE_NUMBER") String SERVICE_NUMBER, @Param("SERVICE_STATUS") String SERVICE_STATUS, @Param("TOTAL_CONTRIBUTION") String TOTAL_CONTRIBUTION, @Param("UNIT_CODE") String UNIT_CODE, @Param("VOLUNTARY_CONTRIBUTION") String VOLUNTARY_CONTRIBUTION, @Param("NO_OF_CATEGORY") String NO_OF_CATEGORY);

}

@Entity
@Table(name = "POLICY_SRV_MBR_ADD")
@Data
public class POLICY_SRV_MBR_ADD {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "MEMBER_ADDITION_ID")
    private Long MEMBER_ADDITION_ID;

    @Column(name = "CREATED_BY")
    private String CREATED_BY;

    @Column(name = "EMPLOYEE_CONTRIBUTION")
    private String EMPLOYEE_CONTRIBUTION;

    @Column(name = "EMPLOYER_CONTRIBUTION")
    private String EMPLOYER_CONTRIBUTION;

    @Column(name = "IS_ACTIVE")
    private String IS_ACTIVE;

    @Column(name = "LINE_OF_BUSINESS")
    private String LINE_OF_BUSINESS;

    @Column(name = "MEMBER_ADDITION_STATUS")
    private String MEMBER_ADDITION_STATUS;

    @Column(name = "MODIFIED_BY")
    private String MODIFIED_BY;

    @Column(name = "MPH_CODE")
    private String MPH_CODE;

    @Column(name = "MPH_NAME")
    private String MPH_NAME;

    @Column(name = "POLICY_ID")
    private Long POLICY_ID;

    @Column(name = "POLICY_MBR_NO")
    private String POLICY_MBR_NO;

    @Column(name = "POLICY_NUMBER")
    private String POLICY_NUMBER;

    @Column(name = "POLICY_STATUS")
    private String POLICY_STATUS;

    @Column(name = "PRODUCT")
    private String PRODUCT;

    @Column(name = "REJECTION_REASON_CODE")
    private String REJECTION_REASON_CODE;

   