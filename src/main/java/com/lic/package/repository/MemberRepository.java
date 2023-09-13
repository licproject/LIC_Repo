Solution:

package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.package.entity.PolicySrvMbr;
import com.lic.package.entity.PolicySrvMbrAdd;
import com.lic.package.entity.PolicySrvMbrBank;
import com.lic.package.entity.PolicySrvMbrNomi;
import com.lic.package.entity.PolicySrvMbrApote;

@Repository
public interface MemberRepository extends JpaRepository<PolicySrvMbr, Long> {

    //Saving Member Details
    void save(PolicySrvMbr policySrvMbr);

    //Updating Member Details
    void updateMember(Long memberId, PolicySrvMbr policySrvMbr);

    //Saving Member Address
    void saveAddress(PolicySrvMbrAdd policySrvMbrAdd);

    //Saving Member Bank Information
    void saveBank(PolicySrvMbrBank policySrvMbrBank);

    //Saving Member Appointee Information
    void saveAppointee(PolicySrvMbrApote policySrvMbrApote);

    //Saving Member Nominee Information
    void saveNominee(PolicySrvMbrNomi policySrvMbrNomi);

}