package com.lic.package.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.MphMaster;
import com.lic.package.repository.MphMasterRepository;
import com.lic.package.service.MphMasterService;

@RestController
@RequestMapping("/api/mphmaster")
public class MphMasterController {
 
    @Autowired
    private MphMasterService mphMasterService;
 
    // Get all Policy Details
    @GetMapping("/all")
    public List<MphMaster> getAllMphMaster(){
        return mphMasterService.getAllMphMaster();
    }
 
    // Get Policy Details By ID
    @GetMapping("/{mphId}")
    public Optional<MphMaster> getMphMasterById(@PathVariable Long mphId){
        return mphMasterService.getMphMasterById(mphId);
    }
 
    // Get Policy Details By Alternate PAN
    @GetMapping("/alternatePAN/{alternatePAN}")
    public MphMaster getMphMasterByAlternatePAN(@PathVariable String alternatePAN){
        return mphMasterService.getMphMasterByAlternatePAN(alternatePAN);
    }
 
    // Get Policy Details By CIN
    @GetMapping("/cin/{cin}")
    public MphMaster getMphMasterByCin(@PathVariable String cin){
        return mphMasterService.getMphMasterByCin(cin);
    }
 
    // Get Policy Details By Country Code
    @GetMapping("/countryCode/{countryCode}")
    public MphMaster getMphMasterByCountryCode(@PathVariable String countryCode){
        return mphMasterService.getMphMasterByCountryCode(countryCode);
    }
 
    // Get Policy Details Not In Temp Master
    @GetMapping("/notInTempMaster")
    public List<MphMaster> getMphMasterNotInTempMaster(){
        return mphMasterService.getMphMasterNotInTempMaster();
    }
 
    // Get Policy Details Not In Temp Bank
    @GetMapping("/notInTempBank")
    public List<MphMaster> getMphMasterNotInTempBank(){
        return mphMasterService.getMphMasterNotInTempBank();
    }
 
    // Get Policy Details Not In Temp Representatives
    @GetMapping("/notInTempRepresentatives")
    public List<MphMaster> getMphMasterNotInTempRepresentatives(){
        return mphMasterService.getMphMasterNotInTempRepresentatives();
    }
 
    // Get Policy Details Not In Temp Address
    @GetMapping("/notInTempAddress")
    public List<MphMaster> getMphMasterNotInTempAddress(){
        return mphMasterService.getMphMasterNotInTempAddress();
    }
 
    // Get Policy Details In Temp Master
    @GetMapping("/inTempMaster")
    public List<MphMaster> getMphMasterInTempMaster(){
        return mphMasterService.getMphMasterInTempMaster();
    }
 
    // Get Policy Details In Temp Bank
    @GetMapping("/inTempBank")
    public List<MphMaster> getMphMasterInTempBank(){
        return mphMasterService.getMphMasterInTempBank();
    }
 
    // Get Policy Details In Temp Representatives
    @GetMapping("/inTempRepresentatives")
    public List<MphMaster> getMphMasterInTempRepresentatives(){
        return mphMaster