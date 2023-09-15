MBR_ADD> findByPOLICY_ID(Long POLICY_ID) {
        return memberAddressRepository.findByPOLICY_ID(POLICY_ID);
    }

    public List<POLICY_SRV_MBR_ADD> findByPOLICY_NUMBER(String POLICY_NUMBER) {
        return memberAddressRepository.findByPOLICY_NUMBER(POLICY_NUMBER);
    }

    public List<POLICY_SRV_MBR_ADD> findByPOLICY_STATUS(String POLICY_STATUS) {
        return memberAddressRepository.findByPOLICY_STATUS(POLICY_STATUS);
    }

    public List<POLICY_SRV_MBR_ADD> findByPRODUCT(String PRODUCT) {
        return memberAddressRepository.findByPRODUCT(PRODUCT);
    }

    public List<POLICY_SRV_MBR_ADD> findByREJECTION_REASON_CODE(String REJECTION_REASON_CODE) {
        return memberAddressRepository.findByREJECTION_REASON_CODE(REJECTION_REASON_CODE);
    }

    public List<POLICY_SRV_MBR_ADD> findBySERVICE_ID(Long SERVICE_ID) {
        return memberAddressRepository.findBySERVICE_ID(SERVICE_ID);
    }

    public List<POLICY_SRV_MBR_ADD> findBySERVICE_NUMBER(String SERVICE_NUMBER) {
        return memberAddressRepository.findBySERVICE_NUMBER(SERVICE_NUMBER);
    }

    public List<POLICY_SRV_MBR_ADD> findBySERVICE_STATUS(String SERVICE_STATUS) {
        return memberAddressRepository.findBySERVICE_STATUS(SERVICE_STATUS);
    }

    public List<POLICY_SRV_MBR_ADD> findByTOTAL_CONTRIBUTION(String TOTAL_CONTRIBUTION) {
        return memberAddressRepository.findByTOTAL_CONTRIBUTION(TOTAL_CONTRIBUTION);
    }

    public List<POLICY_SRV_MBR_ADD> findByUNIT_CODE(String UNIT_CODE) {
        return memberAddressRepository.findByUNIT_CODE(UNIT_CODE);
    }

    public List<POLICY_SRV_MBR_ADD> findByVOLUNTARY_CONTRIBUTION(String VOLUNTARY_CONTRIBUTION) {
        return memberAddressRepository.findByVOLUNTARY_CONTRIBUTION(VOLUNTARY_CONTRIBUTION);
    }

    public List<POLICY_SRV_MBR_ADD> findByNO_OF_CATEGORY(String NO_OF_CATEGORY) {
        return memberAddressRepository.findByNO_OF_CATEGORY(NO_OF_CATEGORY);
    }

    @Transactional
    public void updateMemberAddress(Long MEMBER_ADDITION_ID, String CREATED_BY, String EMPLOYEE_CONTRIBUTION, String EMPLOYER_CONTRIBUTION, String IS_ACTIVE, String LINE_OF_BUSINESS, String MEMBER_ADDITION_STATUS, String MODIFIED_BY, String MPH_CODE, String MPH_NAME, Long POLICY_ID, String POLICY_MBR_NO, String POLICY_NUMBER, String POLICY_STATUS, String PRODUCT, String REJECTION_REASON_CODE, String REJECTION_REMARKS, Long SERVICE_ID, String SERVICE_NUMBER, String SERVICE_STATUS, String TOTAL_CONTRIBUTION, String UNIT_CODE, String VOLUNTARY_CONTRIBUTION, String NO_OF_CATEGORY) {
        memberAddressRepository.updateMemberAddress(MEMBER_ADDITION_ID, CREATED_BY, EMPLOYEE_CONTRIBUTION, EMPLOYER_CONTRIBUTION, IS_ACTIVE, LINE_OF_BUSINESS, MEMBER_ADDITION_STATUS, MODIFIED_BY, MPH_CODE, MPH_NAME, POLICY_ID, POLICY_MBR_NO, POLICY_