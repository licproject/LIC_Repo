//Generated Spring boot Entity/Model class
package com.lic.package.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Members")
public class PolicyEntity {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;
 
    @NotNull
    @Column(name = "lic_id")
    private Long licId;
 
    @NotNull
    @Column(name = "policy_id")
    private Long policyId;
 
    @NotNull
    @Column(name = "member_status")
    private String memberStatus;
 
    @NotNull
    @Column(name = "father_name")
    private String fatherName;
 
    @NotNull
    @Column(name = "first_name")
    private String firstName;
 
    @NotNull
    @Column(name = "last_name")
    private String lastName;
 
    @NotNull
    @Column(name = "category_no")
    private String categoryNo;
 
    @NotNull
    @Column(name = "is_active")
    private boolean isActive;
 
    @NotNull
    @Column(name = "is_zero_id")
    private boolean isZeroId;
 
    public PolicyEntity() {
 
    }
 
    public PolicyEntity(Long licId, Long policyId, String memberStatus, String fatherName, String firstName, String lastName, String categoryNo, boolean isActive, boolean isZeroId) {
        this.licId = licId;
        this.policyId = policyId;
        this.memberStatus = memberStatus;
        this.fatherName = fatherName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.categoryNo = categoryNo;
        this.isActive = isActive;
        this.isZeroId = isZeroId;
    }
 
    public Long getMemberId() {
        return memberId;
    }
 
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
 
    public Long getLicId() {
        return licId;
    }
 
    public void setLicId(Long licId) {
        this.licId = licId;
    }
 
    public Long getPolicyId() {
        return policyId;
    }
 
    public void setPolicyId(Long policyId) {
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