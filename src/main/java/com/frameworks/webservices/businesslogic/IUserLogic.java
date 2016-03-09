package com.frameworks.webservices.businesslogic;

import com.frameworks.webservices.contract.bean.Customer;


public interface IUserLogic {
	
	public boolean checkIfCustomerExists(Customer customer);
	
	public void createUser();
}
