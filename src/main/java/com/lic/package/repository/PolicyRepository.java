import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyResponseDto;
import com.lic.package.entity.MphMasterTempEntity;
import com.lic.package.entity.QuotationEntity;

public interface PolicyRepository extends JpaRepository<MphMasterTempEntity, Long> {
	public PolicyResponseDto savePolicyDetails(PolicyDto policyDto);

	public QuotationEntity findByQuotationIdAndStatusAndActiveTrue(String quotationId, String status);
}