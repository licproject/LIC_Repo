updateAppointee(@Param("APPOINTEE_AADHAR_NUMBER") String APPOINTEE_AADHAR_NUMBER, @Param("APPOINTEE_ACCOUNT_NUMBER") String APPOINTEE_ACCOUNT_NUMBER, @Param("APPOINTEE_ACCOUNT_TYPE")String APPOINTEE_ACCOUNT_TYPE, @Param("APPOINTEE_CODE") String APPOINTEE_CODE, @Param("APPOINTEE_NAME") String APPOINTEE_NAME, @Param("APPOINTEE_BANK_NAME") String APPOINTEE_BANK_NAME, @Param("CONTACT_NUMBER") String CONTACT_NUMBER, @Param("DATE_OF_BIRTH") String DATE_OF_BIRTH, @Param("APPOINTEE_IFSC_CODE") String APPOINTEE_IFSC_CODE, @Param("IS_ACTIVE") Boolean IS_ACTIVE, @Param("MEMBER_ID") Long MEMBER_ID, @Param("APPOINTEE_PAN") String APPOINTEE_PAN, @Param("RELATIONSHIP") String RELATIONSHIP, @Param("MODIFIED_BY") Long MODIFIED_BY, @Param("APPOINTEE_ID") Long APPOINTEE_ID);

}

package com.lic.package.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "POLICY_SRV_MBR_APOTE")
public class Apponintee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "APPOINTEE_ID")
    private Long appointeeId;

    @Column(name = "APPOINTEE_AADHAR_NUMBER")
    private String appointeeAadhaarNumber;

    @Column(name = "APPOINTEE_ACCOUNT_NUMBER")
    private String appointeeAccountNumber;

    @Column(name = "APPOINTEE_ACCOUNT_TYPE")
    private String appointeeAccountType;

    @Column(name = "APPOINTEE_CODE")
    private String appointeeCode;

    @Column(name = "APPOINTEE_NAME")
    private String appointeeName;

    @Column(name = "APPOINTEE_BANK_NAME")
    private String appointeeBankName;

    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "CREATED_ON")
    private Date createdOn;

    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;

    @Column(name = "APPOINTEE_IFSC_CODE")
    private String appointeeIFSCCode;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Column(name = "APPOINTEE_PAN")
    private String appointeePAN;

    @Column(name = "RELATIONSHIP")
    private String relationship;

    public Long getAppointeeId() {
        return appointeeId;
    }

    public void setAppointeeId(Long appointeeId) {
        this.appointeeId = appointeeId;
    }

    public String getAppointeeAadhaarNumber() {
        return appointeeAadhaarNumber;
    }

    public void setAppointeeAadhaarNumber(String appointeeAadhaarNumber) {
        this.appointeeAadhaarNumber = appointeeAadhaarNumber;
    }

    public String getAppointeeAccountNumber() {
        return appointeeAccountNumber;
    }

    public void setAppointeeAccountNumber(String appointeeAccountNumber) {
        this.appointeeAccountNumber = appointeeAccountNumber;
    }

    public String getAppointeeAccountType() {
        return appointeeAccountType;
    }

    public void setAppointeeAccountType(String appointeeAccountType) {
        this.appointeeAccountType = appointeeAccountType;
    }

    public String getAppointeeCode() {