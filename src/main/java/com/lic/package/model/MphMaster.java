package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mph_master")
public class MphMaster {

    @Id
    private Long mphId;
    private String alternatePAN;
    private String cin;
    private String countryCode;

    public Long getMphId() {
        return mphId;
    }

    public void setMphId(Long mphId) {
        this.mphId = mphId;
    }

    public String getAlternatePAN() {
        return alternatePAN;
    }

    public void setAlternatePAN(String alternatePAN) {
        this.alternatePAN = alternatePAN;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}