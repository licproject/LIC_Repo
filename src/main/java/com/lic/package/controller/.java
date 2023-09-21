bi.setModifiedOn(new Date());
		return policyRepository.save(bi);
	}
	
	public BankInformation getBankInformationById(Long bankId) {
		Optional<BankInformation> bankInformation = policyRepository.findById(bankId);
		if (bankInformation.isPresent()) {
			return bankInformation.get();
		}
		return null;
	}
	
	public List<BankInformation> getAllBankInformations() {
		return policyRepository.findAll();
	}
	
	// For Nominees (POLICY_SRV_MBR_NOMI)
	public Nominee createNominee(Nominee n) {
		n.setCreatedBy("systemAdmin");
		n.setCreatedOn(new Date());
		n.setModifiedBy("systemAdmin");
		n.setModifiedOn(new Date());
		return policyRepository.save(n);
	}
	
	public Nominee updateNominee(Long nomineeId, Nominee n) {
		Optional<Nominee> nominee = policyRepository.findById(nomineeId);
		if (nominee.isPresent()) {
			n.setNomineeId(nomineeId);
			n.setModifiedBy("systemAdmin");
			n.setModifiedOn(new Date());
			return policyRepository.save(n);
		}
		return null;
	}
	
	public Nominee getNomineeById(Long nomineeId) {
		Optional<Nominee> nominee = policyRepository.findById(nomineeId);
		if (nominee.isPresent()) {
			return nominee.get();
		}
		return null;
	}
	
	public List<Nominee> getAllNominees() {
		return policyRepository.findAll();
	}
	
	// For Appointees (POLICY_SRV_MBR_APOTE)
	public Appointee createAppointee(Appointee a) {
		a.setCreatedBy("systemAdmin");
		a.setCreatedOn(new Date());
		a.setModifiedBy("systemAdmin");
		a.setModifiedOn(new Date());
		return policyRepository.save(a);
	}
	
	public Appointee updateAppointee(Long appointeeId, Appointee a) {
		Optional<Appointee> appointee = policyRepository.findById(appointeeId);
		if (appointee.isPresent()) {
			a.setAppointeeId(appointeeId);
			a.setModifiedBy("systemAdmin");
			a.setModifiedOn(new Date());
			return policyRepository.save(a);
		}
		return null;
	}
	
	public Appointee getAppointeeById(Long appointeeId) {
		Optional<Appointee> appointee = policyRepository.findById(appointeeId);
		if (appointee.isPresent()) {
			return appointee.get();
		}
		return null;
	}
	
	public List<Appointee> getAllAppointees() {
		return policyRepository.findAll();
	}
}

package com.lic.package.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.