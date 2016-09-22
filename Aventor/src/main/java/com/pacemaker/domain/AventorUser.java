package com.pacemaker.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.pacemaker.validation.PasswordMatches;
import com.pacemaker.validation.ValidName;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames = { "username" }))
@PasswordMatches(first = "password", second = "confirmpassword", message = "Must match a non-empty password field")
public class AventorUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
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
	@Email
	@NotEmpty(message="How else will you hear about our awesome developments?")
	private String email;
	
	@Column
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull(message = "Please provide a birth date")
	@Past(message="Oh my Gosh, you're from the future?")
	private Date birthday;
	
	
	@Column
	@NotEmpty(message="Please provide a user name")
	private String username;
	
	@Column(name = "enabled", columnDefinition = "BOOLEAN DEFAULT TRUE")
	private Boolean enabled;
	
	@Column	
	@NotEmpty(message="Please enter a secure password")
	private String password;
	
	@Column		
	private String confirmpassword;
	
	@ElementCollection
	private Set<String> phonenumbers = new HashSet<String>(0);
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Address> addresses = new HashSet<Address>(0);
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private Set<AventorRole> role = new HashSet<AventorRole>(0);
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<String> getPhonenumbers() {
		return phonenumbers;
	}
	public void setPhonenumbers(Set<String> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	public Set<AventorRole> getRole() {
		return role;
	}
	public void setRole(Set<AventorRole> role) {
		this.role = role;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	
	
	
}
