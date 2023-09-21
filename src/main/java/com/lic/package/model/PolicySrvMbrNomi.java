package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicySrvMbrNomi {

  @Id
  private Integer nomineeId;

  private String nomineeName;

  private String nomineeType;

  private String nomineeRelation;

  public Integer getNomineeId() {
    return nomineeId;
  }

  public void setNomineeId(Integer nomineeId) {
    this.nomineeId = nomineeId;
  }

  public String getNomineeName() {
    return nomineeName;
  }

  public void setNomineeName(String nomineeName) {
    this.nomineeName = nomineeName;
  }

  public String getNomineeType() {
    return nomineeType;
  }

  public void setNomineeType(String nomineeType) {
    this.nomineeType = nomineeType;
  }

  public String getNomineeRelation() {
    return nomineeRelation;
  }

  public void setNomineeRelation(String nomineeRelation) {
    this.nomineeRelation = nomineeRelation;
  }

}