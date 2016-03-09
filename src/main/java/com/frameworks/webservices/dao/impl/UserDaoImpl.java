package com.frameworks.webservices.dao.impl;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.frameworks.webservices.dao.IUserDao;
import com.frameworks.webservices.dao.model.User;

@Component
public class UserDaoImpl extends BaseDaoHibernateImpl<User,Long> implements IUserDao{

	public Class<User> getEntityClass(){
		return User.class;
	}

	public void createUser() {
		try{
			User user = new User();
			user.setUserName("analyst");
			user.setPassword("analyst");
			user.setRetries(0);
			user.setLoginStatus("L");
			user.setLastUpdateDate(new Date());
			user.setLastLoginDate(new Date());
			user.setCreatedBy("Admin");
			user.setCreatedDate(new Date());
			user.setLastFailedLoginDate(new Date());
			
			getSession().save(user);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}

	public User checkUserIfExists(String userName, String password) {
		try{
		    return ((User)getSession().createQuery("FROM User WHERE userName = :userName AND password = :password").setParameter("userName", userName).setParameter("password", password).uniqueResult());
		}catch(Exception ex){
			System.out.println(ex);
		}
		return null;
	}
}
