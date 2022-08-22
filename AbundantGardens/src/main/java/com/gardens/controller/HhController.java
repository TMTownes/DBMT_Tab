package com.gardens.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gardens.model.hhModel;
import com.gardens.service.HhService;

@Controller(value= "HhController")
@RequestMapping(path= "/hh")
public class HhController {
	
	@Autowired
	private HhService hhService;
	
	@GetMapping(path= "/all")
	@ResponseBody
	public List<hhModel> findAllhh(){
		return this.hhService.findAllhh();
	}
	
	@GetMapping(path= "/{casenum}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<hhModel> FindByCasenum(@PathVariable String casenum){
		return new ResponseEntity<hhModel>(this.hhService.findByCasenum(casenum),HttpStatus.OK);
	}
	
	@PostMapping(path= "/savehh", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody hhModel household) {
		this.hhService.save(household);
	}
	
	@GetMapping(path = "/status/{status}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<hhModel> findByStatus(@PathVariable String status){
		return this.hhService.findByStatus(status);
	}
	
	@GetMapping(path = "/id", produces = MediaType.APPLICATION_JSON_VALUE)
	public hhModel findById(@RequestParam int hhid) {
		return this.hhService.findById(hhid);
	}

}
