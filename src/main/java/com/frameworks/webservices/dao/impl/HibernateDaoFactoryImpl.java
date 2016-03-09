package com.frameworks.webservices.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.frameworks.webservices.dao.DaoFactory;
import com.frameworks.webservices.dao.IUserDao;

@Component
public class HibernateDaoFactoryImpl implements DaoFactory{
	
	@Autowired
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return this.userDao;
	}
}
