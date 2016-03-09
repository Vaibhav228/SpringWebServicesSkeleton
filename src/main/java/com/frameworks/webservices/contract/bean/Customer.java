package com.frameworks.webservices.contract.bean;

import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	protected String email;
	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String dateOfBirth;
	protected List<Role> userRoles;
	protected SecurityDetails securityDetails;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<Role> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(List<Role> userRoles) {
		this.userRoles = userRoles;
	}
	public SecurityDetails getSecurityDetails() {
		return securityDetails;
	}
	public void setSecurityDetails(SecurityDetails securityDetails) {
		this.securityDetails = securityDetails;
	}
}
