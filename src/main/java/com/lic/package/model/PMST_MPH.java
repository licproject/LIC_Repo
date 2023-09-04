package com.lic.package.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PMST_MPH")
public class PMST_MPH {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mph_id")
	private Long mphId;
	
	@Column(name="mph_code")
	private String mphCode;
	
	@Column(name="mph_description")
	private String mphDescription;

	public Long getMphId() {
		return mphId;
	}

	public void setMphId(Long mphId) {
		this.mphId = mphId;
	}

	public String getMphCode() {
		return mphCode;
	}

	public void setMphCode(String mphCode) {
		this.mphCode = mphCode;
	}

	public String getMphDescription() {
		return mphDescription;
	}

	public void setMphDescription(String mphDescription) {
		this.mphDescription = mphDescription;
	}
	
	

}