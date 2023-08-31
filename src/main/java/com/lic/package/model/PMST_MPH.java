package com.lic.package.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PMST_MPH")
public class PMST_MPH {

    @Id
    @GeneratedValue
    @Column(name = "mph_id")
    private Long mph_id;

    @Column(name = "policy_number")
    private String policy_number;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;

    @OneToMany(mappedBy = "mph")
    private List<PMST_MPH_BANK> banks;

    @OneToMany(mappedBy = "mph")
    private List<PMST_MPH_ADDRESS> addresses;

    @OneToMany(mappedBy = "mph")
    private List<PMST_MPH_REPRESENTATIVES> representatives;

    public Long getMph_id() {
        return mph_id;
    }

    public void setMph_id(Long mph_id) {
        this.mph_id = mph_id;
    }

    public String getPolicy_number() {
        return policy_number;
    }

    public void setPolicy_number(String policy_number) {
        this.policy_number = policy_number;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public List<PMST_MPH_BANK> getBanks() {
        return banks;
    }

    public void setBanks(List<PMST_MPH_BANK> banks) {
        this.banks = banks;
    }

    public List<PMST_MPH_ADDRESS> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<PMST_MPH_ADDRESS> addresses) {
        this.addresses = addresses;
    }

    public List<PMST_MPH_REPRESENTATIVES> getRepresentatives() {
        return representatives;
    }

    public void setRepresentatives(List<PMST_MPH_REPRESENTATIVES> representatives) {
        this.representatives = representatives;
    }
}