package com.lic.package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.POLICY_SRV_MBR;
import com.lic.package.service.POLICY_SRV_MBRService;

@RestController
@RequestMapping("/policy_srv_mbr")
public class POLICY_SRV_MBRController {
    
    @Autowired
    private POLICY_SRV_MBRService policy_srv_mbrService;

    @PutMapping("/save")
    public POLICY_SRV_MBR save(@RequestBody POLICY_SRV_MBR member) {
        return policy_srv_mbrService.save(member);
    }
    
    @PutMapping("/update")
    public POLICY_SRV_MBR update(@RequestBody POLICY_SRV_MBR member) {
        return policy_srv_mbrService.update(member);
    }
    
    @GetMapping("/delete")
    public void deleteByMemberId(@RequestParam(value = "memberId") Long memberId) {
        policy_srv_mbrService.deleteByMemberId(memberId);
    }
    
    @GetMapping("/findByMemberId")
    public POLICY_SRV_MBR findByMemberId(@RequestParam(value = "memberId") Long memberId) {
        return policy_srv_mbrService.findByMemberId(memberId);
    }
    
    @GetMapping("/findByAadharNumber")
    public POLICY_SRV_MBR findByAadharNumber(@RequestParam(value = "aadharNumber") Long aadharNumber) {
        return policy_srv_mbrService.findByAadharNumber(aadharNumber);
    }
    
    @GetMapping("/findByCategoryNo")
    public POLICY_SRV_MBR findByCategoryNo(@RequestParam(value = "categoryNo") Long categoryNo) {
        return policy_srv_mbrService.findByCategoryNo(categoryNo);
    }
    
    @GetMapping("/findByCommunicationPreference")
    public POLICY_SRV_MBR findByCommunicationPreference(@RequestParam(value = "communicationPreference") String communicationPreference) {
        return policy_srv_mbrService.findByCommunicationPreference(communicationPreference);
    }
    
    @GetMapping("/findByCreatedBy")
    public POLICY_SRV_MBR findByCreatedBy(@RequestParam(value = "createdBy") String createdBy) {
        return policy_srv_mbrService.findByCreatedBy(createdBy);
    }
    
    @GetMapping("/findByCreatedOn")
    public POLICY_SRV_MBR findByCreatedOn(@RequestParam(value = "createdOn") String createdOn) {
        return policy_srv_mbrService.findByCreatedOn(createdOn);
    }
    
    @GetMapping("/findByDateOfBirth")
    public POLICY_SRV_MBR findByDateOfBirth(@RequestParam(value = "dateOfBirth") String dateOfBirth) {
        return policy_srv_mbrService.findByDateOfBirth(dateOfBirth);
    }
    
    @GetMapping("/findByDateOfJoining")
    public POLICY_SRV_MBR findByDateOfJoining(@RequestParam(value = "dateOfJoining") String dateOfJoining) {
        return policy_srv_mbrService.findByDateOfJoining(dateOfJoining);
    }
    
    @