package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MembersRepository extends JpaRepository<Members, Long> {

    @Query("SELECT m FROM Members m WHERE m.POLICY_ID = :policyId 
        AND m.IS_ACTIVE = 1 
        AND m.IS_ZEROID = 0 
        AND (m.LIC_ID IS NOT NULL OR m.MEMBER_STATUS IS NOT NULL OR m.FATHER_NAME IS NOT NULL OR m.FIRST_NAME IS NOT NULL OR m.LAST_NAME IS NOT NULL OR m.CATEGORY_NO IS NOT NULL) 
        ORDER BY 
            CASE WHEN :orderBy = 1 THEN m.MEMBER_ID 
            WHEN :orderBy = 11 THEN m.MEMBER_ID DESC 
            WHEN :orderBy = 2 THEN m.LIC_ID 
            WHEN :orderBy = 12 THEN m.LIC_ID DESC 
            WHEN :orderBy = 3 THEN m.MEMBER_STATUS 
            WHEN :orderBy = 13 THEN m.MEMBER_STATUS DESC 
            WHEN :orderBy = 4 THEN m.FATHER_NAME 
            WHEN :orderBy = 14 THEN m.FATHER_NAME DESC 
            WHEN :orderBy = 5 THEN m.FIRST_NAME 
            WHEN :orderBy = 15 THEN m.FIRST_NAME DESC 
            WHEN :orderBy = 6 THEN m.LAST_NAME 
            WHEN :orderBy = 16 THEN m.LAST_NAME DESC 
            WHEN :orderBy = 7 THEN m.CATEGORY_NO 
            WHEN :orderBy = 17 THEN m.CATEGORY_NO DESC 
            WHEN :orderBy = 8 THEN m.POLICY_ID 
            WHEN :orderBy = 18 THEN m.POLICY_ID DESC 
            END 
        LIMIT 10 OFFSET :rowNo")
    List<Members> getMembersByPolicyId(@Param("policyId") Long policyId,
                                      @Param("orderBy") Integer orderBy,
                                      @Param("rowNo") Integer rowNo);

    @Query("SELECT COUNT(m.MEMBER_ID) FROM Members m WHERE m.POLICY_ID = :policyId AND m.IS_ACTIVE = 1 AND m.IS_ZEROID = 0 AND (m.LIC_ID IS NOT NULL OR m.MEMBER_STATUS IS NOT NULL OR m.FATHER_NAME IS NOT NULL OR m.FIRST_NAME IS NOT NULL OR m.LAST_NAME IS NOT NULL OR m.CATEGORY_NO IS NOT NULL)")
    Integer getTotalMembersByPolicyId(@Param("policyId") Long policyId);
}