package com.frameworks.webservices.contract;

import java.io.Serializable;

import com.frameworks.webservices.contract.bean.Channel;
import com.frameworks.webservices.contract.bean.Locale;
import com.frameworks.webservices.contract.bean.Security;

public class BaseRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	protected Channel channel;
	protected Security security;
	protected Locale locale;
	
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public Security getSecurity() {
		return security;
	}
	public void setSecurity(Security security) {
		this.security = security;
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
}
