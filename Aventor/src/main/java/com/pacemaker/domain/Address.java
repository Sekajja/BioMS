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
	@ManyToOne
	private BioData biodata;
	
	
	public Address() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCounty() {
		return county;
	}


	public void setCounty(String county) {
		this.county = county;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getSubcounty() {
		return subcounty;
	}


	public void setSubcounty(String subcounty) {
		this.subcounty = subcounty;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getVillage() {
		return village;
	}


	public void setVillage(String village) {
		this.village = village;
	}


	public String getPostaladdress() {
		return postaladdress;
	}


	public void setPostaladdress(String postaladdress) {
		this.postaladdress = postaladdress;
	}


	public String getAddressname() {
		return addressname;
	}


	public void setAddressname(String addressname) {
		this.addressname = addressname;
	}


	public AventorUser getUser() {
		return user;
	}


	public void setUser(AventorUser user) {
		this.user = user;
	}
	
	public BioData getBiodata() {
		return biodata;
	}


	public void setBiodata(BioData biodata) {
		this.biodata = biodata;
	}
	
	
		
}
