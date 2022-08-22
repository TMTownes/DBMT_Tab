package com.gardens.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gardens.model.restaurantModel;

public interface RestaurantRepository extends JpaRepository<restaurantModel, Integer>{

	restaurantModel findById(int restid);
	
	List<restaurantModel> findAllRestaurants();
	
	<S extends restaurantModel> S save(restaurantModel restaurant);
	
	void deleteById(int restid);
	
	restaurantModel insertFood(int food);
	
	restaurantModel openQueue();
	
	restaurantModel closeQueue();
	
	restaurantModel sendInvitation();
}
