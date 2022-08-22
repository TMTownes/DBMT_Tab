package com.gardens.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gardens.model.restaurantModel;
import com.gardens.service.RestaurantService;

@Controller(value= "restController")
@RequestMapping(path= "/restaurant")
public class RestaurantController {
	
	private RestaurantService restService;
	
	@GetMapping(path= "/allrestaurants")
	public List<restaurantModel> findAllRestaurants(){
		return this.restService.findAllRestaurants();
	}
	
	@GetMapping(path= "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<restaurantModel> findById(@PathVariable int id){
		return new ResponseEntity<restaurantModel>(this.restService.findById(id), HttpStatus.OK);
	}
	
	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody restaurantModel restaursant) {
		this.restService.save(restaursant);
	}
	
	@GetMapping(path= "/deleter/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable int restid) {
		this.deleteById(restid);
	}

}
