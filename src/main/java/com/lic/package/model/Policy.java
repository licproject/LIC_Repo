@Entity
@Table(name = "policy")
@Data
@NoArgsConstructor
public class Policy implements Serializable {
	
   private static final long serialVersionUID = 1L;
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "policy_id")
   private Long policyId;
   
   @Column(name = "policy_number")
   private String policyNumber;
   
   @Column(name = "scheme_type")
   private String schemeType;
   
   @Column(name = "mph_name")
   private String mphName;
   
   @Column(name = "mph_code")
   private String mphCode;
   
   @Column(name = "policy_status")
   private String policyStatus;
   
}