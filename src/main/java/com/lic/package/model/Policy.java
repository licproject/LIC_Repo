package com.lic.package.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY")
public class Policy implements Serializable {
	
	@Id
	private Long id;
	
	private PolicyDto policyDto;
	private MphMasterDto mphMasterDto;
	private MphMasterTempEntity mphMasterTempEntity;
	private PolicyFrequencyDetailsDto frequencyDto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PolicyDto getPolicyDto() {
		return policyDto;
	}
	public void setPolicyDto(PolicyDto policyDto) {
		this.policyDto = policyDto;
	}
	public MphMasterDto getMphMasterDto() {
		return mphMasterDto;
	}
	public void setMphMasterDto(MphMasterDto mphMasterDto) {
		this.mphMasterDto = mphMasterDto;
	}
	public MphMasterTempEntity getMphMasterTempEntity() {
		return mphMasterTempEntity;
	}
	public void setMphMasterTempEntity(MphMasterTempEntity mphMasterTempEntity) {
		this.mphMasterTempEntity = mphMasterTempEntity;
	}
	public PolicyFrequencyDetailsDto getFrequencyDto() {
		return frequencyDto;
	}
	public void setFrequencyDto(PolicyFrequencyDetailsDto frequencyDto) {
		this.frequencyDto = frequencyDto;
	}
	
	

}