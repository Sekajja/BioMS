package com.pacemaker.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5095967550367531934L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;		
	@Column
	private String description;	
	@Column
	private String county;	
	@Column
	private String country;
	@Column
	private String subcounty;	
	@Column
	private String district;	
	@Column
	private String village;			
	@Column
	private String postaladdress;
	@Column
	private String addressname;
	@ManyToOne
	private AventorUser user;
		
}
