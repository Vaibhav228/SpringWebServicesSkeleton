package com.frameworks.webservices.businesslogic.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.frameworks.webservices.businesslogic.ISessionLogic;
import com.frameworks.webservices.exception.BusinessLogicException;
import com.frameworks.webservices.session.SessionManager;

@Component
public class SessionLogicImpl implements ISessionLogic{

	private static final Logger logger = LoggerFactory.getLogger(SessionLogicImpl.class);

	Map<String, Object> sessionMap = new HashMap<String, Object>();

	public String createSession(Object paramObject, String paramString) throws BusinessLogicException {
		String sessionId = SessionManager.createSesssionId(paramString.toString());
		sessionMap.put(sessionId, "ANON");
		return sessionId;
	}

	public boolean verifySession(String sessionId) throws BusinessLogicException {
		return sessionMap.containsKey(sessionId) ? true : false;
	}
}
