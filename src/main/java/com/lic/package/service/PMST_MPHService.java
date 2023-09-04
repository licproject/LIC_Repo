package com.lic.package.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.entity.PMST_MPH;
import com.lic.package.entity.Members;
import com.lic.package.repository.PMST_MPHRepository;

@Service
public class PMST_MPHService {
	
	@Autowired
	private PMST_MPHRepository pmstMPHRepository;
	
	public PMST_MPH findByMphCode(String mphCode) {
		return pmstMPHRepository.findByMphCode(mphCode);
	}
	
	public void insertIntoMembers(String licId, String policyId, String memberStatus, String fatherName, String firstName, String lastName, int categoryNo, boolean isActive, boolean isZeroId) {
		pmstMPHRepository.insertIntoMembers(licId, policyId, memberStatus, fatherName, firstName, lastName, categoryNo, isActive, isZeroId);
	}
	
	public Optional<Members> getMemberByLicId(String licId) {
		return pmstMPHRepository.findById(licId);
	}
	
	public void updateMember(Members member) {
		pmstMPHRepository.save(member);
	}
	
	public void deleteMember(String licId) {
		pmstMPHRepository.deleteById(licId);
	}
	
}