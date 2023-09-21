package com.lic.package.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.PolicySrvMbrNomi;
import com.lic.package.service.PolicySrvMbrNomiService;

@RestController
public class PolicySrvMbrNomiController {

  @Autowired
  private PolicySrvMbrNomiService policySrvMbrNomiService;

  @PostMapping("/saveNominee")
  public PolicySrvMbrNomi saveNominee(@RequestBody PolicySrvMbrNomi policySrvMbrNomi) {
    return policySrvMbrNomiService.saveNominee(policySrvMbrNomi);
  }

  @PutMapping("/updateNominee")
  public PolicySrvMbrNomi updateNominee(@RequestBody PolicySrvMbrNomi policySrvMbrNomi) {
    return policySrvMbrNomiService.updateNominee(policySrvMbrNomi);
  }

  @PostMapping("/findByNomineeId")
  public PolicySrvMbrNomi findByNomineeId(Integer nomineeId) {
    return policySrvMbrNomiService.findByNomineeId(nomineeId);
  }

}