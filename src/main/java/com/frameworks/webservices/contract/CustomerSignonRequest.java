package com.frameworks.webservices.contract;

import java.io.Serializable;

import com.frameworks.webservices.contract.bean.Customer;

public class CustomerSignonRequest extends BaseRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	protected Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
