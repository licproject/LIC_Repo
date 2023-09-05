package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mph_master_temp")
public class MphMasterTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long mphId;
    private String variantType;
    private PolicyDto policyDto;
    private PolicyFrequencyDetailsDto policyFrequencyDetailsDto;
    private MphMasterDto mphMasterDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMphId() {
        return mphId;
    }

    public void setMphId(Long mphId) {
        this.mphId = mphId;
    }

    public String getVariantType() {
        return variantType;
    }

    public void setVariantType(String variantType) {
        this.variantType = variantType;
    }

    public PolicyDto getPolicyDto() {
        return policyDto;
    }

    public void setPolicyDto(PolicyDto policyDto) {
        this.policyDto = policyDto;
    }

    public PolicyFrequencyDetailsDto getPolicyFrequencyDetailsDto() {
        return policyFrequencyDetailsDto;
    }

    public void setPolicyFrequencyDetailsDto(PolicyFrequencyDetailsDto policyFrequencyDetailsDto) {
        this.policyFrequencyDetailsDto = policyFrequencyDetailsDto;
    }

    public MphMasterDto getMphMasterDto() {
        return mphMasterDto;
    }

    public void setMphMasterDto(MphMasterDto mphMasterDto) {
        this.mphMasterDto = mphMasterDto;
    }
}