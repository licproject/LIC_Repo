package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.package.model.PolicySrvMbr;
import com.lic.package.model.PolicySrvMbrAdd;
import com.lic.package.model.PolicySrvMbrBank;
import com.lic.package.model.PolicySrvMbrNomi;
import com.lic.package.model.PolicySrvMbrApote;

public interface PolicyManagementSystemRepository extends JpaRepository<PolicySrvMbr, Integer> {

	// Saving Member Details
	@Query("INSERT INTO PolicySrvMbr (policy_id, type_of_membership, category_no, aadhar_number, first_name, middle_name, last_name, date_of_birth, father_name, gender, marital_status, mobile_no, email_id, landline_no, communication_preference, language_preference, date_of_joining, date_of_joining_scheme, date_of_retirement, membership_number, member_pan, member_status, is_zero, is_active, created_by, modified_by, spouse_name) "
	+ "VALUES (:policy_id, :type_of_membership, :category_no, :aadhar_number, :first_name, :middle_name, :last_name, :date_of_birth, :father_name, :gender, :marital_status, :mobile_no, :email_id, :landline_no, :communication_preference, :language_preference, :date_of_joining, :date_of_joining_scheme, :date_of_retirement, :membership_number, :member_pan, :member_status, :is_zero, :is_active, :created_by, :modified_by, :spouse_name)")
	public void saveMemberDetails(@Param("policy_id") Integer policy_id, @Param("type_of_membership") String type_of_membership, @Param("category_no") String category_no, @Param("aadhar_number") String aadhar_number, @Param("first_name") String first_name, @Param("middle_name") String middle_name, @Param("last_name") String last_name, @Param("date_of_birth") String date_of_birth, @Param("father_name") String father_name, @Param("gender") String gender, @Param("marital_status") String marital_status, @Param("mobile_no") String mobile_no, @Param("email_id") String email_id, @Param("landline_no") String landline_no, @Param("communication_preference") String communication_preference, @Param("language_preference") String language_preference, @Param("date_of_joining") String date_of_joining, @Param("date_of_joining_scheme") String date_of_joining_scheme, @Param("date_of_retirement") String date_of_retirement, @Param("membership_number") String membership_number, @Param("member_pan") String member_pan, @Param("member_status") String member_status, @Param("is_zero") String is_zero, @Param("is_active") String is_active, @Param("created_by") String created_by, @Param("modified_by") String modified_by, @Param("spouse_name") String spouse_name);

	// Updating Member Details
	@Query("UPDATE PolicySrvMbr SET policy_id = :policy_id, type_of_membership = :type_of_membership, category_no = :category_no, aadhar_number = :aadhar_number, first_name = :first_name, middle_name = :middle_name, last_name = :last_name, date_of_birth = :date_of_birth, father_name = :father_name, gender = :gender, marital_status = :marital_status, mobile_no = :mobile_no, email_id = :email_id, landline_no = :