package com.frameworks.webservices.contract.bean;

import java.io.Serializable;

public class Locale implements Serializable{

	private static final long serialVersionUID = 1L;
	protected String countryCode;
	protected String languageCode;

	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
}
