package com.frameworks.webservices.businesslogic.impl;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.frameworks.webservices.businesslogic.IUserLogic;
import com.frameworks.webservices.contract.bean.Customer;
import com.frameworks.webservices.dao.DaoFactory;
import com.frameworks.webservices.dao.model.User;

@Component
public class UserLogicImpl implements IUserLogic{
	
	private static final Logger logger = LoggerFactory.getLogger(UserLogicImpl.class);
	
	@Autowired
	DaoFactory daoFactory;
	
	@Autowired
	Mapper dozerBizLogicMapper;

	public boolean checkIfCustomerExists(Customer customer){
		
		//Map Input Customer Object to User object using Dozer
		User user = dozerBizLogicMapper.map(customer, User.class);
		
		User returnUser = daoFactory.getUserDao().checkUserIfExists(user.getUserName(), user.getPassword());
		if(user != null)
			return true;
		else 
			return false;
	}

	public void createUser() {
		daoFactory.getUserDao().createUser();
	}
}
