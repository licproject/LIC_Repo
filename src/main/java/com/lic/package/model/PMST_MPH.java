// Spring Boot Entity/Model class
package com.lic.package.model;

import javax.persistence.*;

@Entity
@Table(name="PMST_MPH")
public class PMST_MPH {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PMST_MPH_ID")
    private int pmstMphId;

    @Column(name = "MPH_CODE")
    private String mphCode;

    @Column(name = "LIC_ID")
    private String licId;

    @Column(name = "POLICY_ID")
    private String policyId;

    @Column(name = "MEMBER_STATUS")
    private String memberStatus;

    @Column(name = "FATHER_NAME")
    private String fatherName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "CATEGORY_NO")
    private String categoryNo;

    @Column(name = "IS_ACTIVE")
    private boolean isActive;

    @Column(name = "IS_ZERO_ID")
    private boolean isZeroId;

    public int getPmstMphId() {
        return pmstMphId;
    }

    public void setPmstMphId(int pmstMphId) {
        this.pmstMphId = pmstMphId;
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

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
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

    public String getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(String categoryNo) {
        this.categoryNo = categoryNo;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isZeroId() {
        return isZeroId;
    }

    public void setZeroId(boolean zeroId) {
        isZeroId = zeroId;
    }
}