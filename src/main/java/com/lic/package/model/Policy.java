package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Policy {

    @Id
    private String mphCode;
    private String licId;
    private String policyId;
    private String fatherName;
    private String firstName;
    private String lastName;
    private int categoryNo;
    private int isActive;
    private int isZeroId;

    public Policy() {
    }

    public Policy(String mphCode, String licId, String policyId, String fatherName, String firstName, String lastName, int categoryNo, int isActive, int isZeroId) {
        this.mphCode = mphCode;
        this.licId = licId;
        this.policyId = policyId;
        this.fatherName = fatherName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.categoryNo = categoryNo;
        this.isActive = isActive;
        this.isZeroId = isZeroId;
    }

    public String getMphCode() {
        return mphCode;
    }

    public void setMphCode(String mphCode) {
        this.mphCode = mphCode;
    }

    public String getLicId() {
        return licId;
    }

    public void setLicId(String licId) {
        this.licId = licId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(int categoryNo) {
        this.categoryNo = categoryNo;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getIsZeroId() {
        return isZeroId;
    }

    public void setIsZeroId(int isZeroId) {
        this.isZeroId = isZeroId;
    }

}