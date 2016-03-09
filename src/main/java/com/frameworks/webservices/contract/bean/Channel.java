package com.frameworks.webservices.contract.bean;

import java.io.Serializable;

public class Channel implements Serializable{
	  
	private static final long serialVersionUID = 1L;
	protected String type;
	protected String name;
	protected String version;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
