package com.garden.controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garden.model.restaurantModel;
import com.garden.service.restaurantService;

// @RestController("restaurantController")
// @Entity
@Controller(value = "restaurantController")
@RequestMapping(path = "/restaurant")
public class restaurantController {
	
	@Autowired
	private restaurantService restServ;
	
	@GetMapping(path = "/allrestaurants")
	public List<restaurantModel> findAllRestaurants() {
		
		return this.restServ.findAllRestaurants();
	}
	
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<restaurantModel> findById(@PathVariable int id) {
		
		return new ResponseEntity<restaurantModel>(this.restServ.findById(id), HttpStatus.OK);
	}
	
	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody restaurantModel restaurant) {
		this.restServ.save(restaurant);
	}
	
	@GetMapping(path = "/deleter/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable int id) {
		this.restServ.deleteById(id);
	}
}
