// Generated Spring Boot Entity/Model Class

package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DataMigrationModel {

    @Id
    private Long mphId;

    private String mphMaster;
    private String mphBank;
    private String mphRepresentatives;
    private String mphAddress;

    public Long getMphId() {
        return mphId;
    }

    public void setMphId(Long mphId) {
        this.mphId = mphId;
    }

    public String getMphMaster() {
        return mphMaster;
    }

    public void setMphMaster(String mphMaster) {
        this.mphMaster = mphMaster;
    }

    public String getMphBank() {
        return mphBank;
    }

    public void setMphBank(String mphBank) {
        this.mphBank = mphBank;
    }

    public String getMphRepresentatives() {
        return mphRepresentatives;
    }

    public void setMphRepresentatives(String mphRepresentatives) {
        this.mphRepresentatives = mphRepresentatives;
    }

    public String getMphAddress() {
        return mphAddress;
    }

    public void setMphAddress(String mphAddress) {
        this.mphAddress = mphAddress;
    }
}