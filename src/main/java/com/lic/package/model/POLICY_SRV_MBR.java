package com.lic.package.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_SRV_MBR")
public class POLICY_SRV_MBR {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MBR_ID")
    private Long mbrId;
	
	@Column(name = "MBR_NAME")
    private String mbrName;
	
	@Column(name = "MBR_AGE")
    private Integer mbrAge;
	
	@Column(name = "MBR_SEX")
    private String mbrSex;
	
	@Column(name = "MBR_ADDR")
    private String mbrAddr;
	
	// Getters and Setters

}

package com.lic.package.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_SRV_MBR_ADD")
public class POLICY_SRV_MBR_ADD {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MBR_ADD_ID")
    private Long mbrAddId;
	
	@Column(name = "MBR_ADD_LINE1")
    private String mbrAddLine1;
	
	@Column(name = "MBR_ADD_LINE2")
    private String mbrAddLine2;
	
	@Column(name = "MBR_ADD_CITY")
    private String mbrAddCity;

	@Column(name = "MBR_ADD_STATE")
    private String mbrAddState;
	
	// Getters and Setters

}

package com.lic.package.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_SRV_MBR_BANK")
public class POLICY_SRV_MBR_BANK {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MBR_BANK_ID")
    private Long mbrBankId;
	
	@Column(name = "MBR_BANK_ACC_NO")
    private Long mbrBankAccNo;
	
	@Column(name = "MBR_BANK_NAME")
    private String mbrBankName;
	
	// Getters and Setters

}

package com.lic.package.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_SRV_MBR_APOTE")
public class POLICY_SRV_MBR_APOTE {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MBR_APOTE_ID")
    private Long mbrApoteId;
	
	@Column(name = "MBR_APOTE_NAME")
    private String mbrApoteName;
	
	@Column(name = "MBR_APOTE_AGE")
    private Integer mbrApoteAge;
	
	// Get