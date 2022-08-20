package com.garden.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.model.restaurantModel;
import com.garden.repository.restaurantRepository;

@Service("restaurantService")
public class restaurantService {
	
	@Autowired
	private restaurantRepository restaurantRepo;
	
	public restaurantService() {
		
	}
	
	
	public List<restaurantModel> findAllRestaurants() {
		
		return this.restaurantRepo.findAllRestaurants();
	}
	
	public restaurantModel save(restaurantModel restaurant) {
		
		return this.restaurantRepo.save(restaurant);
	}
	
	public void deleteById(int id) {
		
		this.restaurantRepo.deleteById(id);;
	}
	
	public restaurantModel findById(int id) {
		
		return this.restaurantRepo.findById(id);
	}

	public restaurantModel insertFood(int food) {
		
		return this.restaurantRepo.insertFood(food);
	}
	
	public restaurantModel openQueue() {
		
		return this.restaurantRepo.openQueue();
	}
	
	public restaurantModel closeQueue() {
		
		return this.restaurantRepo.closeQueue();
	}
	
	public restaurantModel sendInvitation() {
		
		return this.restaurantRepo.sendInvitation();
	}
}
