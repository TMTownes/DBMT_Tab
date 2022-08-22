package com.gardens.service;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gardens.model.restaurantModel;
import com.gardens.repository.RestaurantRepository;

@Service("restaurantService")
public class RestaurantService {
	
//	@Autowired
	private RestaurantRepository restRepo;
	
	public RestaurantService() {
		
	}
	
	public List<restaurantModel> findAllRestaurants(){
		return this.restRepo.findAllRestaurants();
		
	}
	
	public restaurantModel save(restaurantModel restaurant) {
		return this.restRepo.save(restaurant);
	}
	
	public void deleteById (int restid) {
		this.restRepo.deleteById(restid);
	}
	
	public restaurantModel findById(int restid) {
		return this.restRepo.findById(restid);
	}
	
	public restaurantModel insertFood(int food) {
		return this.restRepo.insertFood(food);
	}
	
	public restaurantModel openQueue() {
		return this.restRepo.openQueue();
	}
	
	public restaurantModel closeQueue() {
		return this.restRepo.closeQueue();
	}
	
	public restaurantModel sendInvitation() {
		return this.restRepo.sendInvitation();
	}

}
