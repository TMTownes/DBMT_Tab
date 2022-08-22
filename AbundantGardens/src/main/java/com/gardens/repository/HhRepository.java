package com.gardens.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gardens.model.hhModel;

public interface HhRepository extends JpaRepository<hhModel, Integer>{

	
	hhModel findById(int hhid);
	
	List<hhModel> findAllhh();
	
	<S extends hhModel> S save(S entity);
	
	hhModel manageInvitation();
	
	hhModel pickupMeal();
	
	hhModel rateRestaurant();
	
	hhModel findByCasenum(String casenum);
	
	List<hhModel> findByStatus(String status);
	
	
}
