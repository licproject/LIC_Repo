import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.package.repository.PMST_MPH;
import com.lic.package.repository.Members;

public interface PolicyRepository extends JpaRepository<PMST_MPH, Long> {
    @Query("SELECT pmstMph from PMST_MPH pmstMph WHERE pmstMph.mphCode = :mphCode")
    PMST_MPH getByMphCode(@Param("mphCode") String mphCode);
  
    @Query("INSERT INTO Members(mphCode, data1, data2, data3) SELECT mphCode, data1, data2, data3 FROM PMST_MPH WHERE mphCode = :mphCode")
    void insertPolicyDataIntoMembers(@Param("mphCode") String mphCode);
}