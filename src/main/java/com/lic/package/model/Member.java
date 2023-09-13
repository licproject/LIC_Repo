NO = :categoryNo, COMMUNICATION_PREFERENCE = :communicationPreference, DATE_OF_BIRTH = :dateOfBirth, DATE_OF_JOINING = :dateOfJoining, DATE_OF_JOINING_SCHEME = :dateOfJoiningScheme, DATE_OF_RETIREMENT = :dateOfRetirement, DESIGNATION = :designation, EMAILID = :emailId, FATHER_NAME = :fatherName, FIRST_NAME = :firstName, GENDER = :gender, IS_ACTIVE = :isActive, IS_ZEROID = :isZeroId, LANDLINE_NO = :landlineNo, LANGUAGE_PREFERENCE = :languagePreference, LAST_NAME = :lastName, LIC_ID = :licId, MARITAL_STATUS = :maritalStatus, MEMBER_PAN = :memberPan, MEMBER_STATUS = :memberStatus, MEMBERSHIP_NUMBER = :membershipNumber, MIDDLE_NAME = :middleName, MOBILE_NO = :mobileNo WHERE MEMBER_ID = :memberId", nativeQuery = true)
public void updateMemberDetails(@Param("memberId") String memberId, 
							@Param("aadharNumber") String aadharNumber,
							@Param("categoryNo") String categoryNo,
							@Param("communicationPreference") String communicationPreference,
							@Param("dateOfBirth") Long dateOfBirth,
							@Param("dateOfJoining") Long dateOfJoining,
							@Param("dateOfJoiningScheme") Long dateOfJoiningScheme,
							@Param("dateOfRetirement") Long dateOfRetirement,
							@Param("designation") String designation,
							@Param("emailId") String emailId,
							@Param("fatherName") String fatherName,
							@Param("firstName") String firstName,
							@Param("gender") String gender,
							@Param("isActive") String isActive,
							@Param("isZeroId") String isZeroId,
							@Param("landlineNo") String landlineNo,
							@Param("languagePreference") String languagePreference,
							@Param("lastName") String lastName,
							@Param("licId") String licId,
							@Param("maritalStatus") String maritalStatus,
							@Param("memberPan") String memberPan,
							@Param("memberStatus") String memberStatus,
							@Param("membershipNumber") String membershipNumber,
							@Param("middleName") String middleName,
							@Param("mobileNo") String mobileNo);
}

/**
 * Package: com.lic.package.model
 */
package com.lic.package.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POLICY_SRV_MBR")
public class Member {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="MEMBER_ID")
    private String memberId;

    @Column(name="AADHAR_NUMBER")
    private String aadharNumber;

    @Column(name="CATEGORY_NO")
    private String categoryNo;

    @Column(name="COMMUNICATION_PREFERENCE")
    private String communicationPreference;
    
    @Column(name="CREATED_BY")
    private String createdBy;

    @Column(name="CREATED_ON")
    private Long createdOn;

    @Column