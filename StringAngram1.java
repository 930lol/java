import java.util.Scanner;

public class StringAngram1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String you want to check it is angram or not:");
		String s1=sc.nextLine();
		System.out.println("Enter the Second String you want to check it is angram or not:");
		String s2=sc.nextLine();
		boolean b=isAngram(s1,s2);
		if(b==true)
			System.out.println("Both the string "+s1+" and "+s2+" are angram");
		else 
			System.out.println("Both the string"+s1+" "+s2+" are not angram ");
	}

	static boolean isAngram(String s1, String s2) 
	{
		int c1[]= countFrequency(s1);
		int c2[]=countFrequency(s2);
		for(int i=0;i<26;i++)
		{
			if(c1[i]!=c2[i])
			{
				return false;
			}
		}
		return true;
	}
	 static int[] countFrequency(String s1) 
	{
		int c[] = new int[26];
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				c[ch-65]++;
			}
			else if(ch>='a'&&ch<='z')
			{
				c[ch-97]++;
			}
		}
		return c;
	}
}