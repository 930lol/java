package org.btm.mobileApp;
public class MoblieFactory 
{
	public static ITouch getMobile(String type)
	{
		if(type.equalsIgnoreCase("Vivo"))
		{
			return new VivoImpl();
		}
		else if(type.equalsIgnoreCase("Oneplus"))
		{
			return new OneplusImpl();
		}
		else
		{
			System.err.println("Mobile not found !!!");
		}
		return null;
	}

}
