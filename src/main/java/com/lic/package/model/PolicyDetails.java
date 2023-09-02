package com.lic.package.model;

import javax.persistence.*;

@Entity
@Table(name="PMST_MPH")
public class PolicyDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="mph_code")
    private String mphCode;

    @Column(name ="mph_name")
    private String mphName;

    @Column(name ="bank_name")
    private String bankName;

    @Column(name ="bank_branch")
    private String bankBranch;

    @Column(name ="account_number")
    private String accountNumber;

    @Column(name ="city_locality")
    private String cityLocality;

    @Column(name ="district")
    private String district;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMphCode() {
        return mphCode;
    }

    public void setMphCode(String mphCode) {
        this.mphCode = mphCode;
    }

    public String getMphName() {
        return mphName;
    }

    public void setMphName(String mphName) {
        this.mphName = mphName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCityLocality() {
        return cityLocality;
    }

    public void setCityLocality(String cityLocality) {
        this.cityLocality = cityLocality;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}