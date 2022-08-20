package com.garden.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.model.hhModel;
import com.garden.repository.hhRepository;

@Service("hhService")
public class hhService {
	
	@Autowired
	private hhRepository hhRepo;
	
	public hhService() {
		
	}

	public List<hhModel> findAllhh() {
		
		return this.hhRepo.findAllhh();
	}
	
	public hhModel findByCaseNum(int caseNum) {
		
		return this.hhRepo.findByCaseNum(caseNum);
	}
	
	public void save(hhModel household) {
		
		this.hhRepo.save(household);
	}
	
	public hhModel manageInvitation() {
		
		return this.hhRepo.manageInvitation();
	}
	
	public hhModel pickupMeal() {
		
		return this.hhRepo.pickupMeal();
	}
	
	public hhModel rateRestaurant() {
		
		return this.hhRepo.rateRestaurant();
	}
	
	public List<hhModel> findByStatus() {
		
		return this.hhRepo.findByStatus();
	}
}
