@Entity
@Table(name = "POLICY_SRV_MBR")
public class POLICY_SRV_MBR implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "AADHAR_NUMBER")
    private String aadharNumber;

    @Column(name = "CATEGORY_NUMBER")
    private String categoryNumber;

    @Column(name = "COMMUNICATION_PREFERENCE")
    private String communicationPreference;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_ON")
    private Date createdOn;

    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Column(name = "DATE_OF_JOINING")
    private Date dateOfJoining;

    @Column(name = "DATE_OF_JOINING_SCHEME")
    private Date dateOfJoiningScheme;

    @Column(name = "DATE_OF_RETIREMENT")
    private Date dateOfRetirement;

    @Column(name = "DESIGNATION")
    private String designation;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "FATHERS_NAME")
    private String fathersName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "IS_ACTIVE")
    private Integer isActive;

    @Column(name = "IS_ZERO_ID")
    private Integer isZeroId;

    @Column(name = "LANDLINE_NUMBER")
    private String landlineNumber;

    @Column(name = "LANGUAGE_PREFERENCE")
    private String languagePreference;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "LIC_ID")
    private String lICId;

    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;

    @Column(name = "MEMBER_ADDITION_ID")
    private String memberAdditionId;

    @Column(name = "MEMBER_PAN")
    private String memberPAN;

    @Column(name = "MEMBER_STATUS")
    private String memberStatus;

    @Column(name = "MEMBERSHIP_NUMBER")
    private String membershipNumber;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_ON")
    private Date modifiedOn;

    @Column(name = "POLICY_ID")
    private String policyId;

    @Column(name = "SPOUSE_NAME")
    private String spouseName;

    @Column(name = "TYPE_OF_MEMBERSHIP")
    private String typeOfMembership;

    @Column(name = "ANNUITY_OPTION")
    private String annuityOption;

    @Column(name = "BATCH_ID")
    private String batchId;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "EMPLOYEE_CONTRIBUTION")
    private Integer employeeContribution;

    @Column(name = "EMPLOYER_CONTRIBUTION")
    private Integer employerContribution;

    @Column(name = "FREQUENCY")
    private String frequency;

    @Column(name = "MPH_CODE")
    private String mPHCode;

    @Column(name = "MPH_NAME")
    private String mPHName;

    @Column(name = "PAN")
    private String pAN;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @