package com.pacemaker.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class LearningInstitution implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7781749632534922318L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	@NotEmpty(message="Please provide institution name!")
	private String name;
	
	@Column
	@NotEmpty(message="Please provide institution location!")
	private String location;
	
	@ElementCollection
	private Map<String, String> awardswithyears = new HashMap<String, String>(0);
		
	
	/*
	 * For later
	 * 
	 * @ElementCollection
	private Set<String> studyfields = new HashSet<String>(0);
	 * */
	

}
