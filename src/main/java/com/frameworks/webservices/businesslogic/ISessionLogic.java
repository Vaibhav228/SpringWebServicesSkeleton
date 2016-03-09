package com.frameworks.webservices.businesslogic;

import com.frameworks.webservices.exception.BusinessLogicException;

public interface ISessionLogic {

	  public String createSession(Object paramObject, String paramString) throws BusinessLogicException;
	  
	  //public boolean verifySession(Object paramObject, String paramString) throws BusinessLogicException;
	  public boolean verifySession(String sessionId) throws BusinessLogicException;
}
