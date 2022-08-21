package com.garden.repository;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.garden.model.hhModel;

@Entity
@Repository
public interface hhRepository extends JpaRepository<hhModel, Integer>{
	
	List<hhModel> findAllhh();
	
	<S extends hhModel>  S save(S entity);
	
	hhModel manageInvitation();
	
	hhModel pickupMeal();
	
	hhModel rateRestaurant();
	
	@Query(value = "select h from households h where h.caseNum = ?1")
	hhModel findByCaseNum(String casenum);
	
	@Query(value = "select h from households h where h.status = ?1")
	List<hhModel> findByStatus(String status);
	
	@Query(value = "select h from households h where h.hhId = ?1")
	hhModel findById(int id);

}
