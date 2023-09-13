package com.lic.package.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.package.model.POLICY_SRV_MBR;
import com.lic.package.model.POLICY_SRV_MBR_ADD;
import com.lic.package.model.POLICY_SRV_MBR_BANK;
import com.lic.package.model.POLICY_SRV_MBR_NOMI;
import com.lic.package.model.POLICY_SRV_MBR_APOTE;

@Repository
public interface MemberRepository extends JpaRepository<POLICY_SRV_MBR, Long> {
	
	public POLICY_SRV_MBR save(POLICY_SRV_MBR member);

	public POLICY_SRV_MBR_ADD save(POLICY_SRV_MBR_ADD address);

	public POLICY_SRV_MBR_BANK save(POLICY_SRV_MBR_BANK bank);

	public POLICY_SRV_MBR_APOTE save(POLICY_SRV_MBR_APOTE appointee);

	public POLICY_SRV_MBR_NOMI save(POLICY_SRV_MBR_NOMI nominee);

	public POLICY_SRV_MBR update(POLICY_SRV_MBR member);

	public POLICY_SRV_MBR_ADD update(POLICY_SRV_MBR_ADD address);

	public POLICY_SRV_MBR_BANK update(POLICY_SRV_MBR_BANK bank);

	public POLICY_SRV_MBR_APOTE update(POLICY_SRV_MBR_APOTE appointee);

	public POLICY_SRV_MBR_NOMI update(POLICY_SRV_MBR_NOMI nominee);

}