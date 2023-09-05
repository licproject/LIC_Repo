@Entity
@Table(name = "mph_master_temp")
public class MphMasterTempEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mph_master_temp_id")
	private Long mphMasterTempId;

	@Column(name = "quotation_id")
	private String quotationId;

	@Column(name = "status")
	private String status;

	@Column(name = "active")
	private Boolean active;

	//Getters and Setters

}