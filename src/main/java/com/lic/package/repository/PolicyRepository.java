import com.lic.package.dto.MphMasterDto;
import com.lic.package.dto.MphMasterTempEntity;
import com.lic.package.dto.PolicyDto;
import com.lic.package.dto.PolicyFrequencyDetailsDto;
import com.lic.package.dto.PolicyResponseDto;

@Repository
public interface PolicyRepository {
 
    PolicyResponseDto savePolicyDetails(PolicyDto policyDto);
    
    MphMasterDto convertQutationMemberToPolicyMember(Long mphId, PolicyDto policyDto, String variantType);
 
    void getFrequencyDates(PolicyFrequencyDetailsDto frequencyDto);
}