// Spring Boot Entity/Model class
package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TEMP_TABLE")
public class TrusteeMPHDetails {
	
	private String policyNumber;
	private String trusteeName;
	private String mphName;
	private String status;
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getTrusteeName() {
		return trusteeName;
	}
	public void setTrusteeName(String trusteeName) {
		this.trusteeName = trusteeName;
	}
	public String getMphName() {
		return mphName;
	}
	public void setMphName(String mphName) {
		this.mphName = mphName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

@Entity
@Table(name="MASTER_TABLE")
public class PolicyDetails {
	
	private String policyNumber;
	private String policyName;
	private String policyType;
	private String policyHolderName;
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	
	
	

}