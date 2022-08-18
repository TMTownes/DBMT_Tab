package com.garden.repository;

import java.util.List;
import com.garden.model.hhModel;

public interface hhRepository {
	
	List<hhModel> findAllhh();
	
	void save(hhModel househould);
	
	hhModel manageInvitation();
	
	hhModel pickupMeal();
	
	hhModel rateRestaurant();
	

}
