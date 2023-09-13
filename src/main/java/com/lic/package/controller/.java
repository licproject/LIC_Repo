Solution: Saving Member Details:INSERT INTO POLICY_SRV_MBR (MEMBER_ID, AADHAR_NUMBER, CATEGORY_NO, COMMUNICATION_PREFERENCE, CREATED_BY, CREATED_ON, DATE_OF_BIRTH, DATE_OF_JOINING, DATE_OF_JOINING_SCHEME, DATE_OF_RETIREMENT, DESIGNATION, EMAILID, FATHER_NAME, FIRST_NAME, GENDER, IS_ACTIVE, IS_ZEROID, LANDLINE_NO, LANGUAGE_PREFERENCE, LAST_NAME, LIC_ID, MARITAL_STATUS, MEMBER_PAN, MEMBER_STATUS, MEMBERSHIP_NUMBER, MIDDLE_NAME, MOBILE_NO, MODIFIED_BY, MODIFIED_ON, POLICY_IDS, SPOUSE_NAME, TYPE_OF_MEMBERSHIP)VALUES (:memberId, :aadharNumber, :categoryNo, :communicationPreference, :createdBy, :createdOn, :dateOfBirth, :dateOfJoining, :dateOfJoiningScheme, :dateOfRetirement, :designation, :emailId, :fatherName, :firstName, :gender, :isActive, :isZeroId, :landlineNo, :languagePreference, :lastName, :licId, :maritalStatus, :memberPan, :memberStatus, :membershipNumber, :middleName, :mobileNo, :modifiedBy, :modifiedOn, :policyIds, :spouseName, :typeOfMembership);Updating Member Details:UPDATE POLICY_SRV_MBR SET AADHAR_NUMBER = :aadharNumber, CATEGORY_NO = :categoryNo, COMMUNICATION_PREFERENCE = :communicationPreference, CREATED_BY = :createdBy, CREATED_ON = :createdOn, DATE_OF_BIRTH = :dateOfBirth, DATE_OF_JOINING = :dateOfJoining, DATE_OF_JOINING_SCHEME = :dateOfJoiningScheme, DATE_OF_RETIREMENT = :dateOfRetirement, DESIGNATION = :designation, EMAILID = :emailId, FATHER_NAME = :fatherName, FIRST_NAME = :firstName, GENDER = :gender, IS_ACTIVE = :isActive, IS_ZEROID = :isZeroId, LANDLINE_NO = :landlineNo, LANGUAGE_PREFERENCE = :languagePreference, LAST_NAME = :lastName, LIC_ID = :licId, MARITAL_STATUS = :maritalStatus, MEMBER_PAN = :memberPan, MEMBER_STATUS = :memberStatus, MEMBERSHIP_NUMBER = :membershipNumber, MIDDLE_NAME = :middleName, MOBILE_NO = :mobileNo, MODIFIED_BY = :modifiedBy, MODIFIED_ON = :modifiedOn, POLICY_IDS = :policyIds, SPOUSE_NAME = :spouseName, TYPE_OF_MEMBERSHIP = :typeOfMembershipWHERE MEMBER_ID = :memberId;Saving Member Address:INSERT INTO POLICY_SRV_MBR_ADD (MEMBER_ADDITION_ID, CREATED_BY, CREATED_ON, EMPLOYEE_CONTRIBUTION, EMPLOYER_CONTRIBUTION, IS_ACTIVE, LINE_OF_BUSINESS, MEMBER_ADDITION_STATUS, MODIFIED_BY, MODIFIED_ON, MPH_CODE, MPH_NAME, POLICY_ID, POLICY_MBR_NO, POLICY_NUMBER, POLICY_STATUS, PRODUCT, REJECTION_REASON_CODE, REJECTION_REMARKS, SERVICE_ID, SERVICE_NUMBER, SERVICE_STATUS, TOTAL_CONTRIBUTION, UNIT_CODE, VOLUNTARY_CONTRIBUTION, NO_OF_CATEGORY) VALUES (:memberAdditionId, :createdBy, :createdOn, :employeeContribution, :employerContribution, :isActive, :lineOfBusiness, :memberAdditionStatus, :modifiedBy, :modifiedOn, :mphCode, :mphName, :policyId, :policyMbrNo, :policyNumber, :policyStatus, :product,