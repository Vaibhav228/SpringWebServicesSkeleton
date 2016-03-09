package com.frameworks.webservices.session;

public class SessionManager {
	private static SessionManager instance;

	public static synchronized SessionManager getInstance(){
		if (instance == null) {
			instance = new SessionManager();
		}
		return instance;
	}

	public static String createSesssionId(String channelType)
	{
		return UUIDHexGenerator.newUUID(channelType);
	}
}
