package org.btm.mobileApp;
import java.util.Scanner;
public class Test 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mobile name");
		String type=sc.next();
		sc.close();
		ITouch it = MoblieFactory.getMobile(type);
		if(it!=null)
		{
			it.text();
			it.call();
			it.playMusic();
		}
	}

}
