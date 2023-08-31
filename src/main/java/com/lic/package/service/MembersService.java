package com.lic.package.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.package.model.Members;
import com.lic.package.repository.MembersRepository;

@Service
public class MembersService {
    
    @Autowired
    private MembersRepository membersRepository;

    public List<Members> getMembersByPolicyId(Long policyId, Integer orderBy, Integer rowNo) {
        return membersRepository.getMembersByPolicyId(policyId, orderBy, rowNo);
    }

    public Integer getTotalMembersByPolicyId(Long policyId) {
        return membersRepository.getTotalMembersByPolicyId(policyId);
    }
}