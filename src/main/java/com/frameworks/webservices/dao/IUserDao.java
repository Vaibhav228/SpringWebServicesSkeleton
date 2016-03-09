package com.frameworks.webservices.dao;

import com.frameworks.webservices.dao.model.User;

public interface IUserDao {
	
	public User checkUserIfExists(String userName, String password);
	
	public void createUser();
}
