Preference(String languagePreference) {
        return policySrvMbrRepository.findByLanguagePreference(languagePreference);
    }

    public Optional<PolicySrvMbr> findByLastName(String lastName) {
        return policySrvMbrRepository.findByLastName(lastName);
    }

    public Optional<PolicySrvMbr> findByLicId(String licId) {
        return policySrvMbrRepository.findByLicId(licId);
    }

    public Optional<PolicySrvMbr> findByMaritalStatus(String maritalStatus) {
        return policySrvMbrRepository.findByMaritalStatus(maritalStatus);
    }

    public Optional<PolicySrvMbr> findByMemberAdditionId(Long memberAdditionId) {
        return policySrvMbrRepository.findByMemberAdditionId(memberAdditionId);
    }

    public Optional<PolicySrvMbr> findByMemberPan(String memberPan) {
        return policySrvMbrRepository.findByMemberPan(memberPan);
    }

    public Optional<PolicySrvMbr> findByMemberStatus(String memberStatus) {
        return policySrvMbrRepository.findByMemberStatus(memberStatus);
    }

    public Optional<PolicySrvMbr> findByMembershipNumber(String membershipNumber) {
        return policySrvMbrRepository.findByMembershipNumber(membershipNumber);
    }

    public Optional<PolicySrvMbr> findByMiddleName(String middleName) {
        return policySrvMbrRepository.findByMiddleName(middleName);
    }

    public Optional<PolicySrvMbr> findByMobileNo(Long mobileNo) {
        return policySrvMbrRepository.findByMobileNo(mobileNo);
    }

    public Optional<PolicySrvMbr> findByModifiedBy(String modifiedBy) {
        return policySrvMbrRepository.findByModifiedBy(modifiedBy);
    }

    public Optional<PolicySrvMbr> findByModifiedOn(Timestamp modifiedOn) {
        return policySrvMbrRepository.findByModifiedOn(modifiedOn);
    }

    public Optional<PolicySrvMbr> findByPolicyId(Long policyId) {
        return policySrvMbrRepository.findByPolicyId(policyId);
    }

    public Optional<PolicySrvMbr> findBySpouseName(String spouseName) {
        return policySrvMbrRepository.findBySpouseName(spouseName);
    }

    public Optional<PolicySrvMbr> findByTypeOfMembership(String typeOfMembership) {
        return policySrvMbrRepository.findByTypeOfMembership(typeOfMembership);
    }

    public Optional<PolicySrvMbr> findByAnnuityOption(String annuityOption) {
        return policySrvMbrRepository.findByAnnuityOption(annuityOption);
    }

    public Optional<PolicySrvMbr> findByBatchId(Long batchId) {
        return policySrvMbrRepository.findByBatchId(batchId);
    }

    public Optional<PolicySrvMbr> findByCategory(Long category) {
        return policySrvMbrRepository.findByCategory(category);
    }

    public Optional<PolicySrvMbr> findByEmployeeContribution(Long employeeContribution) {
        return policySrvMbrRepository.findByEmployeeContribution(employeeContribution);
    }

    public Optional<PolicySrvMbr> findByEmployerContribution(Long employerContribution) {
        return policySrvMbrRepository.findByEmployerContribution(employerContribution);
    }

    public Optional<PolicySrvMbr> findByFrequency(Long frequency) {
        return policySrvMbrRepository.findByFrequency(frequency);
    }

    public Optional<PolicySrvMbr> findByMphCode(String mphCode) {
        return policySrvMbrRepository.findByMphCode(mphCode);