package com.garden.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garden.model.restaurantModel;

public interface restaurantRepository extends JpaRepository<restaurantModel, Integer>{
	
	List<restaurantModel> findAllRestaurants();
	
	<S extends restaurantModel> S save(restaurantModel restaurant);
	
	void deleteById(int id);
	
	restaurantModel findById();
	
	restaurantModel insertFood(int food);
	
	restaurantModel openQueue();
	
	restaurantModel closeQueue();
	

}
