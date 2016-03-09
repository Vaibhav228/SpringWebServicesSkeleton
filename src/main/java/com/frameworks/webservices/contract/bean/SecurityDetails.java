package com.frameworks.webservices.contract.bean;

import java.io.Serializable;

public class SecurityDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	protected String password;
	protected String confirmPassword;

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
