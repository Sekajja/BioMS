package com.pacemaker.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

import com.pacemaker.validation.ValidName;

@Entity
public class Kin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3684263039821426839L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	//PERSONAL INFORMATION
	
	@Column
	@NotEmpty(message="Please provide a first name")
	@ValidName(message = "No rockstar names, letters only. Except in the 'Othernames' field")
	private String firstname;
	
	@Column
	@NotEmpty(message="Oh come on, let us in on your family name!")
	@ValidName(message = "No rockstar names, letters only. Except in the 'Othernames' field")
	private String lastname;
	
	@Column	
	private String othernames;

	@Column
	@NotEmpty(message="Please provide relationship!")
	private String relationship;
	
	//Address Information
	@ElementCollection
	private Set<String> phonenumbers = new HashSet<String>(0);
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Address> addresses = new HashSet<Address>(0);

}
