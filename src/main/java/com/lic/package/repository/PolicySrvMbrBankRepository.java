package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.package.entity.PolicySrvMbrBank;

@Repository
public interface PolicySrvMbrBankRepository extends JpaRepository<PolicySrvMbrBank, Long> {
    public PolicySrvMbrBank findByBankId(Long bankId);
    public PolicySrvMbrBank findByAccountNumber(String accountNumber);
    public PolicySrvMbrBank findByAccountType(String accountType);
    public PolicySrvMbrBank findByBankAddress(String bankAddress);
    public PolicySrvMbrBank findByBankBranch(String bankBranch);
    public PolicySrvMbrBank findByBankName(String bankName);
    public PolicySrvMbrBank findByConfirmAccountNumber(String confirmAccountNumber);
    public PolicySrvMbrBank findByCountryCode(String countryCode);
    public PolicySrvMbrBank findByCreatedBy(String createdBy);
    public PolicySrvMbrBank findByEmailId(String emailId);
    public PolicySrvMbrBank findByIfscCode(String ifscCode);
    public PolicySrvMbrBank findByIfscCodeAvailable(String ifscCodeAvailable);
    public PolicySrvMbrBank findByIsActive(String isActive);
    public PolicySrvMbrBank findByLandlineNumber(String landlineNumber);
    public PolicySrvMbrBank findByMemberId(Long memberId);
    public PolicySrvMbrBank findByPolicyId(Long policyId);
    public PolicySrvMbrBank findByStdCode(String stdCode);
}