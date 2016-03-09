package com.frameworks.webservices.dao;

import com.frameworks.webservices.dao.IUserDao;

public interface DaoFactory {

	public IUserDao getUserDao();
}
