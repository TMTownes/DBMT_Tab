package com.garden.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.garden.model.restaurantModel;

@Repository
public interface restaurantRepository extends JpaRepository<restaurantModel, Integer>{
	
	List<restaurantModel> findAllRestaurants();
	
	<S extends restaurantModel> S save(restaurantModel restaurant);
	
	@Query("delete r from restaurants r where r.restId = ?1")
	void deleteById(int id);
	
	@Query("select r from restaurants r where r.restId = ?1")
	restaurantModel findById(int id);
	
	restaurantModel insertFood(int food);
	
	restaurantModel openQueue();
	
	restaurantModel closeQueue();
	
	restaurantModel sendInvitation();
	

}
