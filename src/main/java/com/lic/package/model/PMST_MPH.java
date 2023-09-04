package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PMST_MPH")
public class PMST_MPH {
    @Id
    private Long id;
    private String mphCode;
    private String data1;
    private String data2;
    private String data3;

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

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }
}