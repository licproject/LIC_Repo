package com.lic.package.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.entity.PMST_MPH;
import com.lic.package.entity.Members;
import com.lic.package.service.PMST_MPHService;

@RestController
@RequestMapping("/pms/members")
public class PMST_MPHController {
	
	@Autowired
	private PMST_MPHService pmstMphService;
	
	@GetMapping("/mph/{mphCode}")
	public ResponseEntity<PMST_MPH> findByMphCode(@PathVariable("mphCode") String mphCode) {
		PMST_MPH pmstMph = pmstMphService.findByMphCode(mphCode);
		
		if(pmstMph == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(pmstMph, HttpStatus.OK);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<Void> insertIntoMembers(@RequestBody PMST_MPH pmstMph) {
		if(pmstMph == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		pmstMphService.insertIntoMembers(pmstMph.getLicId(), pmstMph.getPolicyId(), pmstMph.getMemberStatus(), pmstMph.getFatherName(), pmstMph.getFirstName(), pmstMph.getLastName(), pmstMph.getCategoryNo(), pmstMph.getIsActive(), pmstMph.getIsZeroId());
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/licId/{licId}")
	public ResponseEntity<Members> getMemberByLicId(@PathVariable("licId") String licId) {
		Optional<Members> member = pmstMphService.getMemberByLicId(licId);
		
		if(!member.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(member.get(), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Void> updateMember(@RequestBody Members member) {
		if(member == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		pmstMphService.updateMember(member);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<Void> deleteMember(@RequestBody String licId) {
		if(licId == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		pmstMphService.deleteMember(licId);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}