Spring Boot Repository:

package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.package.model.PolicySrvMbrNomi;

@Repository
public interface PolicySrvMbrNomiRepository extends JpaRepository<PolicySrvMbrNomi, Integer> { 

  public PolicySrvMbrNomi findByNomineeId(Integer nomineeId);

  public PolicySrvMbrNomi save(PolicySrvMbrNomi policySrvMbrNomi);

  public PolicySrvMbrNomi update(PolicySrvMbrNomi policySrvMbrNomi);

}