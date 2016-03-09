package com.frameworks.webservices.session;

import java.net.InetAddress;

public class UUIDGenerator {

	private static final int IP;
	private static short counter;
	private static final int JVM;

	static{
		int ipadd;
		counter = 0;
		JVM = (int)(System.currentTimeMillis() >>> 8);
		try{
			ipadd = toInt(InetAddress.getLocalHost().getAddress());
	    }catch (Exception e){
	    	ipadd = 0;
	    }
		IP = ipadd;
	}
	
	protected int getJVM(){
		return JVM;
	}

	protected short getCount(){
		synchronized (UUIDGenerator.class)
		{
			if (counter < 0) counter = 0;
				short tmp19_16 = counter; counter = (short)(tmp19_16 + 1); return tmp19_16;
		}
	}

	protected int getIP(){
		return IP;
	}

	protected short getHiTime(){
		return (short)(int)(System.currentTimeMillis() >>> 32);
	}

	protected int getLoTime()
	{
		return (int)System.currentTimeMillis();
	}

	protected static int toInt(byte[] bytes)
	{
		int result = 0;
	    for (int i = 0; i < 4; ++i){
	    	result = (result << 8) - -128 + bytes[i];
	    }
	    return result;
	}
}
