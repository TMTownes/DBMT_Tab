package com.garden.service;

// import java.util.Collections;
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
		
		return this.hhRepo.findAll();
	}
	
	public hhModel findByCaseNum(String casenum) {
		
		return this.hhRepo.findByCaseNum(casenum);
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
	
	public List<hhModel> findByStatus(String status) {
		
		return this.hhRepo.findByStatus(status);
	}
	
	public hhModel findById(int id) {
		
		return this.hhRepo.findById(id);
	}
}
