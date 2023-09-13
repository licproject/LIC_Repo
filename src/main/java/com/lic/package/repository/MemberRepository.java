for the above repository

package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.package.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
	
	// Create
	Member save(Member member);
	
	// Read 
	Member findById(int id);
	
	@Query("SELECT m FROM Member m WHERE m.aadharNumber = :aadharNumber")
	Member findByAadharNumber(@Param("aadharNumber") String aadharNumber);
	
	// Update
	@Query("UPDATE Member m SET m.categoryNo = :categoryNo, m.communicationPreference = :communicationPreference, m.dateOfBirth = :dateOfBirth, m.dateOfJoining = :dateOfJoining, m.dateOfJoiningScheme = :dateOfJoiningScheme, m.dateOfRetirement = :dateOfRetirement, m.designation = :designation, m.emailId = :emailId, m.fatherName = :fatherName, m.firstName = :firstName, m.gender = :gender, m.isActive = :isActive, m.isZeroId = :isZeroId, m.landlineNo = :landlineNo, m.languagePreference = :languagePreference, m.lastName = :lastName, m.licId = :licId, m.maritalStatus = :maritalStatus, m.memberPan = :memberPan, m.memberStatus = :memberStatus, m.membershipNumber = :membershipNumber, m.middleName = :middleName, m.mobileNo = :mobileNo, m.policyId = :policyId, m.spouseName = :spouseName, m.typeOfMembership = :typeOfMembership WHERE m.memberId = :memberId")
	int updateMember(@Param("memberId") int memberId,@Param("categoryNo") String categoryNo, @Param("communicationPreference") String communicationPreference,@Param("dateOfBirth") String dateOfBirth,@Param("dateOfJoining") String dateOfJoining,@Param("dateOfJoiningScheme") String dateOfJoiningScheme,@Param("dateOfRetirement") String dateOfRetirement,@Param("designation") String designation,@Param("emailId") String emailId,@Param("fatherName") String fatherName,@Param("firstName") String firstName,@Param("gender") String gender,@Param("isActive") String isActive,@Param("isZeroId") String isZeroId,@Param("landlineNo") String landlineNo,@Param("languagePreference") String languagePreference,@Param("lastName") String lastName,@Param("licId") String licId,@Param("maritalStatus") String maritalStatus,@Param("memberPan") String memberPan,@Param("memberStatus") String memberStatus,@Param("membershipNumber") String membershipNumber,@Param("middleName") String middleName,@Param("mobileNo") String mobileNo,@Param("policyId") String policyId,@Param("spouseName") String spouseName,@Param("typeOfMembership") String typeOfMembership);
	
	// Delete
	void deleteById(int id);
	
	@Query("DELETE FROM Member m WHERE m.aadharNumber = :aadharNumber")
	int deleteByAadharNumber(@Param("aadharNumber") String aadharNumber);
	
}