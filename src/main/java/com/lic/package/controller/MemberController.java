package com.lic.package.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.Member;
import com.lic.package.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	// Create
	@PostMapping("/add")
	public Member save(@RequestBody Member member) {
		return memberService.save(member);
	}
	
	// Read 
	@GetMapping("/id/{id}")
	public Member findById(@PathVariable int id) {
		return memberService.findById(id);
	}
	
	@GetMapping("/aadharNumber/{aadharNumber}")
	public Member findByAadharNumber(@PathVariable String aadharNumber) {
		return memberService.findByAadharNumber(aadharNumber);
	}
	
	@GetMapping("/all")
	public List<Member> findAll() {
		return memberService.findAll();
	}
	
	// Update
	@PutMapping("/update")
	public int updateMember(@RequestBody Member member) {
		return memberService.updateMember(member.getMemberId(), member.getCategoryNo(), member.getCommunicationPreference(), member.getDateOfBirth(), member.getDateOfJoining(), member.getDateOfJoiningScheme(), member.getDateOfRetirement(), member.getDesignation(), member.getEmailId(), member.getFatherName(), member.getFirstName(), member.getGender(), member.getIsActive(), member.getIsZeroId(), member.getLandlineNo(), member.getLanguagePreference(), member.getLastName(), member.getLicId(), member.getMaritalStatus(), member.getMemberPan(), member.getMemberStatus(), member.getMembershipNumber(), member.getMiddleName(), member.getMobileNo(), member.getPolicyId(), member.getSpouseName(), member.getTypeOfMembership());
	}
	
	// Delete
	@DeleteMapping("/delete/id/{id}")
	public void deleteById(@PathVariable int id) {
		memberService.deleteById(id);
	}
	
	@DeleteMapping("/delete/aadharNumber/{aadharNumber}")
	public int deleteByAadharNumber(@PathVariable String aadharNumber) {
		return memberService.deleteByAadharNumber(aadharNumber);
	}
	
}