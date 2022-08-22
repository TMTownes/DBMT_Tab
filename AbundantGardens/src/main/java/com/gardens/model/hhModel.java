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

@Table(name= "households")
public class hhModel {
	
	@Id
	@Column(name= "hhId")
	@GeneratedValue(generator ="households_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "households_id_seq")
	private int hhid;
	
	@Column(name= "case_name")
	private String casename;
	
	@Column(name= "case_number")
	private String casenum;
	
	@Column(name= "case_password")
	private String casepassword;
	
	@Column(name ="status")
	private String status;
	
	@Column(name= "penalties")
	private String penalties;
	

}
