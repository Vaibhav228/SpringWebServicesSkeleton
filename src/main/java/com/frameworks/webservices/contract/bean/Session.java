package com.frameworks.webservices.contract.bean;

import java.io.Serializable;

public class Session implements Serializable{
	
	private static final long serialVersionUID = 1L;
	protected String id;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
