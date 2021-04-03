package org.btm.mobileApp;

public class VivoImpl implements ITouch
{

	@Override
	public void text() 
	{
		System.out.println("Texting on vivo !!!");
	}
	@Override
	public void call() 
	{
		System.out.println("Calling on vivo !!!");
	}
	@Override
	public void playMusic() 
	{
		System.out.println("Playing music on vivo !!!");
	}
}
