package com.pacemaker.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AventorRole {
	
	public static final String AdministratorRole = "ADMIN";
	public static final String UserRole = "USER";
	public static final String SystemAdministratorRole = "SYSADMIN";

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private String rolename;
	@ManyToMany(mappedBy="role")
	private Set<AventorUser> users;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public Set<AventorUser> getUsers() {
		return users;
	}
	public void setUsers(Set<AventorUser> users) {
		this.users = users;
	}
	
	
	
}
