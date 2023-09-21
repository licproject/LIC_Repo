package com.lic.package.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.PolicySrvMbrNomi;
import com.lic.package.repository.PolicySrvMbrNomiRepository;

@Service
public class PolicySrvMbrNomiService {

  @Autowired
  private PolicySrvMbrNomiRepository policySrvMbrNomiRepository;

  public PolicySrvMbrNomi saveNominee(PolicySrvMbrNomi policySrvMbrNomi) {
    return policySrvMbrNomiRepository.save(policySrvMbrNomi);
  }

  public PolicySrvMbrNomi updateNominee(PolicySrvMbrNomi policySrvMbrNomi) {
    return policySrvMbrNomiRepository.save(policySrvMbrNomi);
  }

  public PolicySrvMbrNomi findByNomineeId(Integer nomineeId) {
    return policySrvMbrNomiRepository.findByNomineeId(nomineeId);
  }

}