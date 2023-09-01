Package com.lic.package.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.PolicyDetails;
import com.lic.package.service.PolicyDetailsService;

@RestController
public class PolicyDetailsController {
	
	@Autowired
	private PolicyDetailsService policyDetailsService;
	
	@GetMapping("/policy-details") 
	public List<PolicyDetails> getPolicyDetails(@RequestParam(value="mph_code", required=false) String mph_code,
			@RequestParam(value="mph_name", required=false) String mph_name,
			@RequestParam(value="account_number", required=false) String account_number,
			@RequestParam(value="sort_1", required=false) String sort_1,
			@RequestParam(value="sort_2", required=false) String sort_2,
			@RequestParam(value="sort_3", required=false) String sort_3,
			@RequestParam(value="sort_4", required=false) String sort_4,
			@RequestParam(value="sort_5", required=false) String sort_5,
			@RequestParam(value="sort_6", required=false) String sort_6,
			@RequestParam(value="page_no", required=false) Integer page_no) {
		return policyDetailsService.findPolicyDetails(mph_code, mph_name, account_number, sort_1, sort_2, sort_3, sort_4, sort_5, sort_6, page_no);
	}
	
	@GetMapping("/total-pages") 
	public int getTotalPages(@RequestParam(value="mph_code", required=false) String mph_code,
			@RequestParam(value="mph_name", required=false) String mph_name,
			@RequestParam(value="account_number", required=false) String account_number) {
		return policyDetailsService.getTotalPages(mph_code, mph_name, account_number);
	}
}