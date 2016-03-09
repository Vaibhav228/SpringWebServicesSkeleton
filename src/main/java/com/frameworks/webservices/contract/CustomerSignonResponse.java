package com.frameworks.webservices.contract;

import java.io.Serializable;

import com.frameworks.webservices.contract.bean.Customer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CustomerSignonResponse extends BaseResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	protected Customer user;
	
	public Customer getUser() {
		return user;
	}
	public void setUser(Customer user) {
		this.user = user;
	}
}