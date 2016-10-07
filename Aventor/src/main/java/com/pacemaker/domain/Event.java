package com.pacemaker.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	private String event;
	
	@Column	
	private String description;
	
	@Column	
	private String eventstart;
	
	@Column	
	private String eventend;
	
	@ManyToOne
	private BioData biodata;
	
	
	
	public Event() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	public String getEventstart() {
		return eventstart;
	}

	public void setEventstart(String eventstart) {
		this.eventstart = eventstart;
	}

	public String getEventend() {
		return eventend;
	}

	public void setEventend(String eventend) {
		this.eventend = eventend;
	}

	public BioData getBiodata() {
		return biodata;
	}

	public void setBiodata(BioData biodata) {
		this.biodata = biodata;
	}
	
}
