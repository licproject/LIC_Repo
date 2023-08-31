package com.lic.package.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Policy {
 
 @Id
 private int policyNumber;
 private String basicDetails;
 private String bankDetails;
 private String addressDetails;
 private String contactPersonDetails;
 
 //Getters and setters
 
 public int getPolicyNumber() {
  return policyNumber;
 }
 
 public void setPolicyNumber(int policyNumber) {
  this.policyNumber = policyNumber;
 }
 
 public String getBasicDetails() {
  return basicDetails;
 }
 
 public void setBasicDetails(String basicDetails) {
  this.basicDetails = basicDetails;
 }
 
 public String getBankDetails() {
  return bankDetails;
 }
 
 public void setBankDetails(String bankDetails) {
  this.bankDetails = bankDetails;
 }
 
 public String getAddressDetails() {
  return addressDetails;
 }
 
 public void setAddressDetails(String addressDetails) {
  this.addressDetails = addressDetails;
 }
 
 public String getContactPersonDetails() {
  return contactPersonDetails;
 }
 
 public void setContactPersonDetails(String contactPersonDetails) {
  this.contactPersonDetails = contactPersonDetails;
 }

}