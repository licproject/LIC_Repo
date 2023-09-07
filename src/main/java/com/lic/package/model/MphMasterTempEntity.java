package com.lic.package.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mph_master_temp")
public class MphMasterTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mph_master_temp_id")
    private Long mphMasterTempId;

    @Column(name = "quotation_id")
    private Long quotationId;

    @Column(name = "policy_id")
    private Long policyId;

    @Column(name = "mph_id")
    private Long mphId;

    @Column(name = "frequency")
    private String frequency;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "modified_date")
    private Date modifiedDate;

    public Long getMphMasterTempId() {
        return mphMasterTempId;
    }

    public void setMphMasterTempId(Long mphMasterTempId) {
        this.mphMasterTempId = mphMasterTempId;
    }

    public Long getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Long quotationId) {
        this.quotationId = quotationId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getMphId() {
        return mphId;
    }

    public void setMphId(Long mphId) {
        this.mphId = mphId;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}