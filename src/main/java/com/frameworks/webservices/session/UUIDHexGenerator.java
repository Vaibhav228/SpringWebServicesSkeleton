package com.frameworks.webservices.session;

import java.io.Serializable;

public class UUIDHexGenerator extends UUIDGenerator{

	public static String newUUID(String channelType){
		return ((String)new UUIDHexGenerator().generate(channelType));
	}
	
	protected String format(int intval){
		String formatted = Integer.toHexString(intval);
		StringBuilder buf = new StringBuilder("00000000");
		buf.replace(8 - formatted.length(), 8, formatted);
		return buf.toString();
	}

	protected String format(short shortval){
		String formatted = Integer.toHexString(shortval);
		StringBuilder buf = new StringBuilder("0000");
		buf.replace(4 - formatted.length(), 4, formatted);
		return buf.toString();
	}

	public Serializable generate(String channelType)
	{
		return channelType + "-" + format(getIP()) + "-" + format(getJVM()) + "-" + format(getHiTime()) + "-" + format(getLoTime()) + "-" + format(getCount());
	}
}
