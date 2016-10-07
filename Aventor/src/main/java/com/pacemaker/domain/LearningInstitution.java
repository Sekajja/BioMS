package com.pacemaker.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	private String name;
	
	@Column
	private String location;
	
	@Column
	private String award;
	
	@Column
	private String year;
	
	@ManyToOne
	private BioData biodata;

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public BioData getBiodata() {
		return biodata;
	}

	public void setBiodata(BioData biodata) {
		this.biodata = biodata;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	
	
	/*
	 * For later
	 * 
	 * @ElementCollection
	private Set<String> studyfields = new HashSet<String>(0);
	 * */
	
	
	
	

}
