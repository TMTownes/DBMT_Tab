package com.garden.repository;

import java.util.List;
import com.garden.model.restaurantModel;

public interface restaurantRepository {
	
	List<restaurantModel> findAllRestaurants();
	
	void save(restaurantModel restaurant);
	
	void deleteById(int id);
	
	restaurantModel findById();
	
	restaurantModel insertFood(int food);
	
	restaurantModel openQueue();
	
	restaurantModel closeQueue();
	

}
