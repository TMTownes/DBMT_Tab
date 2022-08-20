package com.garden.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garden.model.hhModel;

public interface hhRepository extends JpaRepository<hhModel, Integer>{
	
	List<hhModel> findAllhh();
	
	<S extends hhModel>  S save(S entity);
	
	hhModel manageInvitation();
	
	hhModel pickupMeal();
	
	hhModel rateRestaurant();
	
	hhModel findByCaseNum(int caseNum);
	
	List<hhModel> findByStatus();

}
