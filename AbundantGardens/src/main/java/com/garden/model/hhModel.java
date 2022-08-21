package com.garden.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
// import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

// import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity

@Table(name = "households")
// @EntityListeners(AuditingEntityListener.class)
public class hhModel /* implements Serializable */{

	@Id
	@Column(name = "hhId")
	
	@GeneratedValue(generator = "hh_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "hh_id_seq")
	private int hhid;
    @Column(name = "caseNum")
    private String casenum;
    @Column(name = "caseName")
    private String casename;
    @Column(name = "casePassword")
    private String casepassword;
    @Column(name = "status")
    private String status;
    @Column(name = "penalties")
    private String penalities;
    
} // hhModel()