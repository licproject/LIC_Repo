for the above entity

package com.lic.package.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.entity.Member;
import com.lic.package.repository.MemberRepository;

@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberRepository memberRepository;

	// Inserting an Individual Member
	@PostMapping("/insert")
	public Member insertIndividualMember(@RequestBody Member member) {
		member.setCreatedOn(LocalDateTime.now());
		member.setModifiedOn(LocalDateTime.now());
		member.setIsActive(true);
		member.setIsZeroId(false);
		return memberRepository.save(member);
	}
	
	// Inserting Multiple Members
	@PostMapping("/insert/multiple")
	public List<Member> insertMultipleMembers(@RequestBody List<Member> members) {
		for(Member member : members) {
			member.setCreatedOn(LocalDateTime.now());
			member.setModifiedOn(LocalDateTime.now());
			member.setIsActive(true);
			member.setIsZeroId(false);
		}
		return memberRepository.saveAll(members);
	}
	
	// Updating a Member
	@PutMapping("/update")
	public Member updateMember(@RequestBody Member member) {
		member.setModifiedOn(LocalDateTime.now());
		return memberRepository.save(member);
	}
	
	// Retrieving a Member
	@GetMapping("/get")
	public Member getMemberById(@RequestParam Long memberId) {
		return memberRepository.findById(memberId).orElse(null);
	}
	
	// Deleting a Member
	@DeleteMapping("/delete")
	public void deleteMember(@RequestParam Long memberId) {
		memberRepository.deleteById(memberId);
	}
	
	// Retrieving all Members
	@GetMapping("/get/all")
	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}

}