package com.pacemaker.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String photoname;
	
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
	@NotEmpty(message="Please provide a nationality!")
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
	
	//Skills with description and chronological events and date
	@ElementCollection
	private Map<String,String> skills = new HashMap<String,String>(0);	
	
	//Phone Information
	@ElementCollection
	private Map<String,String> phonenumbers = new HashMap<String,String>(0);
	
	@ElementCollection
	private Map<String,String> nextofkinphonenumbers = new HashMap<String,String>(0);	
	
	//Other Information
	@ElementCollection
	private Map<String,String> otherinformation = new HashMap<String,String>(0);

	//Education Background	
	@OneToMany(cascade = CascadeType.ALL)
	private List<LearningInstitution> learninginstitutions = new ArrayList<LearningInstitution>(0);
	
	//Address Information
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses = new ArrayList<Address>(0);
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Event> events = new ArrayList<Event>(0);
	
	public BioData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhotoname() {
		return photoname;
	}

	public void setPhotoname(String photoname) {
		this.photoname = photoname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getOthernames() {
		return othernames;
	}

	public void setOthernames(String othernames) {
		this.othernames = othernames;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNextofkin() {
		return nextofkin;
	}

	public void setNextofkin(String nextofkin) {
		this.nextofkin = nextofkin;
	}

	public String getNextofkinrelation() {
		return nextofkinrelation;
	}

	public void setNextofkinrelation(String nextofkinrelation) {
		this.nextofkinrelation = nextofkinrelation;
	}

	public String getOrigindistrict() {
		return origindistrict;
	}

	public void setOrigindistrict(String origindistrict) {
		this.origindistrict = origindistrict;
	}

	public String getTribe() {
		return tribe;
	}

	public void setTribe(String tribe) {
		this.tribe = tribe;
	}

	public String getHomelanguage() {
		return homelanguage;
	}

	public void setHomelanguage(String homelanguage) {
		this.homelanguage = homelanguage;
	}

	public String getPreferredlanguage() {
		return preferredlanguage;
	}

	public void setPreferredlanguage(String preferredlanguage) {
		this.preferredlanguage = preferredlanguage;
	}

	public Map<String, String> getLanguageproficiency() {
		return languageproficiency;
	}

	public void setLanguageproficiency(Map<String, String> languageproficiency) {
		this.languageproficiency = languageproficiency;
	}

	

	public List<LearningInstitution> getLearninginstitutions() {
		return learninginstitutions;
	}

	public void setLearninginstitutions(List<LearningInstitution> learninginstitutions) {
		this.learninginstitutions = learninginstitutions;
	}

	public Map<String, String> getSkills() {
		return skills;
	}

	public void setSkills(Map<String, String> skills) {
		this.skills = skills;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Map<String, String> getPhonenumbers() {
		return phonenumbers;
	}

	public void setPhonenumbers(Map<String, String> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}

	public Map<String, String> getNextofkinphonenumbers() {
		return nextofkinphonenumbers;
	}

	public void setNextofkinphonenumbers(Map<String, String> nextofkinphonenumbers) {
		this.nextofkinphonenumbers = nextofkinphonenumbers;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getOtherinformation() {
		return otherinformation;
	}

	public void setOtherinformation(Map<String, String> otherinformation) {
		this.otherinformation = otherinformation;
	}
	
	
}
