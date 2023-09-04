package com.lic.package.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.MphMaster;
import com.lic.package.repository.MphMasterRepository;

@Service
public class MphMasterService {
 
    @Autowired
    private MphMasterRepository mphMasterRepository;
 
    public List<MphMaster> getAllMphMaster(){
        return mphMasterRepository.findAll();
    }
 
    public Optional<MphMaster> getMphMasterById(Long mphId){
        return mphMasterRepository.findById(mphId);
    }
 
    public MphMaster getMphMasterByAlternatePAN(String alternatePAN){
        return mphMasterRepository.findByAlternatePAN(alternatePAN);
    }
 
    public MphMaster getMphMasterByCin(String cin){
        return mphMasterRepository.findByCin(cin);
    }
 
    public MphMaster getMphMasterByCountryCode(String countryCode){
        return mphMasterRepository.findByCountryCode(countryCode);
    }
 
    public List<MphMaster> getMphMasterNotInTempMaster(){
        return mphMasterRepository.findMphIdNotInTempMaster();
    }
 
    public List<MphMaster> getMphMasterNotInTempBank(){
        return mphMasterRepository.findMphIdNotInTempBank();
    }
 
    public List<MphMaster> getMphMasterNotInTempRepresentatives(){
        return mphMasterRepository.findMphIdNotInTempRepresentatives();
    }
 
    public List<MphMaster> getMphMasterNotInTempAddress(){
        return mphMasterRepository.findMphIdNotInTempAddress();
    }
 
    public List<MphMaster> getMphMasterInTempMaster(){
        return mphMasterRepository.findMphIdInTempMaster();
    }
 
    public List<MphMaster> getMphMasterInTempBank(){
        return mphMasterRepository.findMphIdInTempBank();
    }
 
    public List<MphMaster> getMphMasterInTempRepresentatives(){
        return mphMasterRepository.findMphIdInTempRepresentatives();
    }
 
    public List<MphMaster> getMphMasterInTempAddress(){
        return mphMasterRepository.findMphIdInTempAddress();
    }
 
    public MphMaster addMphMaster(MphMaster mphMaster){
        return mphMasterRepository.save(mphMaster);
    }
 
    public MphMaster updateMphMaster(MphMaster mphMaster){
        return mphMasterRepository.save(mphMaster);
    }
 
    public void deleteMphMaster(MphMaster mphMaster){
        mphMasterRepository.delete(mphMaster);
    }
 
    public void deleteMphMasterById(Long mphId){
        mphMasterRepository.deleteById(mphId);
    }
}