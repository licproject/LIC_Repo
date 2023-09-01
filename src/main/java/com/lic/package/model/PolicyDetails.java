+
		"AND (:mph_name IS NULL OR mph.mph_name = :mph_name) " +
		"AND (:account_number IS NULL OR bank.account_number = :account_number)",
		nativeQuery = true)
	Integer getTotalCountForPolicyDetails(
		@Param("mph_code") String mph_code, 
		@Param("mph_name") String mph_name, 
		@Param("account_number") String account_number);
	
}

package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PMST_MPH")
public class PolicyDetails {

	@Id
	private Long mph_code;
	private String mph_name;
	private String bank_name;
	private String bank_branch;
	private String account_number;
	private String city_locality;
	private String district;
	private String representatives;
	
	public PolicyDetails() {
		
	}
	
	public Long getMph_code() {
		return mph_code;
	}
	
	public void setMph_code(Long mph_code) {
		this.mph_code = mph_code;
	}
	
	public String getMph_name() {
		return mph_name;
	}
	
	public void setMph_name(String mph_name) {
		this.mph_name = mph_name;
	}
	
	public String getBank_name() {
		return bank_name;
	}
	
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	
	public String getBank_branch() {
		return bank_branch;
	}
	
	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}
	
	public String getAccount_number() {
		return account_number;
	}
	
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	
	public String getCity_locality() {
		return city_locality;
	}
	
	public void setCity_locality(String city_locality) {
		this.city_locality = city_locality;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getRepresentatives() {
		return representatives;
	}
	
	public void setRepresentatives(String representatives) {
		this.representatives = representatives;
	}
	
}