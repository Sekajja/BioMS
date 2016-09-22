package com.pacemaker.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.pacemaker.validation.ValidName;

@Entity
public class BioData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4219691988998135831L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	//PERSONAL INFORMATION
	
	@Column
	private String photourl;
	
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
	@NotEmpty(message="Please provide gender!")
	private String gender;
	
	@Column
	@NotEmpty(message="Please provide gender!")
	private String nationality;
	
	@Column
	@NotEmpty(message="Please provide occupation!")
	private String occupation;
	
	@Column
	private String brief;
	
	
	@Column
	@NotEmpty(message="Please provide marital status!")
	private String maritalstatus;
	
	@Column
	@NotEmpty(message="Please provide religion!")
	private String religion;
	
	@Column
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull(message = "Please provide a birth date")
	@Past(message="Oh my Gosh, is this one from the future?")
	private Date birthday;
	
	@Column
	private String nextofkin;
	
	@Column
	private String nextofkinrelation;
	
	//Origin Information
	@Column
	@NotEmpty(message="Please provide district of origin!")
	private String origindistrict;	
	
	@Column
	@NotEmpty(message="Please provide district of origin!")
	private String tribe;	

	@Column
	@NotEmpty(message="Please provide language spoken at home!")
	private String homelanguage;
	
	@Column
	@NotEmpty(message="Please provide preffered language!")
	private String preferredlanguage;
	
	@ElementCollection
	private Map<String,String> languageproficiency = new HashMap<String,String>(0);
		
	//Education Background	
	@ManyToMany
	private Set<LearningInstitution> LearningInstitutions = new HashSet<LearningInstitution>(0);
	
	
	//Skills with description and chronological events and date
	@ElementCollection
	private Map<String,String> skills = new HashMap<String,String>(0);
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Event> events = new HashSet<Event>(0);
	
	//Phone Information
	@ElementCollection
	private Map<String,String> phonenumbers = new HashMap<String,String>(0);
	
	@ElementCollection
	private Map<String,String> nextofkinphonenumbers = new HashMap<String,String>(0);
	
	//Address Information
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Address> addresses = new HashSet<Address>(0);
	
	//Other Information
	@ElementCollection
	private Map<String,String> otherinformation = new HashMap<String,String>(0);
}
