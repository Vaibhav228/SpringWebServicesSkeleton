package com.frameworks.webservices.contract.bean;

import java.io.Serializable;

public class Security implements Serializable{

	private static final long serialVersionUID = 1L;
	protected String clientIp;
	protected Session session;

	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
}
