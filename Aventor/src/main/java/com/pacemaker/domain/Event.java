package com.pacemaker.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Event implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2267083375699368606L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	@NotEmpty(message="Please provide an Event")	
	private String event;
	
	@Column	
	private String description;
	
	@Column
	@NotEmpty(message="Please provide a start date")
	private String start;
	
	@Column	
	private String end;

}
