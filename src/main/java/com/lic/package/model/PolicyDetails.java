package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyDetails {
    
    @Id
    private String mphCode;
    private String mphName;
    private String bankName;
    private String bankBranch;
    private String accountNumber;
    private String cityLocality;
    private String district;
    private int totalCount;
    private int noOfPages;
    
    public PolicyDetails() {
    }
    
    public String getMphCode() {
        return this.mphCode;
    }
    
    public void setMphCode(String mphCode) {
        this.mphCode = mphCode;
    }
    
    public String getMphName() {
        return this.mphName;
    }
    
    public void setMphName(String mphName) {
        this.mphName = mphName;
    }
    
    public String getBankName() {
        return this.bankName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    public String getBankBranch() {
        return this.bankBranch;
    }
    
    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }
    
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getCityLocality() {
        return this.cityLocality;
    }
    
    public void setCityLocality(String cityLocality) {
        this.cityLocality = cityLocality;
    }
    
    public String getDistrict() {
        return this.district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }
    
    public int getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    
    public int getNoOfPages() {
        return this.noOfPages;
    }
    
    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
    
    @Override
    public String toString() {
        return "{" +
            " mphCode='" + getMphCode() + "'" +
            ", mphName='" + getMphName() + "'" +
            ", bankName='" + getBankName() + "'" +
            ", bankBranch='" + getBankBranch() + "'" +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", cityLocality='" + getCityLocality() + "'" +
            ", district='" + getDistrict() + "'" +
            ", totalCount='" + getTotalCount() + "'" +
            ", noOfPages='" + getNoOfPages() + "'" +
            "}";
    }

}