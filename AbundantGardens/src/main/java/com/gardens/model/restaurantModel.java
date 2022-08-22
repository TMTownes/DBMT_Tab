package com.gardens.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Table(name= "restaurants")
public class restaurantModel {

	@Id
	@Column(name= "restId")
	@GeneratedValue(generator ="households_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "households_id_seq")
	private int restid;
	
	@Column(name= "restName")
	private String restname;
	
	@Column(name= "category")
	private String category;
	
	@Column(name= "address")
	private String address;
	
	@Column(name ="contact")
	private String contact;
	
	@Column(name= "food")
	private int food;
	
	

	
	

}