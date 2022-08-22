package com.gardens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gardens.model.hhModel;
import com.gardens.repository.HhRepository;

@Service
public class HhService {

//	@Autowired
	private HhRepository hhRepo;
	
	public HhService() {
		
	}
	
	public hhModel findById(int hhid) {
		return this.hhRepo.findById(hhid);
	}
	
	public List<hhModel> findAllhh() {
		return this.hhRepo.findAllhh();
	}
	
	public hhModel findByCasenum(String casenum) {
		return this.hhRepo.findByCasenum(casenum);
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
	
	public List<hhModel> findByStatus(String status){
		return this.hhRepo.findByStatus(status);
	}
	
}
